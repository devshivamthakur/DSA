import java.lang.reflect.Method;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Setbits
 */
public class Setbits {
    HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int N = 91376641;
        int P = 270400;
        int Q = 149477;
        // 91376641
        // 417314 163056 16981
        // 541320 287376 916876
        // 345247 707575 279441
        // 201228 864468 58057
        // 951206 54554 22575
        // 270400 149477 91376641
        // 591328 117779 57287701
        // 734196 377456 530212964
        // 907240 461884 379233541
        // 975264 418288 318889801;
        Setbits s = new Setbits();
        int n =3 ;
        int arr[] = { 3,2,5,11};
        System.out.println(s.miniumabsolutesum(n, arr));
        System.out.println(s.ans_("11001010"));
        // System.out.println(s.getSetBits(P, Q, N));

    }

    public int getbinarysets(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        map.put(n, count);

        return count;
    }

    public int getSetBits(int P, int Q, long N) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        for (int i = 1; i <= N; i++) {
            int x = P * getbinarysets(arr.get((i - 1))) + Q;
            arr.add(x);

        }
        return getbinarysets(arr.get(arr.size() - 1));

    }

    public int miniumabsolutesum(int n, int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= arr[arr.length-1]; i++) {
            for(int j=i+1;j<=arr[arr.length-1];j++){
                int sum=0;
                for(int k=0;k<arr.length;k++){
                    sum+=Math.min(Math.abs(arr[k]-i),Math.abs(arr[k]-j));               
                }
                min=Math.min(min,sum);
                

            }
          
        }
       
        //optimize above code
        


        return min;
    }

   
    }


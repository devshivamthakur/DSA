package problems;
import java.util.*;;
public class Stringpermutaion {
    public static void main(String[] args) {
        String s="abcd";
        int arr[]={2,4,3,1};
        System.out.println(stringstringpermutation(s, arr)); //dacbBac

    }
    public static String stringstringpermutation(String s,int arr[]) {
        HashMap<Integer,Character>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], s.charAt(i));
        }
        String ans="";

        for(int i :map.keySet()){
            ans=ans+map.get(i);
        }

        return ans;
        
    }
    
}

/**
 * Gama
 */
import java.util.*;;
class Alpha {
    int i;
    int j;

    Alpha() {
        i = 20;
        j = 22;
    }
}

class Beta extends Alpha {
    Beta() {
        super();
        i = 18;
    }
}

public class Gama {

    public static void main(String[] args) {
        Beta obj = new Beta();
        Gama obj1 = new Gama();
        Alpha obj2 = new Alpha();

        // System.out.println(Gama.findMinimumCharacters("armaze", "amazon"));
        ArrayList<String> list = new ArrayList<String>();
        list.add("011");
        list.add("101");
        list.add("110");
        System.out.println(Gama.getMaximumGreyness(list));

    }

    public static void str(String s) {
        int mlen = 1;
        int beg = 0;
        int len = s.length();
        int low, high;
        for (int i = 0; i < len; i++) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < len && s.charAt(low) == s.charAt(high)) {
                --low;
                ++high;

            }
            ++low;
            --high;
            if (s.charAt(low) == s.charAt(high) && high - low + 1 > mlen) {
                beg = low;
                mlen = high - low + 1;
            }
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len && s.charAt(low) == s.charAt(high)) {
                --low;
                ++high;
            }
            ++low;
            --high;
            if (s.charAt(low) == s.charAt(high) && high - low + 1 > mlen) {
                beg = low;
                mlen = high - low + 1;
            }
        }

        int ans = mlen;
        while (ans > 0)
            ;
        System.out.println(s.charAt(beg++));
    }

    public static int findMinimumCharacters(String searchWord, String resultWord) {
        int searchWord_cnt = 0;
        int resultWord_cnt = 0;
        while (searchWord_cnt < searchWord.length()) {
            if (searchWord.charAt(searchWord_cnt) == resultWord.charAt(resultWord_cnt)) {
                resultWord_cnt += 1;
                if (resultWord_cnt == resultWord.length()) {
                    return 0;
                }
            }
            searchWord_cnt += 1;
        }
        return (resultWord.length() - resultWord_cnt);
    }

    public static int getMaximumGreyness(ArrayList<String>pixels){
        int arr[][]=new int[pixels.size()][pixels.get(0).length()];
        for(int i=0;i<pixels.size();i++){
            for(int j=0;j<pixels.get(0).length();j++){
                arr[i][j]=pixels.get(i).charAt(j)-'0';
            }
        }
        int row1[]=new int[pixels.get(0).length()];
        for(int i=0;i<pixels.size();i++){
            int sum=0;
            for(int j=0;j<pixels.get(0).length();j++){
                sum+=arr[i][j];
                
            }
            row1[i]=sum;
        }
       
        int col1[]=new int[pixels.size()];
        for(int i=0;i<pixels.size();i++){
            int sum=0;
            for(int j=0;j<pixels.get(0).length();j++){
                sum+=arr[j][i];
            }
            col1[i]=sum;
           
        }
        
        int m=arr.length;
        int n=arr[0].length;
        int max=Integer.MIN_VALUE;
        int anx[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                anx[i][j]=0;
            }
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             int x=row1[i];
                int y=col1[j];
                anx[i][j]=2*(x+y)-(m+n);
                max=Math.max(max,anx[i][j]);

            }

        }


        return max;
    }

}
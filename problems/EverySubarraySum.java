package problems;


/**
 * EverySubarraySum
 * 
 */
import java.util.*;
public class EverySubarraySum {

    public static void main(String[] args) {
        int[] arr = {90,60};
        System.out.println(isevensubarraysum(arr));

    }

    public static String isevensubarraysum(int[] arr) {
        // String ans = "yes";
        // int countsum[]=new int[arr.length+1];
        // countsum[0]=0;
        // for(int i=1;i<=arr.length;i++){
        //     countsum[i]=countsum[i-1]+arr[i-1];
        // }
        // for(int i=1;i<=arr.length;i++){
        //     for(int j=i+1;j<arr.length;j=j+2){
        //         System.out.println(countsum[j]-countsum[i-1]);
        //         int sum=countsum[j]-countsum[i-1];
        //         if(sum!=0){
        //             ans="no";
        //             break;
        //         }
        //     }
        // }
       
        // return ans;
        String ans = "yes";
            //0 1 2 3
        for (int i = 0; i < arr.length; i++) { //starting index
            for (int j = i + 1; j < arr.length; j=j+2) { //for ending index          
                int sum = 0;
                for (int k = i; k <= j; k++) { //for sum between starting and ending index
                    sum += arr[k];
                }
                if (sum != 0) {
                    ans = "no";
                    break;
                }
            }
        }
        //

        return ans;

    }
}
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int heights[]) {
        int arr[]=new int[n+1];
        return f(n-1,heights,arr);
        

        // Write your code here..
    }
    
    static int f(int n,int heights[],int arr[]){
        if(n==0){
            return 0;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        int left =f(n-1,heights,arr)+Math.abs(heights[n]-heights[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1){
           right=f(n-2,heights,arr)+Math.abs(heights[n]-heights[n-2]);
        }
        return arr[n]=Math.min(left,right);
        
    }

}

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
       long area = Long.MIN_VALUE;
      
      int[] next = nextSmaller(hist,n);
       int[] prev = prevSmaller(hist,n);
       
    //   System.out.println(Arrays.toString(next));
    //     System.out.println(Arrays.toString(prev));
       
      for(int i=0;i<n;i++){
           
          long length = hist[i];
          if(next[i] == -1){
              next[i] = (int)n;
          }
           
          long breadth = next[i] - prev[i] -1;
          
        // System.out.println(length);
        // System.out.println(breadth);

          area = Math.max(area,length * breadth);
           
           
      }
       
       return area;
       
    }
    
    public static int[] nextSmaller(long hist[], long n){
    
        int[] ans = new int[(int)n];

        Stack<Integer> stack = new Stack<Integer>();
         stack.push(-1);
        
        for(int i= (int)(n-1); i>=0; i--){
            
            long curr = hist[i];
            
            while(stack.peek() != -1 && hist[stack.peek()] >= curr){
                stack.pop();
            }
            
            ans[i] = stack.peek();
            stack.push(i);
            
        }
        
        return ans;
        
    }
    
     public static int[] prevSmaller(long hist[], long n){
    
        int[] ans = new int[(int)n];

        Stack<Integer> stack = new Stack<Integer>();
          stack.push(-1);
        
        for(int i=0; i<n; i++){
            
            long curr = hist[i];
            
            while(stack.peek() != -1 && hist[stack.peek()] >= curr){
                stack.pop();
            }
            
            ans[i] = stack.peek();
            stack.push(i);
            
        }
        
        return ans;
        
    }
        
}




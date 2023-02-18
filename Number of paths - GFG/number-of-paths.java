//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int m = Integer.parseInt(inputLine[0]);
		    int n = Integer.parseInt(inputLine[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.numberOfPaths(m, n));
		}
	}
}




// } Driver Code Ends


class Solution{
    
    long numberOfPaths(int m, int n) {
        
        return solve(m,n);
    }
    
    public int solve(int i,int j){
        if(i==1||j==1){
            return 1;
        }
        
        int up=solve(i-1,j);
        int left=solve(i,j-1);
        
        return up+left;
        
        
        
    }
    
}
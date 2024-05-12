//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer>stack = new Stack<>();
    	
    	//put all element in the stack
    	for(int i=0;i<n;i++){
    	    stack.push(i);
    	}
    	
    	
    	//step2 : run stack until size!=1 and find the possible celebrity
    	while(stack.size() > 1){
    	    int a = stack.peek();
    	    stack.pop();
    	    int b = stack.peek();
    	    stack.pop();
    	    
    	    if(knows(a,b,M)){
    	        stack.push(b);
    	    }else{
    	        stack.push(a);
    	    }
    	     
    	}
    	
    	
    	int ans = stack.peek();
    	
    	
    	//verify the celevrity
    	//check all element in given row must 0
    	for(int i=0;i<n;i++){
    	    if(M[ans][i] != 0) return -1;
    	}
    	
    // 	System.out.println(ans);
    	
    	int colCount = 0;
    	//check column expact same index column must be 0
    	
    	for(int i=0;i<n;i++){
    	    
    	    if(M[i][ans] == 1){
    	        colCount++;
    	    }
    	}
    	
    	if(colCount == n-1){
    	    return ans;
    	}
    	
    	return -1;
    	
    	
    	
    }
    
    public boolean knows(int a , int b,int M[][]){
        return M[a][b] == 1;
    }
}
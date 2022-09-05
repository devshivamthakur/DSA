import java.util.ArrayList;
import java.util.Arrays;

// Java program to find minimum number of
// elements to be removed to make the sum
// even
class MyCdoe {
    
	
	
	// Driver Code
	public static void main(String[] args)
	{
	int n=4;
    int total=10;
    int treenodes[]= {-1,1,2,3};
    System.out.println(mininrootnode(n,total,treenodes));


	}
    public static int  mininrootnode(int n,int total,int treenodes[]) {
        int ans=0;
        int arr[]=new int[n];
        while(total>0) {
            for(int i=0;i<n;i++) {
                arr[i]++;
                if(total==0) {
                    break;
                }
                total--;
            }
        }
        return arr[0];
        
    }
    



}

// This code is contribute by Smitha Dinesh Semwal

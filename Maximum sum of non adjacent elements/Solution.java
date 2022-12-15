import java.util.* ;
public class Solution {
    
    
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int arr[]=new int[nums.size()+1];
        return solve(nums,nums.size()-1,arr);
	
	}
    
    public static int solve(ArrayList<Integer>nums,int index,int []arr){
        if(index==0){
            return nums.get(index);
        }
        if(index<0){
            return 0;
        }
        if(arr[index]!=0){
            return arr[index];
        }
        
        int pick=nums.get(index)+solve(nums,index-2,arr);
        int notpick=0+solve(nums,index-1,arr);
        
        return arr[index]=Math.max(pick,notpick);
    }



}

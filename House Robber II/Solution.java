class Solution {
    
      public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int arr1[]=new int[nums.length];
        Arrays.fill(arr1,-1);
        int ans1=solve(nums,nums.length-2,arr1,0);
        Arrays.fill(arr1,-1);

        int ans2=solve(nums,nums.length-1,arr1,1);

        return Math.max(ans1,ans2);
        
    }

    public int solve(int []nums,int index,int arr[],int picklocation){
        if(picklocation==1&&index==0){
            return 0;
        }
        if(index==picklocation){
            return nums[index];
        }
        if(index<0){
            return 0;
        }
        if(arr[index]!=-1){
            return arr[index];
        }
         int pick=nums[index]+solve(nums,index-2,arr,picklocation);
        int notpick=0+solve(nums,index-1,arr,picklocation);
        
        return arr[index]=Math.max(pick,notpick);
    }

}

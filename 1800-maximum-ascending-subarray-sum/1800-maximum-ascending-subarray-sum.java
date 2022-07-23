class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int prev=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]<prev||prev==nums[j]){
                    break;
                }
                prev=nums[j];
                sum=sum+nums[j];
            }
            maxsum=Math.max(sum,maxsum);
        
        }
        return maxsum;
        
    }
}
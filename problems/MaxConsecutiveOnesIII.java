package problems;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] arr = {1, 1,1, 0, 0, 0,1, 1, 1,1,0};
        int k=2;
        System.out.println(maxConsecutiveOnes(arr,k));
        
    }
    public static int maxConsecutiveOnes(int[] nums,int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                k--;
            }
            

            }


            return 0;
        }


    }
    


import java.util.*;

public class CountNumberofNiceSubarrays {
    public static void main(String[] args) {

        
        int nums[]={2,2,2,1,2,2,1,2,2,2};
        int k=2;
        CountNumberofNiceSubarrays c=new CountNumberofNiceSubarrays();
        System.out.println(c.numberOfSubarrays(nums,k));

    }
    public static void name() {
        // numberof
        
    }
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                nums[i]=1;
            }else{
                nums[i]=0;
            }
        }
        int count=0;
        //solve in n time
        for(int i=0;i<nums.length;i++){
            int j=i;
            int count_=0;
            while(j<nums.length){
                if(nums[j]==1){
                    count_++;
                }
                if(count_==k){
                    count++;
                    break;
                }
                j++;
            }
        }
       






        return count;
        

        
    }
    
}

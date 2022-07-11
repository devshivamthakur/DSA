package problems;

/**
 * SearchInsertPosition
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=7;
        System.out.println(searchInsert(nums, target));
        
    }
    public static int searchInsert(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return mid;
    }
}
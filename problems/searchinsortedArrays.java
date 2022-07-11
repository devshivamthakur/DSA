class searchinsortedArrays {
    
    public static  int findpivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<end){
           if(arr[mid]>=arr[0]){
              start=mid+1;
           }else{
               end=mid;
               
           }
         mid=start+(end-start)/2;
    
        }
        return start;
        
        
    }
    public static int  binarysearch(int[] arr,int target,int start1,int end1){
          int start=start1;
        int end=end1;
        int mid=start+(end-start)/2;
        while(start<=end){
           if(arr[mid]==target){
              return mid;
               
           }else if(arr[mid]<=target){
            start=mid+1;

               
           }else{
            end=mid-1;

           }
         mid=start+(end-start)/2;
    
        }
        return -1;
        
    }
    public static int search(int[] nums, int target) {
        int pivot=findpivot(nums);
        System.out.println(pivot);
        if(nums[pivot]<=target&&target<=nums[nums.length-1]){
            
            return binarysearch(nums,target,pivot,nums.length-1);
                       
        }else{
            return binarysearch(nums,target,0,pivot-1);
            
        }
        
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};

        System.out.print(search(nums, 0));
        
    }
}
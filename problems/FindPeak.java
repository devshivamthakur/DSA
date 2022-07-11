class FindPeak {
    public int findPeakElement(int[] arr){

        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
            
        while(start<=end){
            if(mid>0&& end<=arr.length-2&&  arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid==0) {
                start=(arr.length-1)/2+1;
                end=arr.length-1;
            }else  {
                end=mid-1;

            }

             mid=start+(end-start)/2;
            
            
        }
        return 0;
        
        
    }
public static void main(String[] args) {
        int nums[]={3,1,2};

        System.out.print(new FindPeak().findPeakElement(nums));
        
    }

}
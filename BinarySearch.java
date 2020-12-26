public class BinarySearch 
{
    public boolean isContains( int arr[], int sitem) {
        int length=arr.length;
        int low=0,high=length-1;
        int mid=low+high/2;
        if(length!=0)
        {
            while(low<=high){
                if(arr[mid]==sitem){
                    return true;
                }else{
                    if(arr[mid]<sitem){
                        low=mid+1;
                    }else {
                         high=mid-1; 
                    }
                }
                 mid=low+high/2;
            }
        }
        
        return false;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        BinarySearch bs=new BinarySearch();
        int data=0;
        System.out.println(bs.isContains(arr, data));
    }
}

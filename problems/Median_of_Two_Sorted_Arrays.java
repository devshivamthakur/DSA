package problems;
import java.util.*;;
public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int nums1[]={1,3};
        int nums2[]={2};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       double d=0;
       int nums1index=0;
       int nums2index=0;
       List<Integer>list=new ArrayList<>();
        //merge the sorted array
       while(nums1index<nums1.length&&nums2index<nums2.length){
           //check if nums1[nums1index]<nums2[nums2index]
           if (nums1[nums1index]<nums2[nums2index]) {
               list.add(nums1[nums1index]);
               nums1index++;

           }
           else{
               list.add(nums2[nums2index]);
               nums2index++;
           }

       }
       
       //add the remaining elements from nums1 array
       while(nums1index<nums1.length){
           list.add(nums1[nums1index]);
           nums1index++;
       }
       
       //add the remaining elements from nums2 array
       while(nums2index<nums2.length){
        list.add(nums2[nums2index]);
        nums2index++;
    }
        if(list.size()%2==0){
            d=(list.get(list.size()/2)+list.get(list.size()/2-1))/2.0;
        }
        else{
            d=list.get(list.size()/2);
        }
        return d;

    }
}

package problems;
import java.util.*;
public class twosum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int[] ans=twoSum(arr, target);
        System.out.println(ans[0]+" "+ans[1]);

    }
    static int [] twoSum(int arr[],int target){
        int ans[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                ans[0]=map.get(arr[i]);
                ans[1]=i;
                return ans;
            }
            else{
                map.put(target-arr[i],i);
            }
        }
       
        return ans;

    }
    
}

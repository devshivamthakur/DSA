package problems;

import java.util.HashMap;

public class Test3 {
    public static void main(String[] args) {
        int sum=Integer.MIN_VALUE;
    int arr[]={4,2,4};
    for(int i=0;i<arr.length-1;i++){
        if(sum==Integer.MIN_VALUE){
            sum=arr[i]+arr[i+1];
        }else{
            if(sum!=arr[i]+arr[i+1]){
                break;
            }
        }
    }
    HashMap<Integer,Integer>hs=new HashMap<>();
    for(int i:hs.keySet()){
        if(hs.get(i)>1){
            return true;
        }

    }
    return false;
    System.out.println(sum);
    }
    
}

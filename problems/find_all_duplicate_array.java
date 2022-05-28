package problems;
import java.util.*;
/**
 * find_all_duplicate_array
 */
public class find_all_duplicate_array {
public static void main(String[] args) {
    
    int arr[]={4,3,2,7,8,2,3,1};
    System.out.println(get_duplicate_element(arr));
}
static List<Integer> get_duplicate_element(int arr[]){
    List<Integer>ans=new ArrayList<>();
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            ans.add(arr[i]);
        }
        else{
            map.put(arr[i],1);
        }
    }

    
    
    return ans;

}
}
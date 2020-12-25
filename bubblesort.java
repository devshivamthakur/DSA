
import java.util.Arrays;
/**
 * bubblesort: it is compare one element to another if element is grater than other element than swap
 * 
 * todo: compare to element if arr[0]=1, arr[1]=0 if 1>o thant swap  arr[0]=0 arr[1]=1
 */
public class bubblesort {
  
    public void Sort(int []arr ) {
        int length=arr.length;
        if(length==0){
        System.out.println("Array is empty");
            return;
        }else{
            for(int i=0;i<length;i++){
                  for(int j=i+1;j<length;j++){
                          if(j<length){
                              if(arr[i]>arr[j]) 
                              {
                                int temp;
                                temp=arr[i];
                                 arr[i]=arr[j];
                                 arr[j]=temp;
                              }
                          }
                  }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        bubblesort bs=new bubblesort();
                int arr[]={3,3,5,1,0,4,5,1,2}; // example
        bs.Sort(arr);
    

}


}
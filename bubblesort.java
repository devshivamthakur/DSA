
import java.util.Arrays;
/**
 * bubblesort
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
                int arr[]={3,3,5,1,0,4,5,1,2};
        bs.Sort(arr);
    

}


}
public class JAva1 {
public static void main(String[] args) {
    int sum=-1;
    int arr[]={4,2,4};
    for(int i=0;i<arr.length-1;i++){
        if(sum==-1){
            sum=arr[i]+arr[i+1];
        }else{
            if(sum!=arr[i]+arr[i+1]){
                break;
            }
        }
    }
    System.out.println(sum);
}
    
}

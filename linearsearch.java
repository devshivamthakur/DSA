public class linearsearch {


    public int Search(int arr[],int data)
    {
        int length=arr.length;
        if(arr.length!=0){
           for(int i=0;i<length;i++){
               if(arr[i]==data){
                   return i;
               }
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int data=5;
        linearsearch ln=new linearsearch();
       System.out.println(data+" founded at :"+ ln.Search(arr, data)+" index no");
    }
}

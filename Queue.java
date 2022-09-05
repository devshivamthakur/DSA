public class Queue {
    int Queue[]=new int[10];
    int front=0;
    int rear=-1;
    public void enqueue(int data){
        if(rear==Queue.length-1){
            System.out.println("queue is full");
        }else{
            rear++;
            Queue[rear]=data;
        }
    }
    public void dequeue(){
        if(front==-1){
            System.out.println("queue is empty");
        }else{
            front++;
            Queue[front]=-1;
        }
    }
    public void search(int data){
        int stack_index=front;
    
        while(stack_index>=0){
            if(Queue[stack_index]==data){
                System.out.println("element found at index "+stack_index);
                return;
            }
            stack_index++;
        }
        System.out.println("element not found");
    }
   public int middleoftheQueue(){
         return Queue[front+rear/2];



   }
    
       
       
    public void show() {
        for (int i = 0; i < Queue.length; i++) {
            if(Queue[i]!=0){
                System.out.print(Queue[i]+" ");
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,9,3,5,4,6,2,8};
        Queue q=new Queue();
        for(int i=0;i<arr.length;i++){
            q.enqueue(arr[i]);
        }
        q.show();
        System.out.println();

            q.search(5);
            System.out.println("middle of the queue "+ q.middleoftheQueue());


        
    }
}

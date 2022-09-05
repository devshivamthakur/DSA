public class Stackquestion {
    static int top=-1;
    static int[] stack=new int[10];
    //stack to store the element of the array
public void push(int data){
    if(top==stack.length-1){
        System.out.println("stack is full");
    }else{
        top++;
        stack[top]=data;
    }

}
    
public void pop(){
    if(top==-1){
        System.out.println("stack is empty");
    }else{
        //remove the top element
        stack[top--]=-1;
    }
}
    public int search(int data){
        int stack_index=top;
        while(stack_index>=0){
            if(stack[stack_index]==data){
                return stack_index;
            }
            stack_index--;
        }
        return -1;
    }
    public int middleelement(){
        int stack_index=top;
        int middleelement=-1;
        while(stack_index>=0){
            if(stack_index==top/2){
                middleelement=stack[stack_index];
            }
            stack_index--;
        }
        return middleelement;
        
    }

    public void popelement_before_middle(){
        int middleelement_=middleelement();
        int tempstack[]=new int[top];
        int stack_index=0;

        for(int i=stack.length-1;i>=0;i--){
            if(stack[i]<middleelement_){

                tempstack[stack_index++]=stack[i];
                stack[i]=-1;
                
            }
        }
    for(int i=tempstack.length-1;i>=0;i--){
        if(tempstack[i]>0){
            System.out.print( tempstack[i]+" ");
           
        }
    }
    }
        
  
    
public static void main(String[] args) {
    Stackquestion s=new Stackquestion();
    int arr[]={1,9,3,5,4,6,2,8};
    for(int i=0;i<arr.length;i++){
        s.push(arr[i]);
    }


    System.out.println(s.search(5));
    System.out.println("middle of the stack "+ s.middleelement());
    s.popelement_before_middle();

     
        
        
    }

    
}

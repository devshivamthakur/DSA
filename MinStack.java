import java.util.*;;

class MinStack {
    Stack<Integer> st;
    int last =0;

    public MinStack() {
        st = new Stack<>();

    }

    public void push(int val) {
        st.push(val);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<st.size();i++){
            if(st.get(i)<min){
                min=st.get(i);
            }
        }
        last=min;
        
       


    }

    public void pop() {
       int val= st.pop();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<st.size();i++){
            if(st.get(i)<min){
                min=st.get(i);
            }
        }
        last=min;
        

    }

    public int top() {
        return st.peek();

    }

    public int getMin() {
        return last;
       
    }
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.top());
        System.out.println(ms.getMin());


    
    }
}


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
  
}

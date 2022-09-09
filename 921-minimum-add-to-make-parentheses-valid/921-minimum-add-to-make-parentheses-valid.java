class Solution {
    public int minAddToMakeValid(String s) {
         int count=0;
        
        //first way
        // int open=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('){
        //         open++;
        //     }
        //     else if(s.charAt(i)==')'){
        //         if(open==0){
        //             count++;
        //         }
        //         else{
        //             open--;
        //         }
        //     }
        // }
        // return count+open;
        
        
        //second way
        
        
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else if(s.charAt(i)==')'){
                if(st.size()==0){
                    count++;
                }
                else{
                    st.pop();
                }
            
               
            }
        }


          return count+st.size();
    }
}
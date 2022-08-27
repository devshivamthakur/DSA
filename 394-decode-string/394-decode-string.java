class Solution {
    public String decodeString(String s) {
         Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==']'){
                String temp="";
                while(st.peek()!='['){
                    temp=st.pop()+temp;
                }
                st.pop();
                String times="";

                while(!st.isEmpty()&& st.peek()>='0'&&st.peek()<='9'){
                    times=st.pop()+times;
                }
                    
                
                // int times=st.pop()-'0';
                String ans_="";
                for(int j=0;j<Integer.parseInt(times);j++){
                    ans_=ans_+temp;
                }
                for(int k=0;k<ans_.length();k++){
                    st.push(ans_.charAt(k));
                }
            }else{
                st.push(s.charAt(i));
            }
            
        }
        //stack to string
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        // System.out.println(st);
        return ans;
        
        
    }
}
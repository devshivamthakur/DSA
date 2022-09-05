class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st1=new Stack();
        Stack<Character>st2=new Stack();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }else if(!st1.empty()){
                st1.pop();
            }
        }
        
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }else if(!st2.empty()){
                st2.pop();
            }
            
            
        }
        
        
        s=String.valueOf(st1);
        t=String.valueOf(st2);
        if(s.equals(t)){
         return true;   
        }else{
            return false;
        }
            

        
            
       
        
    }
}
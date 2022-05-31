package problems;
import java.util.*;
public class Paranthasis_balenced {
    public static void main(String[] args) {
        String s="([]){";
        System.out.println(isValid(s));
        
    }
        public static boolean isValid(String s) {
            Stack<Character> st=new Stack<>();
            boolean res=false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                    st.push(s.charAt(i));
                        
                }else{
                    if(st.isEmpty()){
                        return false;
                    }else{
                        if(!check_parn(s.charAt(i),st)){
                            return false;
                        }else{
                            res=true;
                        }
                        
                    }
                }
                
            }
            if (!st.isEmpty()){
                return false;
            }
            return res;
        }
        
        static boolean check_parn(char c,Stack<Character> st){
            switch(c){
                case ')':
                    if(st.pop()=='('){
                        return true;
                    }
                    return false;
                case '}':
                    if(st.pop()=='{'){
                        return true;
                    }
                    return false;
                case ']':
                    if(st.pop()=='['){
                        return true;
                    }
                    return false;  
                    
            }
           return false; 
        }
        
    
}

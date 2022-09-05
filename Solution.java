/**
 * Solution
 */
import java.util.*;
public class Solution {

      public List<Integer> findAnagrams(String s, String p) {
        List <Integer> ans=new ArrayList<>();
        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> p_map = new HashMap<>();
        for(int i=0; i<p.length(); i++){
            if(p_map.containsKey(p.charAt(i))){
               p_map.put(p.charAt(i), p_map.get(p.charAt(i))+1);
            }
            else{
                p_map.put(p.charAt(i), 1);
                
            }
            if(s_map.containsKey(s.charAt(i))){
               s_map.put(s.charAt(i), s_map.get(s.charAt(i))+1);
            }
            else{
                s_map.put(s.charAt(i), 1);
                
            }
        }
        
        for(int i=0; i<s.length()-p.length(); i++){
             if(p_map.equals(s_map)){
            ans.add(i);
            
        }
            if(s_map.get(s.charAt(i))!=null && s_map.get(s.charAt(i))==1){
                s_map.remove(s.charAt(i));
            }
               else{
                   s_map.put(s.charAt(i), s_map.get(s.charAt(i))+1);
               }
            if(s_map.containsKey(s.charAt(i+p.length()))){
               s_map.put(s.charAt(i+p.length()), s_map.get(s.charAt(i+p.length()))+1);
            }
            else{
                s_map.put(s.charAt(i+p.length()), 1);
                
            }
              
               
            
        }
        if(p_map.equals(s_map)){

            ans.add(s.length()-p.length());
        }
        return ans;
        
    
    } 
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.findAnagrams("cbaebabacd","abc"));
    }
    
}
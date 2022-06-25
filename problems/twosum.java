package problems;
import java.util.*;
class Solution {
    
    public int[] plusOne(int[] digits) {
        String s = "";
        for(int i=0; i<digits.length; i++){
            s+=Integer.toString(digits[i]);
            
        }
        int n=Integer.parseInt(s)+1;
        s=Integer.toString(n); //124
        int[] a = new int[s.l];
        for(int i=0; i<s.length; i++){
            a[i]=Integer.parseInt(s.charAt(i));
        }
        return a;
        
        
        
        
        
        
        
    }
}

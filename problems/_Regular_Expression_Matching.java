package problems;
import java.util.regex.*; 

public class _Regular_Expression_Matching {
    public static void main(String[] args) {
        String s = "aa";
        String p = "a*";
        System.out.println(isMatch(s, p));
        
    }

    static boolean isMatch(String s,String pattern){
        return Pattern.matches(pattern,s);
        // Collections.sort(new ArrayList<>());
    }
    
}

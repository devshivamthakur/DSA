package problems;

public class Longest_Substring_Without_Repeating_Characters {
    public static boolean check_string_same(String s, int start,int end){
        for (int i = start; i <= end; i++) {
        for (int j = i + 1; j <=end; j++) {
            if (s.charAt(i) == s.charAt(j)) {
                return true;
            }
        }
    }
    return false;
        
    }
    
    static int lengthOfLongestSubstring(String s) {
        int max_length=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(!check_string_same(s,i,j)){
                    max_length=Math.max(max_length,j-i+1);
                    
                }
                
            }
        }
        return max_length;
        
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    
}

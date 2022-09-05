class Solution {
    public boolean check_string_same(String s, int start,int end){
        for (int i = start; i <= end; i++) {
        for (int j = i + 1; j <=end; j++) {
            if (s.charAt(i) == s.charAt(j)) {
                return true;
            }
        }
    }
    return false;
        
    }
    
    public int lengthOfLongestSubstring(String s) {
        int max_length=0;
        int j=0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0;i<s.length();i++){
            
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
             map.put(s.charAt(i),i);
            max_length=Math.max(max_length,i-j+1);

        }
        return max_length;
        
    }
}
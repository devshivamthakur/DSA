class Solution {
    public int minAddToMakeValid(String s) {
         int count=0;
        int open=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else if(s.charAt(i)==')'){
                if(open==0){
                    count++;
                }
                else{
                    open--;
                }
            }
        }
        return count+open;
    }
}
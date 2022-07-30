class Solution {
    public boolean isLongPressedName(String name, String typed) {
           int j=0;
        int n=name.length();
        int m=typed.length();
        
        for(int i=0;i<m;i++){
            if(j<n&& typed.charAt(i)==(name.charAt(j))){
                j++;
            }
            else if (j==0||typed.charAt(i)!=(name.charAt(j-1))){
                return false;
                
            }
            
            
            
        }
        System.out.println(j);
       return j==n;
   
    }
}
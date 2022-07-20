import java.util.*;;
public class FindallAnagraminstring {

    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        System.out.println(findAnagrams(s,p).toString());

        
    }
    public static List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) {
           return new ArrayList<>();
       }
      ArrayList<Integer>ans=new ArrayList<>();
       int s_len=s.length();
       int p_len=p.length();
       HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>s_map=new HashMap<>();

   
       for(int i=0;i<p_len;i++){
          map.put(p.charAt(i), (map.get(p.charAt(i)) != null) ? map.get(p.charAt(i)) + 1 : 1);
           s_map.put(s.charAt(i), (s_map.get(s.charAt(i)) != null) ? s_map.get(s.charAt(i)) + 1 : 1);
       }
       
       
       
       for(int i=0;i<s_len-p_len;i++) {
           
           if(map.equals(s_map)){
               ans.add(i);
               
           }
           
           if(s_map.get(s.charAt(i)) !=null&&s_map.get(s.charAt(i))==1){
               s_map.remove(s.charAt(i));
           }else{
               s_map.put( s.charAt(i),s_map.get(s.charAt(i))-1);
           }
           
           
           
          if(s_map.containsKey(s.charAt(i+p_len))){
               
               
               s_map.put( s.charAt(i+p_len),s_map.get(s.charAt(i+p_len))+1);
               
           }else{
               s_map.put(s.charAt(i+p_len),1);
           }  
           
        
           
           
       }
       
       if(map.equals(s_map)){
           
           
           ans.add(s_len-p_len);
           
       }
           
       return ans;
       
   }

}

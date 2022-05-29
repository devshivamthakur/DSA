package problems;
import java.util.*;
public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
    static boolean check_pallindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

    static String longestPalindrome(String s){
        String ans="";
        HashMap<String,Boolean>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(map.containsKey(sub)){
                    continue;
                }else{
                    boolean res=check_pallindrome(s, i, j);
                    if(res){ //check if the substring is a palindrome
                        if(ans.length()<(j-i+1)){ //check if the substring is the longest palindrome
                            ans=sub;
                        }
                    }
                    map.put(sub, res);
                }
               

            }
        }
        return ans;
    } 
    }
    


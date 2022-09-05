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
        int[] a = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            a[i]=Integer.parseInt(s.charAt(i));
        }
        return a;
        
        
        
        
        
        
        
    }

    public static void  merge(int []arr,int arr2[]) {
        int arr3[]=new int[arr.length+arr2.length];
        int index1=0,index2=0,i=0;
        while(index1>arr.length&&index2>arr2.length){
            if(arr[index1]<arr2[index2]){
                arr3[i]=arr[index1];
                index1++;
            }else{
                arr3[i]=arr2[index2];
                index2++;
            }
            i++;

            }
        }

        }

        
    


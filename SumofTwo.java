import java.math.BigInteger;
import java.util.Scanner;

/**
 * SumofTwo
 */
public class SumofTwo {

    public static void main(String[] args) {
      int initialEnergy=5;
      int initialExperience=3;
      int energy[]={1,4};
        int experience[]={2,5};
        System.out.println( minNumberOfHours(initialEnergy, initialExperience, energy, experience));
        System.out.println(largestpallindrome("444947137"));
      

    }
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int need=0;
        int energysum=0;
        for(int i=0;i<energy.length;i++){
            energysum=energysum+energy[i];
        }
        while (initialEnergy<=energysum){
            need++;
            initialEnergy++;
            
        }


        for(int i=0;i<energy.length;i++){
            
            
            if(experience[i]>=initialExperience){
                int need1=experience[i];
                while (initialExperience<=need1) {
                    need++;
                    initialExperience++;
                }
                // System.out.println("ini "+ initialExperience);
                
            }
            
            if(energy[i]<initialEnergy&&experience[i]<initialExperience){
                initialExperience=initialExperience+ experience[i];
                initialEnergy=initialEnergy-energy[i];
            
            }
           
            
        }
        return need;
        
    }
  
    public static String finsum(String X, String Y){
        StringBuilder ans=new StringBuilder();
        int carry=0;
        String Num1=X.length()>Y.length()?X:Y; //bigger length
        String Num2=X.length()>Y.length()?Y:X;  //smaller length
        int j=Num2.length()-1;
        for(int i=Num1.length()-1;i>=0;i--){
            int n2=j>-1?Num2.charAt(j)-'0':0;
            int sum=carry+(Num1.charAt(i)-'0')+n2;
            carry=sum/10; //left part
            ans.append(sum%10); //right part
            j--;
        }
        if(carry>0){
            ans.append(carry);
        }
        while(ans.length()!=0&&ans.charAt(ans.length()-1)=='0'){
            ans.deleteCharAt(ans.length()-1);
        }
        String ans1=ans.reverse().toString();
                       
        return ans1.length()==0? "0":ans1;

    }
public static String largestpallindrome(String X){
    String ans="";
    while(X.length()!=0&&X.charAt(0)=='0'){
        X=X.substring(1);
        
    }
    int opsize = (int)Math.pow(2, X.length());
       
    for (int counter = 1; counter < opsize; counter++)
    {
       String sum = "";
        for (int j = 0; j < X.length(); j++)
        {
            
            if (BigInteger.valueOf(counter).testBit(j)){
                sum = sum + X.charAt(j);
               
            }
                
        }
        if(sum=="4449477"){
            System.out.println("g");
        }
        if(sum.length()>ans.length()&&isPalindrome(sum)){
            ans=sum;
        }
        
    }
    return ans;
}
public static boolean isPalindrome(String X){
    int i=0;
    int j=X.length()-1;
    while(i<j){
        if(X.charAt(i)!=X.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
}
}

package problems;

public class Roman_to_integer {
    public static void main(String[] args) {
        
        String s="III";
        System.out.println(romanToInt(s));

    }
    public static int romanToInt(String s) {
        int ans=0;
        int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman={ "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<nums.length;i++){
            while(s.startsWith(roman[i])){
                ans+=nums[i];
                s=s.substring(roman[i].length());
                System.out.println(s);
            }
        }
        return ans;
    }
    
}

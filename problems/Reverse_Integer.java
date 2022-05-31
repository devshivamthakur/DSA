package problems;

public class Reverse_Integer {
    public static void main(String[] args) {
        int num=1534236469;
        System.out.println(reverse(num));
    }
    public static int reverse(int x) {
        int res=0;
        while(x!=0){
            int pop=x%10;
            x=x/10;
            if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&pop>7)){ //7 is the max value of int /overflow 32 bit
                return 0;
            }
            if(res<Integer.MIN_VALUE/10||(res==Integer.MIN_VALUE/10&&pop<-8)){ //-8 is the min value of int //overflow -32 bit
                return 0;
            }
            res=res*10+pop;
        }
        return res;
    }
    
}

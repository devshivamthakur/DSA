import java.util.Scanner;
import java.math.BigInteger;

/**
 * Solution1
 */
public class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//no of fuel
        int M = sc.nextInt(); //total money hari has
        int[] fuelprice = new int[N];
        int[] Volumeoffuel = new int[N];
        for(int i=0;i<N;i++){
            fuelprice[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            Volumeoffuel[i] = sc.nextInt();
        }
        
        System.out.println(Maxiumvolume(fuelprice,Volumeoffuel,M));
    }
    public static int Maxiumvolume(int[] fuelprice,int[] Volumeoffuel,int totalmoney){
        int max = 0;
        int opsize = (int)Math.pow(2, Volumeoffuel.length);
       
        for (int counter = 1; counter < opsize; counter++)
        {
            int sum = 0;
            int vsum = 0;
            for (int j = 0; j < fuelprice.length; j++)
            {
                
                if (BigInteger.valueOf(counter).testBit(j)){
                    sum += fuelprice[j];
                    vsum += Volumeoffuel[j];
                }
                    
            }
            if(sum <= totalmoney ){
                max = vsum;
            }
        }
        //
           
        return max;
    }

}
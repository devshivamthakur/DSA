import java.util.ArrayList;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TestCases = in.nextInt();
        int arr[] = new int[TestCases];

        for (int i = 0; i < TestCases; i++) {
            arr[i]=in.nextInt();         

        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Case #" + (i + 1) + ": " + maxScoreofBot(arr[i]));
        }
        in.close();
        
    }
    public static int maxScoreofBot(int Cells){
        ArrayList<Integer> BotFilled=new ArrayList<>();
        ArrayList<Integer> johnfilled=new ArrayList<>();
        int arr[]=new int[Cells];
        
        int move=0;
        int i=0;
        for( i=0;i<Cells;i++){
            if( validsells(i,arr)){
                if (move%2==0){
                    BotFilled.add(i);
                }else{
                    johnfilled.add(i);
                }
                move++;
                arr[i]=1;
               
            }

           
        }
        return BotFilled.size();
    }
    public static boolean validsells(int index,int arr[]){
        //check if adjacent cells are filled
        if(index==0){
            return true;
        }
        if(index==arr.length-1&&arr[index-1]==0){
            return true;
        }
        
        if(index+1<arr.length&&arr[index+1]==0&&arr[index-1]==0){
            return true;
        }
        return false;
        

    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTestCases = sc.nextInt();
        for (int i = 0; i < nTestCases; i++) {
           int n = sc.nextInt(); //no of students
           int [] ratings = new int[n];
              for (int j = 0; j < n; j++) {
                ratings[j] = sc.nextInt();
              }
              ArrayList<Integer> arr = getAllPossible(ratings);
              System.out.print("Case #" + (i + 1) + ": ");
                for (int j = 0; j < arr.size(); j++) {
                    System.out.print(arr.get(j) + " ");
                }


              


        }
    }
    public static ArrayList<Integer> getAllPossible(int[] ratings){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < ratings.length; i++) {
            int max=-1;
            for (int j = 0; j < ratings.length; j++) {
                
            
                if(ratings[j]!=ratings[i]&& ratings[j]<=2*ratings[i]){
                    max = Math.max(max, ratings[j]);
                }
                
            }
            ans.add(max);
           
        }

                
        return ans;
    }
    
}

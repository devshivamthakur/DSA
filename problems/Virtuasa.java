
import java.util.HashSet;
import java.util.Scanner;



public class Virtuasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(count_uniquepair(arr, n));
    }

    public static int count_uniquepair(int a[], int n) {
        HashSet<Integer> visited1 = new HashSet<Integer>();
 
        int un[] = new int[n];
        un[n - 1] = 0;
 
        int count = 0;
        for (int i = n - 1; i > 0; i--) {
            if (visited1.contains(a[i]))
                un[i - 1] = count;
            else
                un[i - 1] = ++count;
             visited1.add(a[i]);
        }
 
        HashSet<Integer> visited2 = new HashSet<Integer>();
 
        int answer = 0;
        for (int i = 0; i < n - 1; i++) {

            if (visited2.contains(a[i]))
                continue;
 
            answer += un[i];
 
            visited2.add(a[i]);
        }
        return answer;

       
    }
}
package problems;

import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.*;

/**
 * DecodeString
 */
public class DecodeString {

    public static void main(String[] args) {
        String s = "100[leetcode]";
        int arr[] = { 50896470,87368388,42028793 };

        System.out.println(rearrange(arr, arr.length));

    }

    public static int rearrange(int arr[], int n) {
        // First step: Increase all values by (arr[arr[i]]%n)*n
        // Create an auxiliary array of same size
        int[] tempArr = new int[n]; // To store modified array

        Arrays.sort(arr);

        int ArrIndex = 0;
        int i, j;

        // Traverse from begin and end simultaneously
        for (i = 0, j = n - 1; i <= n / 2 || j > n / 2; i++, j--) {
            if (ArrIndex < n) {
                tempArr[ArrIndex] = arr[i];
                ArrIndex++;
            }

            if (ArrIndex < n) {
                tempArr[ArrIndex] = arr[j];
                ArrIndex++;
            }
        }
        for (i = 1; i < n; i = i + 2) {
            if (i + 1 < n) {
                int temp = tempArr[i];
                tempArr[i] = tempArr[i + 1];
                tempArr[i + 1] = temp;
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(tempArr));

        // Copy temp back to arr[]

        int sum[] = new int[n];
        sum[0] = arr[0];
        for (j = 1; j < n; j++) {
            sum[j] = arr[j] + sum[j - 1];
        }
        int count = 1;
        for (i = 1; i < n; i++) {
            if (arr[i] >= sum[i - 1]) {
                count++;

            } else {
                return count;
            }

        }

        return count;

    }
}
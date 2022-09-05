import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        int j = 1, num1 = 4;
        while (++j <= 10) {
            num1++;
        }
        System.out.println(num1);
    }

    public static String getShortestPallindrom(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            String temp = str.substring(0, i + 1);
            if (isPallindrom(temp) && isPallindrom(str + temp)) {

                ans = temp;
                break;
            }
        }

        return ans;
    }

    public static boolean isPallindrom(String str) {
        // int i = 0;
        // int j = str.length() - 1;
        // while (i < j) {
        // if (str.charAt(i) != str.charAt(j)) {
        // return false;
        // }
        // i++;
        // j--;
        // }
        // return true;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }

}

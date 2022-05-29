package problems;

public class Zigzagconvertion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
    }

    private static String convert(String s, int numrows) {
        if (numrows == 1) {
            return s;
        }
        String ans = "";
        int steps=numrows*2-2;
        for(int i=0;i<numrows;i++){ //run loop for each row
            for(int j=0;j+i<s.length();j+=steps){ //run loop for each column
                ans+=s.charAt(j+i);
                if(i!=0&&i!=numrows-1&&j+steps-i<s.length()){  //check if the column is in the middle
                    ans+=s.charAt(j+steps-i);
                }
            }
        }
        return ans;
   
    }
   
}

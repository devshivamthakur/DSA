import java.util.ArrayList;
import java.util.List;

// Java implementation of the approach
class Count {

    public static int generateallpossible(String s) {
        int cnt = 1;
        int len = s.length();
        List<String> list = new ArrayList<String>();
        list.add("");
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                System.out.print(s.substring(i, j +1)+" ");
                cnt++;

            }
        }
        System.out.println(list);
        System.out.println(list.size());
        return cnt;
    }

    public static void main(String[] args) {

        Integer arr[] = new Integer[1];
        arr[0] = null;
        System.out.println(arr.length);
        generateallpossible("abab");

    }

    static int limit_red = 0;
    static int limit_blue = 0;

static int getans(int total,int red,int blue,int r,int b)
{
if((red+blue)==0)
{
return 1;
}
//fill red
int x=0;
if(red>0&&r>0)
{
x=getans(total-1,red-1,blue,r-1,limit_blue);
}
// fill blue
int y=0;
if(blue>0&&b>0)
{
y=getans(total-1,red,blue-1,limit_red,b-1);

 }
 return x+y;
}

  
}

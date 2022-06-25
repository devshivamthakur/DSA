import java.util.*;

class test {

    public static void main(String[] args) {
        // [[2,3],[2,2],[3,3],[1,3],[5,7],[2,2],[4,6]]
        int arr[][] = {
            {2,3},
            {2,2},
            {3,3},
            {1,3},
            {5,7},
            {2,2},
            {4,6}
        };
        System.out.println(merge(arr));

    }

    static int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
    for(int num[]: arr) {
        System.out.println(Arrays.toString(num));
    }
        int start = 0;
        int end = 0;
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] num : arr) {
            list.add(num);
        }
        int i = 1;
        start = list.get(0)[0];
        end = list.get(0)[1];
        while (i < list.size()) {
            int start2 = list.get(i)[0];
            int end2 = list.get(i)[1];
            boolean status=true;
            if (end >= start2) {
                list.set(i - 1, new int[] { start, Math.max(end, end2) });
                list.remove(i);
                status=false;
                
            } else{
                start=start2;

            }
             if (end < end2) {
                end = end2;

            }
            if(status){
                i++;
            }

        }
        System.out.println(i);
        int j = 0;
        int[][] res = new int[list.size()][2];
        for (int[] num : list) {
            res[j] = num;
            System.out.println(num[0] + " " + num[1]);
        }

        return res;
    }

}
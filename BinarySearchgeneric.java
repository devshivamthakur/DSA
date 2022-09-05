import java.util.Arrays;

public class BinarySearchgeneric<T extends Comparable<T>>  {
    public int BinarySearch(T[] arr, T key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].compareTo(key) == 0) {
                return mid;
            }
            if (arr[mid].compareTo(key) > 0) {
                high = mid - 1;
            }
            if (arr[mid].compareTo(key) < 0) {
                low = mid + 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        BinarySearchgeneric<Integer> bs = new BinarySearchgeneric<>();
        Integer[] arr = {1,4,3,5,2};
        Arrays.sort(arr);
        System.out.println(bs.BinarySearch(arr, 5));
        System.out.println(bs.BinarySearch(arr, 8));
        
        BinarySearchgeneric<String> bs1 = new BinarySearchgeneric<>();
        String str[]={"Pepsi","Coca-cola","Limka","Fanta","Sprite"};
        Arrays.sort(str);

        System.out.println(bs1.BinarySearch(str, "Sprite"));
        System.out.println(bs1.BinarySearch(str, "Slice"));
        
    }
    
    
}

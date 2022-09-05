
/**
 * SelectionSortGeneric
 */
public class SelectionSortGeneric <T extends Comparable<T>> {
    public void SelectionSort_asc(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            T temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public void SelectionSort_desc(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) > 0) {
                    min = j;
                }
            }
            T temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        
    }
    
}
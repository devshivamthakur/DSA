public class InsertionSortGeneric<T extends Comparable<T>> {
    public void insertionsort_asc(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(temp) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    public void insertionsort_desc(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(temp) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        InsertionSortGeneric<Integer> is = new InsertionSortGeneric<>();
        Integer[] arr = {1,4,3,5,2};
        is.insertionsort_asc(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        is.insertionsort_desc(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        InsertionSortGeneric<String> is1 = new InsertionSortGeneric<>();
        String str[]={"Pepsi","Coca-cola","Limka","Fanta","Sprite"};
        is1.insertionsort_asc(str);
        System.out.println();
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
        System.out.println();
        is1.insertionsort_desc(str);
        System.out.println();
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
        
    }

    
}

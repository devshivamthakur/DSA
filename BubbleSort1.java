public class BubbleSort1<T extends Comparable<T>> {

    public  void bubblesort_asc (T[] arr ) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        
    }

    public void bubblesort_desc(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
    }
   
//bubble sort generic method for string  and integer


    public static void main(String[] args) {
        BubbleSort1<Integer> bs = new BubbleSort1<>();
        Integer[] arr = {1,4,3,5,2};
        bs.bubblesort_asc(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        bs.bubblesort_desc(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        BubbleSort1<String> bs1 = new BubbleSort1<>();

        String str[]={"Pepsi","Coca-cola","Limka","Fanta","Sprite"};
        bs1.bubblesort_asc(str);
        System.out.println();
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
        System.out.println();
        bs1.bubblesort_desc(str);
        System.out.println();
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
    
}

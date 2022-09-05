public class LinerSearchGeneric<T extends Comparable<T>> {
    public int LinearSearch(T[] arr, T key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        LinerSearchGeneric<Integer> ls = new LinerSearchGeneric<>();
        Integer[] arr = {1,4,3,5,2};
        System.out.println(ls.LinearSearch(arr, 5));
        System.out.println(ls.LinearSearch(arr, 8));

        LinerSearchGeneric<String> ls1 = new LinerSearchGeneric<>();
        String str[]={"Pepsi","Coca-cola","Limka","Fanta","Sprite"};
        System.out.println(ls1.LinearSearch(str, "Sprite"));
        System.out.println(ls1.LinearSearch(str, "Slice"));

    }
    
}

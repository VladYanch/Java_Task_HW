import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
//        First level: Есть массив положительных целых чисел.
//        Найти элемент (если он есть), который  встречается в массиве >length/2 (доминантный элемент).
//        В противном случае вернуть -1
        int[] arr = new int[]{2, 8, 3, 3, 3, 3, 3, 3, 6, 8};
        System.out.println(domElFinder(arr)); // вернет 3

        int[] arr1 = new int[] {4, 2, 4, 1, 4, 4, 3, 5, 4, 4};
        System.out.println(domElFinder(arr1)); // вернет 4

        int[] arr2 = new int[]{4, 3, 4, 3, 3, 4, 3, 3, 4, 4};
        System.out.println(domElFinder(arr2)); // вернет -1
    }

    public static int domElFinder(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.merge(arr[i], 1, Integer::sum);
            if (map.get(arr[i]) > arr.length / 2) return arr[i];
        }
        return -1;
    }
}
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 2, 3);
//        System.out.println(arr);
//        System.out.println("Индекс: " + findIndex(arr));
//        arr = Arrays.asList(3, 2, 1, 1, 4);
//        System.out.println(arr);
//        System.out.println("Индекс: " + findIndex(arr));
//        arr = Arrays.asList(3, 1, 1, 5, 1, 1, 1, 1, 1);
//        System.out.println(arr);
//        System.out.println("Индекс: " + findIndex(arr));

        arr = Arrays.asList(3, 1, 1, 5, 1, 1, 1, 11, 1);
        System.out.println(arr);
//        double start = System.nanoTime()*1000000000.0;
        System.out.println("Индекс: " + findIndex(arr));
//        double finish = System.nanoTime()*1000000000.0;
//        System.out.println(finish-start);
    }

    private static int findIndex(List<Integer> arr) {
        if (arr.size() < 3) return -1;
        int leftSum = 0;
        int rightSum = 0;
        int index = arr.size() / 2;

        for (int i = 0; i < index; i++) {
            leftSum += arr.get(i);
        }
        for (int i = index + 1; i < arr.size(); i++) {
            rightSum += arr.get(i);
        }

        for (int i = 0; i < arr.size() / 2; i++) {
            if (leftSum < rightSum) {
                leftSum += arr.get(index);
                rightSum -= arr.get(index + 1);
                index++;
            } else if (leftSum > rightSum) {
                leftSum -= arr.get(index - 1);
                rightSum += arr.get(index);
                index--;
            } else return index;
        }
        return 0;
    }
}
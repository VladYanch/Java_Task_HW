import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> listMain = Arrays.asList(1,5,8,17,34,25,3,6,9,22,15);
        int n = 10;
        System.out.println(listMain);
        System.out.println(n);
        System.out.println(withoutElementsMoreThanN(listMain,n));
    }
    //Есть лист  целых чисел.
    // Написать метод, который вернет список без элементов, больше числа n.
    //public List withoutElementsMoreThanN(List ints, int n)

    public static List withoutElementsMoreThanN(List<Integer> list, int n) {

        List<Integer> listNew = new ArrayList<>();

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) < n) listNew.add(list.get(i));
        }
        list = listNew;

        return list;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("bb","a","ff","ddd");
        List<String> list2 = Arrays.asList("bb","aaa","ff","d");
        System.out.println(listExplorer(list1));
        System.out.println(listExplorer(list2));
    }
    //5*.Написать метод, который возвращает строку, встречающуюся раньше в листе: самую
    // короткую или самую длинную. Если несколько строчек самые короткие или самые длинные,
    // тогда вернуть первую встреченную  из них. Лист не пустой
    //"bb","a","ff","ddd" -> "a"
    //"bb","aaa","ff","d" -> "aaa"
    public static String listExplorer(List<String> list) {
        int small = 0;
        int big = 0;
        String resSmall = list.get(0);
        String resBig = list.get(0);

        for (int i = 1; i < list.size()-1; i++) {
            if (list.get(i).length() > resBig.length()) {
                resBig=list.get(i);
                big=i;
        }
            if (list.get(i).length() < resSmall.length()) {
                resSmall=list.get(i);
                small=i;
            }
        }

        return big > small ? resBig : resSmall ;
    }
}
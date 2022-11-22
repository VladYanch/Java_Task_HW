import java.util.*;

public class Main {
//    First level: Есть класс Employee  с полями  id, name, age, salary.
//    Сделать его comparable по id,    сделать дополнительные
//    возможности сортировки по: salary, age, name,
//    а также компаратор   ageAndThenName ( в этом случае сортировка происходит по возрасту,
//    но если возраст одинаковый то   сортируется  по имени.
//    Т.е. в случае Антон,22года и Елена 22 года сначала в списке будет идти Антон).
//    Создать лист таких сотрудников и вывести его на экран,
//    отсортированный в соответствии с вышеуказанными способами.
//    Для сортировки использовать метод   Collections.sort
    public static void main(String[] args) {

        Emploee em1 = new Emploee(3,"Petrov", 22, 6000);
        Emploee em3 = new Emploee(1,"Sidorov",25, 7000);
        Emploee em2 = new Emploee(2,"Ivanov", 28, 5000);
        Emploee em4 = new Emploee(4,"Vasiliy",25, 8000);

        Emploee[] emp = new Emploee[]{em1,em2,em3,em4};
        System.out.println("-------------Source--------------------");
        printArr(emp);
        System.out.println("-------------Sort by id----------------");
        Arrays.sort(emp);
        printArr(emp);
        System.out.println("-------------Sort by Name--------------");
        Arrays.sort(emp,new SortByName());
        printArr(emp);
        System.out.println("-------------Sort by Age --------------");
        Arrays.sort(emp,new SortByAge());
        printArr(emp);
        System.out.println("-------------Sort by Salary------------");
        Arrays.sort(emp,new SortBySalary());
        printArr(emp);
        System.out.println("---------Sort by AgeAndName------------");
        Arrays.sort(emp,new ageAndThenName());
        printArr(emp);

        System.out.println("------------- List --------------------");
        List<Emploee> list = new ArrayList<>();
        list.add(em1);
        list.add(em2);
        list.add(em3);
        list.add(em4);
        System.out.println(list);

        Collections.sort(list);
        System.out.println("------ List Sort Collection id --------");
        System.out.println(list);

        Collections.sort(list,new SortByName());
        System.out.println("-------______ List Sort by Name --------");
        System.out.println(list);

        Collections.sort(list,new SortBySalary());
        System.out.println("----------List Sort by Salary------------");
        System.out.println(list);

        Collections.sort(list,new ageAndThenName());
        System.out.println("---------List Sort by AgeAndNam---------");
        System.out.println(list);

    }

    static void printArr(Emploee[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee(1,"Семен","Степанов", 29, "M", "IT");
        Employee em2 = new Employee(2,"Олег","Петров",32,"M","Директор");
        Employee em3 = new Employee(3,"Ольга", "Семенова", 31, "F","Продавец");
        Employee em4 = new Employee(4,"Ирина", "Иванова", 25, "F","Продавец");

        Employees[] stuff = {em1, em2 };

        for (int i = 0; i < stuff.length ; i++) {
            System.out.println(stuff[i].getFullName());
        }

    }
}

//    First level: Создать класс Employee со следующими переменными:
//private int id;
//private String firstName;
//private String lastName;
//private int age;
//private String gender;
//private String position;
//        Класс должен содержать конструктор, геттеры, сеттеры ,метод toString
//        а также метод  public String getFullName().
//
//        Создать и вывести на экран несколько обьектов этого класса
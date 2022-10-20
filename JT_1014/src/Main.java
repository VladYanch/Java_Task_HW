public class Main {
    public static void main(String[] args) {
//    Создать класс "Employee", имеющий:
// - конструктор, который принимает переменные salary, number of  employee's working hours в качестве параметров
// - следующие методы: addSalary() , который добавляет 10 евро к зврплате сотрудника если она меньше 500
// и addWork() , добавляющий 5 евро к зарплате сотрудника если количество часов  больше 6.
// Создать несколько сотрудников и применить к ним методы
        Employee em1= new Employee("Ivan",490,6);
        Employee em2= new Employee("Petr",500,5);

        System.out.println("Зп сотрудника: "+ em1.name+" равна :"+em1.addSalary());
        System.out.println("Зп сотрудника: "+ em2.name+" равна :"+em2.addSalary());
    }
}
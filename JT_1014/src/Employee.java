public class Employee {
    String name;
    int salary, numberHours;
    public Employee(String name, int salary, int numberHours) {
        this.name = name;
        this.salary = salary;
        this.numberHours = numberHours;
    }
    
    public int addSalary() {
        if (salary<500) { salary+=10; }
        if (numberHours>6) { salary+=5; }
        return salary;
    }
}

//    Создать класс "Employee", имеющий:
// - конструктор, который принимает переменные salary, number of  employee's working hours в качестве параметров
// - следующие методы: addSalary() , который добавляет 10 евро к зврплате сотрудника если она меньше 500
// и addWork() , добавляющий 5 евро к зарплате сотрудника если количество часов  больше 6.
// Создать несколько сотрудников и применить к ним методы

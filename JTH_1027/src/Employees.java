public class Employees{
    int salary;

    public Employees(int id, String firstName, String lastName, int age, String gender, String position, int salary) {
//        super(id, firstName, lastName, age, gender, position);
        this.salary = salary;
    }

    public String getFullName() {
        return ("Имя: " + firstName + " Фамилия: " + lastName + " Возраст: " + age + " Должность: " + position );
    }
}

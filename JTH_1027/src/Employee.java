public class Employee  extends Employees{
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String position;

    public String getFirstName() {
        return firstName;
    }

    public Employee(int id, String firstName, String lastName, int age, String gender, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.position = position;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFullName() {
        return ("Имя: " + firstName + " Фамилия: " + lastName + " Возраст: " + age + " Должность: " + position );
    }


}


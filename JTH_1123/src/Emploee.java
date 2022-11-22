public class Emploee implements Comparable<Emploee>{
    private int id;
    private String name;
    private int age;
    private int salary;

    public Emploee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return id + ". " + name + " " + "(" + age + ") " + salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Emploee o) {
        return this.id - o.id;
    }
}

public class Main {
    public static void main(String[] args) {


    // создать классы
    // содержащие методы для подсчета полощади и периметра rectangle and circle,
    // используя интерфейсы. Создать несколько объектов этих типов и вывести на
    // экран их площадь и периметр
    // Домашнее задание

    Calc calc1 = new Circle(11);
    Calc calc2 = new Rectangle(5,10);
    Calc calc3 = new Circle(8);
    Calc calc4 = new Rectangle(2,3);

    calc1.getArea();
    calc1.getPerimetr();

    calc2.getArea();
    calc2.getPerimetr();

    calc3.getArea();
    calc3.getPerimetr();

    calc4.getArea();
    calc4.getPerimetr();
    }
}

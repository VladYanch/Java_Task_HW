public class Circle implements Calc{
    private static double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("Площадь круга с радиусом " + radius + " равна " + PI * radius * radius);
    }

    @Override
    public void getPerimetr() {
        System.out.println("Длинна окружности круга с радиусом " + radius + " равна " + 2* PI * radius);
    }
}


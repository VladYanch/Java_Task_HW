public class Rectangle implements Calc {
        private double a;
        private double b;

        public Rectangle(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public void getArea() {
            System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b +" равна " + a * b);
        }

    @Override
    public void getPerimetr() {
        System.out.println("Периметр прямоугольника со сторонами " + a + " и " + b +" равен " + 2 * (a + b));
    }
}

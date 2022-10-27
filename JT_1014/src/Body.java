public class Body {
    double weight;
    double height;

    public Body(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateBMI() {
        double index=weight/(height*height);

        if (index<18,5) {
            System.out.println("Underweight");
            } else if (index>=18.5 && index<25 ) {
            System.out.println("Normal");
            } else if (index>=25) {
            System.out.println("Overweight");}


}

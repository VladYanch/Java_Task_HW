public class Rectangle {
    int length, breadth;

    public int calcPerimeter(int length, int breadth) {
        return 2*(length+breadth);
    }

    public int calcArea(int length, int breadth) {
        return length*breadth;
    }
}

//1. Создать класс "Rectangle" , предоставляющий возможность вычисления площади и периметра
// прямоугольника. area= length*breadth;  perimeter= 2*(length+breadth). Длина и ширина
// передаются как параметры конструктора. Создать несколько обьектов этого класса и вывести их на экран
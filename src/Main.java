public class Main {
    public static void main(String[] args) {
// Variant 1
//        First level: Напишите метод, который принимает три числа и определяет в каком порядке
//        они введены: печатает increasing  если числа возрастают (1,2.3),
//        decreasing если числа введены в убывающем порядке (3,2,1)
//        и "neither increasing nor decreasing order" во всех остальных случаях.
        int a, b, c;
        isSeq(3, 5, 6);
        isSeq(6, 5, 4);
        isSeq(6, 7, 4);

        // Variant 2
//        System.out.println(vasiaInTrouble(true, 6));
        boolean problem = vasiaInTrouble (true, 6);

        if (vasiaInTrouble (true, 6)) {
            System.out.println("Vasya have problem");
        } else {
            System.out.println("Vasya have No problem");
        }

        System.out.println(vasiaInTrouble (true, 8));
        System.out.println(vasiaInTrouble (false, 6));

    }
    public static void isSeq(int a, int b, int c) {
        if (a < b && b < c) {
            System.out.println("insreasing");
        } else if (a > b && b > c) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither increasing nor decreasing order");
        }
    }

// Variant 2
//        Вася рано встает на работу и поэтому рано ложится спать. Сосед Васи любит слушать громкую музыку.  У Васи проблемы если сосед слушает музыку и еще нет семи утра или уже позже 20 часов. Напишите метод, возвращающий true если у Васи проблемы.
//        boolean vasiaInTrouble (boolean singing, int hour)
//        где hour - время в часах в диапазоне от 0 до 23
//        например:
//        vasiaInTrouble (true, 6) -> true
//        vasiaInTrouble (true, 8) -> false
//        vasiaInTrouble (false, 6) -> false
    public static boolean vasiaInTrouble( boolean singing, int hour){
            return singing && (hour < 7) || (hour > 20);
    }
}

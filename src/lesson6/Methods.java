package lesson6;

public class Methods {
    /**
     * 1) Входящими параметрами передаем 3 стороны треугольника, а метод должен печатать на консоль площадь
     * 2) Передаем в метод 4 числа, метод возвращает меньшее число из 4х
     * 3) Передаем в метод слово, метод должен напечатать на консоль это же слово, только большими полностью буквами
     * 4) Передаем в метод три стороны треугольника, метод должен напечатать на консоль какой это треугольник:
     * равносторонний, разносторонний или равнобедренный
     */

    //1) Входящими параметрами передаем 3 стороны треугольника, а метод должен печатать на консоль площадь
    public static void printSquareTriangle(int a, int b, int c) {
        int perimeterTriangle = a + b + c;
        double s = (perimeterTriangle / 2) * ((perimeterTriangle / 2) - a) * ((perimeterTriangle / 2) - b) * ((perimeterTriangle / 2) - c);
        double squareTriangle = Math.sqrt(s);
        System.out.println(squareTriangle);
        System.out.println();

    }

    //2) Передаем в метод 4 числа, метод возвращает меньшее число из 4х
    public static int lesserNumber(int a, int b, int c, int d) {
        if (a == b || a == c || a == d || b == c || b == d || c == d) {
            System.out.println("Введите разные числа");
        }
        if (a < b && a < c && a < d) {
            return a;
        }
        if (b < a && b < c && b < d) {
            return b;
        }
        if (c < a && c < b && c < d) {
            return c;
        }
        return d;
    }

    //3) Передаем в метод слово, метод должен напечатать на консоль это же слово, только большими полностью буквами
    public static void wordOnTitleLetters(String text) {
        String titleLetters = text.toUpperCase();
        System.out.println(titleLetters);
    }

    //4) Передаем в метод три стороны треугольника, метод должен напечатать на консоль какой это треугольник:
    //     * равносторонний, разносторонний или равнобедренный

    public static void typeOfTriangle(int a, int b, int c) {

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }
    }

}





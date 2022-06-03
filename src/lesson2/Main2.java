package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 3;

        // –авносторонний, разносторонний или равнобедренный

        if (a == b && b == c && c == a) {
            System.out.println("Ёто равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Ёто разносторонний треугольник");
        } else {
            System.out.println("Ёто равнобедренный треугольник");
        }
    }
}

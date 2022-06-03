package lesson3;
import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        // консольное приложение по просчету площади и периметра разных фигур

        System.out.println("Выберите фигуру:");
        System.out.println("1 - Квадрат");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Треугольник");
        System.out.println("4 - Трапеция");
        System.out.println("5 - Овал/Эллипс");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        if (figura.equals("1") || figura.equalsIgnoreCase("квадрат")) {
            System.out.println("Введите сторону квадрата");
            String storona = scanner.nextLine();
            // "34" --> int
            int a = Integer.parseInt(storona);
            System.out.println("Периметр квадрата: " + (a + a + a + a));
            System.out.println("Площадь квадрата: " + (a * a));
        }

        // Дамашнее задание по оставшимся фигурам
        if (figura.equals("2") || figura.equalsIgnoreCase("Прямоугольник")) {
            System.out.println("Введите меньшую сторону прямоугольника");
            String storona1 = scanner.nextLine();
            System.out.println("Введите большую сторону прямоугольника");
            String storona2 = scanner.nextLine();
            int a2 = Integer.parseInt(storona1);
            int b2 = Integer.parseInt(storona2);
            System.out.println("Периметр прямоугольника: " + ((a2 + b2) * 2));
            System.out.println("Площадь прямоугольника: " + (a2 * b2));
        }

        if (figura.equals("3") || figura.equalsIgnoreCase("Треугольник")) {
            System.out.println("Введите первую сторону треугольника");
            String storona1 = scanner.nextLine();
            System.out.println("Введите вторую сторону треугольника");
            String storona2 = scanner.nextLine();
            System.out.println("Введите третью сторону треугольника");
            String storona3 = scanner.nextLine();
            int a3 = Integer.parseInt(storona1);
            int b3 = Integer.parseInt(storona2);
            int c3 = Integer.parseInt(storona3);
            int perimeterTriangle = a3 + b3 + c3;
            double s = (perimeterTriangle / 2) * ((perimeterTriangle / 2) - a3) * ((perimeterTriangle / 2) - b3) * ((perimeterTriangle / 2) - c3);
            double squareTriangle = Math.sqrt(s);
            double h = (2*Math.sqrt((perimeterTriangle / 2)*(perimeterTriangle / 2-a3)*(perimeterTriangle / 2-b3)*(perimeterTriangle / 2-c3)))/a3;
            double cosA = Math.toRadians(Math.cos(a3*a3+c3*c3-b3*b3)/(2*a3*c3));
            System.out.println("Периметр треугольника: " + (perimeterTriangle));
            System.out.println("Площадь треугольника: " + (squareTriangle));
            System.out.println("Высота треугольника: " + h);
            System.out.println("Косинус угла А: "+cosA);
        }

        if (figura.equals("4") || figura.equalsIgnoreCase("Трапеция")) {
            System.out.println("Введите первое основание трапеции");
            String storona1 = scanner.nextLine();
            System.out.println("Введите второе основание трапеции");
            String storona2 = scanner.nextLine();
            System.out.println("Введите третью сторону трапеции");
            String storona3 = scanner.nextLine();
            System.out.println("Введите четвертую сторону трапеции");
            String storona4 = scanner.nextLine();
            System.out.println("Введите высоту трапеции");
            String height = scanner.nextLine();
            int a4 = Integer.parseInt(storona1);
            int b4 = Integer.parseInt(storona2);
            int c4 = Integer.parseInt(storona3);
            int d4 = Integer.parseInt(storona4);
            int h = Integer.parseInt(height);
            int perimeterTrapeze = a4 + b4 + c4 + d4;
            double squareTrapeze = ((a4 + b4) / 2 * h);
            System.out.println("Периметр трапеции: " + (perimeterTrapeze));
            System.out.println("Площадь трапеции: " + (squareTrapeze));
        }
        if (figura.equals("5") || figura.equalsIgnoreCase("Овал") || figura.equalsIgnoreCase("Эллипс")) {
            System.out.println("Введите длину меньшей полуоси овала/эллипса");
            String poluosLesser = scanner.nextLine();
            System.out.println("Введите длину большей полуоси овала/эллипса");
            String poluosBigger = scanner.nextLine();

            int a5 = Integer.parseInt(poluosLesser);
            int b5 = Integer.parseInt(poluosBigger);

            double perimeterOval = 4 * ((3.14 * a5 * b5 + (a5 - b5) * (a5 - b5)) / (a5 + b5));

            double squareOval = 3.14 * a5 * b5;
            System.out.println("Периметр овала: " + (perimeterOval));
            System.out.println("Площадь овала: " + (squareOval));
        }
    }

}

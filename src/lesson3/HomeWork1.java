package lesson3;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        System.out.println("Выберите параметр");
        System.out.println("1 - Длина");
        System.out.println("2 - Масса");
        System.out.println("3 - Время");
        System.out.println("4 - Давление");

        Scanner scanner = new Scanner(System.in);
        String parameter = scanner.nextLine();

        if (parameter.equals("1") || parameter.equalsIgnoreCase("Длина")) {
            System.out.println("Выберите единицу измерения");
            System.out.println("1 - Километр");
            System.out.println("2 - Метр");
            System.out.println("3 - Сантиметр");
            System.out.println("4 - Миллиметр");

            String measure = scanner.nextLine();
            if (measure.equals("1") || measure.equalsIgnoreCase("Километр")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " километрах " + a * 1000 + " метров");
                System.out.println("В " + a + " километрах " + a * 100000 + " сантиметров");
                System.out.println("В " + a + " километрах " + a * 1000000 + " миллиметров");
            }
            if (measure.equals("2") || measure.equalsIgnoreCase("Метр")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " метрах " + a / 1000 + " километров");
                System.out.println("В " + a + " метрах " + a * 100 + " сантиметров");
                System.out.println("В " + a + " метрах " + a * 1000 + " миллиметров");
            }
            if (measure.equals("3") || measure.equalsIgnoreCase("Сантиметр")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " сантиметрах " + a / 100000 + " километров");
                System.out.println("В " + a + " сантиметрах " + a / 100 + " метров");
                System.out.println("В " + a + " сантиметрах " + a * 10 + " миллиметров");
            }
            if (measure.equals("4") || measure.equalsIgnoreCase("Миллиметр")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " миллиметрах " + a / 1000000 + " километров");
                System.out.println("В " + a + " миллиметрах " + a / 1000 + " метров");
                System.out.println("В " + a + " миллиметрах " + a / 10 + " сантиметров");
            }
        }
        if (parameter.equals("2") || parameter.equalsIgnoreCase("Масса")) {
            System.out.println("Выберите единицу измерения");
            System.out.println("1 - Тонна");
            System.out.println("2 - Килограмм");
            System.out.println("3 - Грамм");
            System.out.println("4 - Миллиграмм");

            String measure = scanner.nextLine();
            if (measure.equals("1") || measure.equalsIgnoreCase("Тонна")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " тоннах " + a * 1000 + " килограмм");
                System.out.println("В " + a + " тоннах " + a * 1000000 + " грамм");
                System.out.println("В " + a + " тоннах " + a * 1000000000 + " миллиграмм");
            }
            if (measure.equals("2") || measure.equalsIgnoreCase("Килограмм")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " килограммах " + a / 1000 + " тонн");
                System.out.println("В " + a + " килограммах " + a * 1000 + " грамм");
                System.out.println("В " + a + " килограммах " + a * 1000000 + " миллиграмм");
            }
            if (measure.equals("3") || measure.equalsIgnoreCase("Грамм")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " граммах " + a / 1000000 + " тонн");
                System.out.println("В " + a + " граммах " + a / 1000 + " килограмм");
                System.out.println("В " + a + " граммах " + a * 1000 + " миллиграмм");
            }
            if (measure.equals("4") || measure.equalsIgnoreCase("Миллиграмм")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " миллиграммах " + a / 1000000000 + " тонн");
                System.out.println("В " + a + " миллиграммах " + a / 1000000 + " килограмм");
                System.out.println("В " + a + " миллиграммах " + a / 1000 + " грамм");
            }
        }
        if (parameter.equals("3") || parameter.equalsIgnoreCase("Время")) {
            System.out.println("Выберите единицу измерения");
            System.out.println("1 - Сутки");
            System.out.println("2 - Час");
            System.out.println("3 - Минута");
            System.out.println("4 - Секунда");

            String measure = scanner.nextLine();
            if (measure.equals("1") || measure.equalsIgnoreCase("Сутки")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " сутках " + a * 24 + " часа");
                System.out.println("В " + a + " сутках " + a * 24 * 60 + " минут");
                System.out.println("В " + a + " сутках " + a * 24 * 60 * 60 + " секунд");
            }
            if (measure.equals("2") || measure.equalsIgnoreCase("Час")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " часах " + a / 24 + " суток");
                System.out.println("В " + a + " часах " + a * 60 + " минут");
                System.out.println("В " + a + " часах " + a * 60 * 60 + " секунд");
            }
            if (measure.equals("3") || measure.equalsIgnoreCase("Минута")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " минутах " + a / 24 / 60 + " суток");
                System.out.println("В " + a + " минутах " + a / 60 + " часов");
                System.out.println("В " + a + " минутах " + a * 60 + " секунд");
            }
            if (measure.equals("4") || measure.equalsIgnoreCase("Секунда")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " секундах " + a / 24 / 60 / 60 + " суток");
                System.out.println("В " + a + " секундах " + a / 60 / 60 + " часов");
                System.out.println("В " + a + " секундах " + a / 60 + " минут");
            }
        }
        if (parameter.equals("4") || parameter.equalsIgnoreCase("Давление")) {
            System.out.println("Выберите единицу измерения");
            System.out.println("1 - Атмосфера");
            System.out.println("2 - Бар");
            System.out.println("3 - Паскаль");

            String measure = scanner.nextLine();
            if (measure.equals("1") || measure.equalsIgnoreCase("Атмосфера")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " атмосфере " + a * 1.01325 + " бар");
                System.out.println("В " + a + " атмосфере " + a * 101325 + " паскалей");
            }
            if (measure.equals("2") || measure.equalsIgnoreCase("Бар")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " баре " + a / 1.01325 + " атмосфер");
                System.out.println("В " + a + " баре " + a * 100000 + " паскалей");
            }
            if (measure.equals("3") || measure.equalsIgnoreCase("Паскаль")) {
                System.out.println("Введите значение");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("В " + a + " паскалях " + a / 101325 + " атмосфер");
                System.out.println("В " + a + " паскалях " + a / 100000 + " бар");
            }
        }
    }
}

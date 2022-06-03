package lesson4;


import java.util.Scanner;


public class HomeWorkLesson4 {
    public static void main(String[] args) {

        //1 - напечатать все туры в "... страну" или направление

        String[][] tours = {{"Турция", "100000", "6 дней", "Самолет"},
                            {"Египет", "150000", "5 дней", "Самолет"},
                            {"Египет", "180000", "4 дней", "Самолет"},
                            {"Карелия", "60000", "3 дней", "Автобус"},
                            {"Байкал", "70000", "6 дней", "Самолет"},
                            {"Сочи", "90000", "5 дней", "Самолет"},
                            {"Золотое кольцо", "20000", "5 дней", "Автобус"}};
        System.out.println("Где бы Вы хотели отдохнуть, в России или за рубежом?");
        System.out.println("1 - В России");
        System.out.println("2 - За рубежом");

        Scanner scanner = new Scanner(System.in);
        String directionStr = scanner.nextLine();

        if (directionStr.equals("1") || directionStr.equalsIgnoreCase("России")) {
            System.out.println("Какой отдых Вы больше предпочитаете?");
            System.out.println("1 - Пляжный отдых");
            System.out.println("2 - Насладиться чистым воздухом и красивой природой");
            System.out.println("3 - Посетить старые русские города и увидеть памятники архитектуры и деревянного зодчества");
            String typeOfRest = scanner.nextLine();
            if (typeOfRest.equals("1") || typeOfRest.equalsIgnoreCase("Пляжный")) {
                System.out.println("Мы можем Вам предложить следующее:");
                System.out.printf("%s, %s рублей, на %s, %s \n", tours[5][0], tours[5][1], tours[5][2], tours[5][3]);
            }
            if (typeOfRest.equals("2") || typeOfRest.equalsIgnoreCase("Чистый воздух")|| typeOfRest.equalsIgnoreCase("Природа")) {
                System.out.println("Мы можем Вам предложить следующее:");
                System.out.printf("%s, %s рублей, на %s, %s \n", tours[3][0], tours[3][1], tours[3][2], tours[3][3]);
                System.out.printf("%s, %s рублей, на %s, %s \n", tours[4][0], tours[4][1], tours[4][2], tours[4][3]);
            }
            if (typeOfRest.equals("3") || typeOfRest.equalsIgnoreCase("Старые русские города")|| typeOfRest.equalsIgnoreCase("Памятники архитектуры")) {
                System.out.println("Мы можем Вам предложить следующее:");
                System.out.printf("%s, %s рублей, на %s, %s \n", tours[6][0], tours[6][1], tours[6][2], tours[6][3]);
            }

        }
        if (directionStr.equals("2") || directionStr.equalsIgnoreCase("За рубеж")) {
            System.out.println("В какую срану Вы хотели бы отправиться?");
            System.out.println("1 - Египет");
            System.out.println("2 - Турция");

            String typeOfRest = scanner.nextLine();
            if (typeOfRest.equals("1") || typeOfRest.equalsIgnoreCase("Египет")) {
                System.out.println("Мы можем Вам предложить следующее:");
                System.out.printf("%s, %s рублей, на %s, %s \n", tours[1][0], tours[1][1], tours[1][2], tours[1][3]);
                System.out.printf("%s, %s рублей, на %s, %s \n", tours[2][0], tours[2][1], tours[2][2], tours[2][3]);
            }
            if (typeOfRest.equals("2") || typeOfRest.equalsIgnoreCase("Турция")) {
                System.out.println("Мы можем Вам предложить следующее:");
                System.out.printf("%s, %s рублей, на %s, %s \n", tours[0][0], tours[0][1], tours[0][2], tours[0][3]);
            }
        }
//            else {
//            System.out.println("Ваш выбор не корректный");
//        }

    }
}



package lesson4;

import java.util.Scanner;

public class HomeWorkLesson4Ver1 {
    public static void main(String[] args) {

        //1 - напечатать все туры в "... страну"

        String[][] tours = {{"Турция", "100000", "6 дней", "Самолет"},
                {"Египет", "150000", "5 дней", "Самолет"},
                {"Египет", "180000", "4 дней", "Самолет"},
                {"Карелия", "60000", "3 дней", "Автобус"},
                {"Байкал", "70000", "6 дней", "Самолет"},
                {"Сочи", "90000", "5 дней", "Самолет"},
                {"Золотое кольцо", "20000", "5 дней", "Автобус"}};
        System.out.println("Куда бы Вы хотели отправиться");

        Scanner scanner = new Scanner(System.in);
        String stranaStr = scanner.nextLine();

        for (int i = 0; i < tours.length; i++) {
            String stranaOfTour = tours[i][0];
            if (stranaOfTour.equals(stranaStr)) {
                System.out.printf("%s, %s рублей, на %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }
        if (stranaStr.equalsIgnoreCase("Россия")) {
            for (int i = 3; i < tours.length; i++) {
                System.out.printf("%s, %s рублей, на %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }

    }
}

package lesson4;

import java.util.Scanner;

public class HomeWorkLesson4Task4 {
    public static void main(String[] args) {

        //*** - Напечатать все туры от ... до ... дней

        String[][] tours = {{"Турция", "100000", "6 дней", "Самолет"},
                {"Египет", "150000", "5 дней", "Самолет"},
                {"Египет", "180000", "4 дней", "Самолет"},
                {"Карелия", "60000", "3 дней", "Автобус"},
                {"Байкал", "70000", "6 дней", "Самолет"},
                {"Сочи", "90000", "5 дней", "Самолет"},
                {"Золотое кольцо", "20000", "5 дней", "Автобус"}};
        for (int i = 0; i < tours.length; i++) {
            String[] words = tours[i][2].split(" ");
            int days = Integer.parseInt(tours[i][2]);
            System.out.println(days);
        }
//        System.out.println("Введите количетсво дней от: ");
//        Scanner scanner = new Scanner(System.in);
//        String dayMin = scanner.nextLine();
//
//        System.out.println("Введите количетсво дней до: ");
//        String dayMax = scanner.nextLine();


    }
}

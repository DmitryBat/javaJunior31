package lesson4;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        String[][] tours = {{"Турция", "100000", "6 дней", "Самолет"},
                            {"Египет", "150000", "5 дней", "Самолет"},
                            {"Египет", "180000", "4 дней", "Самолет"},
                            {"Карелия", "60000", "3 дней", "Автобус"},
                            {"Байкал", "70000", "6 дней", "Самолет"},
                            {"Сочи", "90000", "5 дней", "Самолет"},
                            {"Золотое кольцо", "20000", "5 дней", "Автобус"}};
        System.out.println("На какой бюджет рассчитываете?");
        // 70000 - выводим +-15000 от той цены что он хочет

        Scanner scanner = new Scanner(System.in);
        String moneyStr = scanner.nextLine();

        int money = Integer.parseInt(moneyStr);

        for(int i = 0; i < tours.length; i++){
            String priceFromCurrentTourStr = tours[i][1];
            int priceFromCurrentTour = Integer.parseInt(priceFromCurrentTourStr);
            if(money + 15000 >= priceFromCurrentTour && money - 15000 <= priceFromCurrentTour){
                System.out.printf("%s, %s рублей, на %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }

        //1 - напечатать все туры в "... страну"
        //2 - напечатать все туры в "... страну ... транспортом"
        //3 - напечатать среднюю стоимость поездки в любую страну
        //*** - Напечатать все туры от ... до ... дней
        //***** - Напечатать туры, на ваш взгляд привлекательные покупателю
    }
}

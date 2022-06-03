package lesson2;

import javax.swing.*;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("Только четные числа от -100 до -50:");
        for (int i = -99; i < -50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nВсе числа от 10 до 30 в обратном порядке:");
        for (int i = 29; i > 10; i--) {
            System.out.println(i);
        }
        System.out.println("\nКол-во четных чисел в диапазоне от 30 до 61:");
        int countChetnih = 0;
        for (int i = 31; i < 61; i++) {
            if (i % 2 == 0) {
                countChetnih += 1;
            }
        }
        System.out.println(countChetnih);

        //Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500т
        int countMonth = 0;
        for (int kopilkaCash = 0; kopilkaCash <= 200000; kopilkaCash = kopilkaCash + 9500) {
            countMonth += 1;
        }
        int kolvoYear = (int) (countMonth / 12);
        int kolvoMonth = countMonth - kolvoYear * 12;
        System.out.println("\nЧтобы собрать сумму в 200 тыс. руб. откладывая по 9500 руб. ежемесячно нужно " + kolvoYear + " лет " + kolvoMonth + " месяцев");

        System.out.println("\nВсе числа от 20 до 60, пропуская диапазон от 30 до 40 включительно:");

        for (int i = 21; i < 60; i++) {
            if (i < 30 || i > 40) {
                System.out.println(i);
            }
        }

    }

}

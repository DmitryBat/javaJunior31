package lesson2;

import javax.swing.*;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("������ ������ ����� �� -100 �� -50:");
        for (int i = -99; i < -50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\n��� ����� �� 10 �� 30 � �������� �������:");
        for (int i = 29; i > 10; i--) {
            System.out.println(i);
        }
        System.out.println("\n���-�� ������ ����� � ��������� �� 30 �� 61:");
        int countChetnih = 0;
        for (int i = 31; i < 61; i++) {
            if (i % 2 == 0) {
                countChetnih += 1;
            }
        }
        System.out.println(countChetnih);

        //��������� ������� ����� ���, ���� ������� ����� � 200� ������, ���� ����������� ���������� �� 9500�
        int countMonth = 0;
        for (int kopilkaCash = 0; kopilkaCash <= 200000; kopilkaCash = kopilkaCash + 9500) {
            countMonth += 1;
        }
        int kolvoYear = (int) (countMonth / 12);
        int kolvoMonth = countMonth - kolvoYear * 12;
        System.out.println("\n����� ������� ����� � 200 ���. ���. ���������� �� 9500 ���. ���������� ����� " + kolvoYear + " ��� " + kolvoMonth + " �������");

        System.out.println("\n��� ����� �� 20 �� 60, ��������� �������� �� 30 �� 40 ������������:");

        for (int i = 21; i < 60; i++) {
            if (i < 30 || i > 40) {
                System.out.println(i);
            }
        }

    }

}

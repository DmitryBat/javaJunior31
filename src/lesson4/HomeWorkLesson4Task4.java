package lesson4;

import java.util.Scanner;

public class HomeWorkLesson4Task4 {
    public static void main(String[] args) {

        //*** - ���������� ��� ���� �� ... �� ... ����

        String[][] tours = {{"������", "100000", "6 ����", "�������"},
                {"������", "150000", "5 ����", "�������"},
                {"������", "180000", "4 ����", "�������"},
                {"�������", "60000", "3 ����", "�������"},
                {"������", "70000", "6 ����", "�������"},
                {"����", "90000", "5 ����", "�������"},
                {"������� ������", "20000", "5 ����", "�������"}};
        for (int i = 0; i < tours.length; i++) {
            String[] words = tours[i][2].split(" ");
            int days = Integer.parseInt(tours[i][2]);
            System.out.println(days);
        }
//        System.out.println("������� ���������� ���� ��: ");
//        Scanner scanner = new Scanner(System.in);
//        String dayMin = scanner.nextLine();
//
//        System.out.println("������� ���������� ���� ��: ");
//        String dayMax = scanner.nextLine();


    }
}

package lesson4;

import java.util.Scanner;

public class HomeWorkLesson4Ver1 {
    public static void main(String[] args) {

        //1 - ���������� ��� ���� � "... ������"

        String[][] tours = {{"������", "100000", "6 ����", "�������"},
                {"������", "150000", "5 ����", "�������"},
                {"������", "180000", "4 ����", "�������"},
                {"�������", "60000", "3 ����", "�������"},
                {"������", "70000", "6 ����", "�������"},
                {"����", "90000", "5 ����", "�������"},
                {"������� ������", "20000", "5 ����", "�������"}};
        System.out.println("���� �� �� ������ �����������");

        Scanner scanner = new Scanner(System.in);
        String stranaStr = scanner.nextLine();

        for (int i = 0; i < tours.length; i++) {
            String stranaOfTour = tours[i][0];
            if (stranaOfTour.equals(stranaStr)) {
                System.out.printf("%s, %s ������, �� %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }
        if (stranaStr.equalsIgnoreCase("������")) {
            for (int i = 3; i < tours.length; i++) {
                System.out.printf("%s, %s ������, �� %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }

    }
}

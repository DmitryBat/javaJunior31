package lesson4;


import java.util.Scanner;


public class HomeWorkLesson4 {
    public static void main(String[] args) {

        //1 - ���������� ��� ���� � "... ������" ��� �����������

        String[][] tours = {{"������", "100000", "6 ����", "�������"},
                            {"������", "150000", "5 ����", "�������"},
                            {"������", "180000", "4 ����", "�������"},
                            {"�������", "60000", "3 ����", "�������"},
                            {"������", "70000", "6 ����", "�������"},
                            {"����", "90000", "5 ����", "�������"},
                            {"������� ������", "20000", "5 ����", "�������"}};
        System.out.println("��� �� �� ������ ���������, � ������ ��� �� �������?");
        System.out.println("1 - � ������");
        System.out.println("2 - �� �������");

        Scanner scanner = new Scanner(System.in);
        String directionStr = scanner.nextLine();

        if (directionStr.equals("1") || directionStr.equalsIgnoreCase("������")) {
            System.out.println("����� ����� �� ������ �������������?");
            System.out.println("1 - ������� �����");
            System.out.println("2 - ����������� ������ �������� � �������� ��������");
            System.out.println("3 - �������� ������ ������� ������ � ������� ��������� ����������� � ����������� ���������");
            String typeOfRest = scanner.nextLine();
            if (typeOfRest.equals("1") || typeOfRest.equalsIgnoreCase("�������")) {
                System.out.println("�� ����� ��� ���������� ���������:");
                System.out.printf("%s, %s ������, �� %s, %s \n", tours[5][0], tours[5][1], tours[5][2], tours[5][3]);
            }
            if (typeOfRest.equals("2") || typeOfRest.equalsIgnoreCase("������ ������")|| typeOfRest.equalsIgnoreCase("�������")) {
                System.out.println("�� ����� ��� ���������� ���������:");
                System.out.printf("%s, %s ������, �� %s, %s \n", tours[3][0], tours[3][1], tours[3][2], tours[3][3]);
                System.out.printf("%s, %s ������, �� %s, %s \n", tours[4][0], tours[4][1], tours[4][2], tours[4][3]);
            }
            if (typeOfRest.equals("3") || typeOfRest.equalsIgnoreCase("������ ������� ������")|| typeOfRest.equalsIgnoreCase("��������� �����������")) {
                System.out.println("�� ����� ��� ���������� ���������:");
                System.out.printf("%s, %s ������, �� %s, %s \n", tours[6][0], tours[6][1], tours[6][2], tours[6][3]);
            }

        }
        if (directionStr.equals("2") || directionStr.equalsIgnoreCase("�� �����")) {
            System.out.println("� ����� ����� �� ������ �� �����������?");
            System.out.println("1 - ������");
            System.out.println("2 - ������");

            String typeOfRest = scanner.nextLine();
            if (typeOfRest.equals("1") || typeOfRest.equalsIgnoreCase("������")) {
                System.out.println("�� ����� ��� ���������� ���������:");
                System.out.printf("%s, %s ������, �� %s, %s \n", tours[1][0], tours[1][1], tours[1][2], tours[1][3]);
                System.out.printf("%s, %s ������, �� %s, %s \n", tours[2][0], tours[2][1], tours[2][2], tours[2][3]);
            }
            if (typeOfRest.equals("2") || typeOfRest.equalsIgnoreCase("������")) {
                System.out.println("�� ����� ��� ���������� ���������:");
                System.out.printf("%s, %s ������, �� %s, %s \n", tours[0][0], tours[0][1], tours[0][2], tours[0][3]);
            }
        }
//            else {
//            System.out.println("��� ����� �� ����������");
//        }

    }
}



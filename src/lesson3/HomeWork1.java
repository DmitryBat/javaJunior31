package lesson3;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        System.out.println("�������� ��������");
        System.out.println("1 - �����");
        System.out.println("2 - �����");
        System.out.println("3 - �����");
        System.out.println("4 - ��������");

        Scanner scanner = new Scanner(System.in);
        String parameter = scanner.nextLine();

        if (parameter.equals("1") || parameter.equalsIgnoreCase("�����")) {
            System.out.println("�������� ������� ���������");
            System.out.println("1 - ��������");
            System.out.println("2 - ����");
            System.out.println("3 - ���������");
            System.out.println("4 - ���������");

            String measure = scanner.nextLine();
            if (measure.equals("1") || measure.equalsIgnoreCase("��������")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ���������� " + a * 1000 + " ������");
                System.out.println("� " + a + " ���������� " + a * 100000 + " �����������");
                System.out.println("� " + a + " ���������� " + a * 1000000 + " �����������");
            }
            if (measure.equals("2") || measure.equalsIgnoreCase("����")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ������ " + a / 1000 + " ����������");
                System.out.println("� " + a + " ������ " + a * 100 + " �����������");
                System.out.println("� " + a + " ������ " + a * 1000 + " �����������");
            }
            if (measure.equals("3") || measure.equalsIgnoreCase("���������")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ����������� " + a / 100000 + " ����������");
                System.out.println("� " + a + " ����������� " + a / 100 + " ������");
                System.out.println("� " + a + " ����������� " + a * 10 + " �����������");
            }
            if (measure.equals("4") || measure.equalsIgnoreCase("���������")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ����������� " + a / 1000000 + " ����������");
                System.out.println("� " + a + " ����������� " + a / 1000 + " ������");
                System.out.println("� " + a + " ����������� " + a / 10 + " �����������");
            }
        }
        if (parameter.equals("2") || parameter.equalsIgnoreCase("�����")) {
            System.out.println("�������� ������� ���������");
            System.out.println("1 - �����");
            System.out.println("2 - ���������");
            System.out.println("3 - �����");
            System.out.println("4 - ����������");

            String measure = scanner.nextLine();
            if (measure.equals("1") || measure.equalsIgnoreCase("�����")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ������ " + a * 1000 + " ���������");
                System.out.println("� " + a + " ������ " + a * 1000000 + " �����");
                System.out.println("� " + a + " ������ " + a * 1000000000 + " ����������");
            }
            if (measure.equals("2") || measure.equalsIgnoreCase("���������")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ����������� " + a / 1000 + " ����");
                System.out.println("� " + a + " ����������� " + a * 1000 + " �����");
                System.out.println("� " + a + " ����������� " + a * 1000000 + " ����������");
            }
            if (measure.equals("3") || measure.equalsIgnoreCase("�����")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ������� " + a / 1000000 + " ����");
                System.out.println("� " + a + " ������� " + a / 1000 + " ���������");
                System.out.println("� " + a + " ������� " + a * 1000 + " ����������");
            }
            if (measure.equals("4") || measure.equalsIgnoreCase("����������")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ������������ " + a / 1000000000 + " ����");
                System.out.println("� " + a + " ������������ " + a / 1000000 + " ���������");
                System.out.println("� " + a + " ������������ " + a / 1000 + " �����");
            }
        }
        if (parameter.equals("3") || parameter.equalsIgnoreCase("�����")) {
            System.out.println("�������� ������� ���������");
            System.out.println("1 - �����");
            System.out.println("2 - ���");
            System.out.println("3 - ������");
            System.out.println("4 - �������");

            String measure = scanner.nextLine();
            if (measure.equals("1") || measure.equalsIgnoreCase("�����")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ������ " + a * 24 + " ����");
                System.out.println("� " + a + " ������ " + a * 24 * 60 + " �����");
                System.out.println("� " + a + " ������ " + a * 24 * 60 * 60 + " ������");
            }
            if (measure.equals("2") || measure.equalsIgnoreCase("���")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ����� " + a / 24 + " �����");
                System.out.println("� " + a + " ����� " + a * 60 + " �����");
                System.out.println("� " + a + " ����� " + a * 60 * 60 + " ������");
            }
            if (measure.equals("3") || measure.equalsIgnoreCase("������")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ������� " + a / 24 / 60 + " �����");
                System.out.println("� " + a + " ������� " + a / 60 + " �����");
                System.out.println("� " + a + " ������� " + a * 60 + " ������");
            }
            if (measure.equals("4") || measure.equalsIgnoreCase("�������")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " �������� " + a / 24 / 60 / 60 + " �����");
                System.out.println("� " + a + " �������� " + a / 60 / 60 + " �����");
                System.out.println("� " + a + " �������� " + a / 60 + " �����");
            }
        }
        if (parameter.equals("4") || parameter.equalsIgnoreCase("��������")) {
            System.out.println("�������� ������� ���������");
            System.out.println("1 - ���������");
            System.out.println("2 - ���");
            System.out.println("3 - �������");

            String measure = scanner.nextLine();
            if (measure.equals("1") || measure.equalsIgnoreCase("���������")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ��������� " + a * 1.01325 + " ���");
                System.out.println("� " + a + " ��������� " + a * 101325 + " ��������");
            }
            if (measure.equals("2") || measure.equalsIgnoreCase("���")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " ���� " + a / 1.01325 + " ��������");
                System.out.println("� " + a + " ���� " + a * 100000 + " ��������");
            }
            if (measure.equals("3") || measure.equalsIgnoreCase("�������")) {
                System.out.println("������� ��������");
                String value = scanner.nextLine();
                double a = Double.parseDouble(value);
                System.out.println("� " + a + " �������� " + a / 101325 + " ��������");
                System.out.println("� " + a + " �������� " + a / 100000 + " ���");
            }
        }
    }
}

package lesson2;

public class Main8 {
    public static void main(String[] args) {
        // ������� �� ������� � ����� ����� 5 ��� ���� ������� 100 000 �� ������� ��� 18% �������?
        // �������� ����������� � ���� �������� ����������

        double money = 100000;
        int year = 5;
        int procent = 18;

        for (int month = 0; month < 12 * year; month++) {
            money = money + ((money / 100 * procent) / 12);
        }
        System.out.println(money);
    }
}

package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // ���������� ������ ����� ������� 3 � 5 ������������ �� 30 �� 60 ������������

        for (int i = 30; i <= 60; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

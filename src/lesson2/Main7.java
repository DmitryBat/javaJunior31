package lesson2;

public class Main7 {
    public static void main(String[] args) {
        // ������� �� ������� ����� ����� �� 20 �� 100 ������� 3

        int summa = 0;
        for (int i = 20; i <= 100; i++) {
            if (i % 3 == 0) {
                summa = summa + i;// summa += i;
            }
        }
        System.out.println(summa);
    }
}

package lesson4;

public class HomeWorkLesson4Task3 {
    public static void main(String[] args) {
        //3 - ���������� ������� ��������� ������� � ����� ������

        String[][] tours = {{"������", "100000", "6 ����", "�������"},
                {"������", "150000", "5 ����", "�������"},
                {"������", "180000", "4 ����", "�������"},
                {"�������", "60000", "3 ����", "�������"},
                {"������", "70000", "6 ����", "�������"},
                {"����", "90000", "5 ����", "�������"},
                {"������� ������", "20000", "5 ����", "�������"}};

        int money = 0;
        for (int i = 0; i < tours.length; i++) {
            String price = tours[i][1];
            int priceOfTour = Integer.parseInt(price);
            money = money + priceOfTour;
        }
        int avrg = money / tours.length;

        System.out.println("������� ��������� ���� �����: " + avrg);

    }
}

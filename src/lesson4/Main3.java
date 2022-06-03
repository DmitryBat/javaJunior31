package lesson4;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        String[][] tours = {{"������", "100000", "6 ����", "�������"},
                            {"������", "150000", "5 ����", "�������"},
                            {"������", "180000", "4 ����", "�������"},
                            {"�������", "60000", "3 ����", "�������"},
                            {"������", "70000", "6 ����", "�������"},
                            {"����", "90000", "5 ����", "�������"},
                            {"������� ������", "20000", "5 ����", "�������"}};
        System.out.println("�� ����� ������ �������������?");
        // 70000 - ������� +-15000 �� ��� ���� ��� �� �����

        Scanner scanner = new Scanner(System.in);
        String moneyStr = scanner.nextLine();

        int money = Integer.parseInt(moneyStr);

        for(int i = 0; i < tours.length; i++){
            String priceFromCurrentTourStr = tours[i][1];
            int priceFromCurrentTour = Integer.parseInt(priceFromCurrentTourStr);
            if(money + 15000 >= priceFromCurrentTour && money - 15000 <= priceFromCurrentTour){
                System.out.printf("%s, %s ������, �� %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }

        //1 - ���������� ��� ���� � "... ������"
        //2 - ���������� ��� ���� � "... ������ ... �����������"
        //3 - ���������� ������� ��������� ������� � ����� ������
        //*** - ���������� ��� ���� �� ... �� ... ����
        //***** - ���������� ����, �� ��� ������ ��������������� ����������
    }
}

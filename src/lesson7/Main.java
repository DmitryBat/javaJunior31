package lesson7;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Tovar stol = new Tovar();
        Tovar computer = new Tovar();

        //stol.name = "���������� ���� 1500*800";//����� ��������
        stol.setName("���������� ���� 1500*800");

        //stol.price = 12000;
        stol.setPrice(12000);
        //stol.salePrice = 9990;
        stol.setSalePrice(9990);

        //computer.name = "������";
        computer.setName("������");
        computer.setPrice(210000);
        computer.setSalePrice(170000);

        System.out.println();

    }
}

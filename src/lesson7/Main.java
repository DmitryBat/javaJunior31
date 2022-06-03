package lesson7;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Tovar stol = new Tovar();
        Tovar computer = new Tovar();

        //stol.name = "Письменный стол 1500*800";//нужно заменить
        stol.setName("Письменный стол 1500*800");

        //stol.price = 12000;
        stol.setPrice(12000);
        //stol.salePrice = 9990;
        stol.setSalePrice(9990);

        //computer.name = "Макбук";
        computer.setName("Макбук");
        computer.setPrice(210000);
        computer.setSalePrice(170000);

        System.out.println();

    }
}

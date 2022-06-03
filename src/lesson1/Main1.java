package lesson1;

public class Main1 {
    public static void main(String[] args) {
        //есть ширина и длина комнаты, есть ширина и длина стола
        // нужно посчитать сколько таких столов влезет в комнату

        double widthRoom = 3.4;
        double lehgthRoom = 2.8;
        double widthTable = 2;
        double lengthTable = 1.5;

        double squareRoom = widthRoom * lehgthRoom;
        double squareTable = widthTable * lengthTable;

        // ругается из-за несовпадения типов
        // необходимо приведение типов double --> int
        // приведение типов бывает: нисходящее и восходящее
        int countTableInsertToRoom = (int) (squareRoom / squareTable);
        System.out.println(countTableInsertToRoom);
    }

}

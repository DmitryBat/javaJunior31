package lesson1;

public class Main {
    public static void main(String[] args) {
        // мы узнаем четное это число или нет

        int number = 32;
        int ostatok = number % 2;
        //ostatok (или 1 или 0 однозначно)
        boolean isChetnoe = ostatok == 0;
        System.out.println(isChetnoe);
    }
}

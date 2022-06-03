package lesson5;

public class Main3 {
    public static void main(String[] args) {
        /**
         * , нужно посчитать сколько в нем слов
         * и вывести на консоль число
         */

        String text = "Есть текст от пользователя";
        String[] words = text.split(" ");
        System.out.println("Количество пробелов: " + words.length);
    }
}

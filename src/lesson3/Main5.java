package lesson3;

public class Main5 {
    public static void main(String[] args) {

        String text = "Hello World qwerty";

        // ���������� �� ������� �� ������ ����� � �������� �������
        // olleH dlroW ytrewq

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(new StringBuilder(words[i]).reverse().toString());
        }


    }
}

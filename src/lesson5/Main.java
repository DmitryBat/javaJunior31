package lesson5;

public class Main {
    public static void main(String[] args) {
        String text = "qwerty";
        text = text + "!!!";
        System.out.println(text);

        // формула создания любого объекта
        // 1 - тип переменной (тип сссылки -> String)
        // 2 - название переменной (название ссылки -> text)
        // 3 - = new (момент создания объекта)
        // 4 - тип объекта ();
        // String text = new String();

        // 1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16... до 100
        String numbers = "";
        for (int i = 0; i < 100; i++) {
            numbers = numbers + i + "-";
        }
        System.out.println(numbers);
    }
}

package lesson5;

public class Main2 {
    public static void main(String[] args) {

         // У нас есть текст. Задача: полностью убрать знаки препинания

        String text = "У нас есть текст. Задача: полностью убрать знаки препинания";
        text = text.replace('.','\0');
        text = text.replace(':','\0');
        text = text.replace('-','\0');
        text = text.replace(';','\0');
        System.out.println(text);
    }
}

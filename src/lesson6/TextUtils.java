package lesson6;

public class TextUtils {

    /**
     * Создадим метод в который будем передавать любой текст
     * а метод будет возвращать количество гласных букв в этом тексте
     * <p>
     * 1 - модификатор доступа (одно из четырех слов)
     * Модификатор доступа определяет область видимости данного метода
     * public - доступно внутри всего проекта
     * ----- - (пусто) (package) - доступен внутри текущего пакета
     * protected - доступен внутри текущего пакета и дочерним классам
     * private - доступен внутри текущего файла (текущего класса)
     * 2 - static (пишем или нет)
     * 3 - возвращаемый тип - String, int, boolean... (или слово void если не возвращает ничего)
     * 4 - название метода (видно когад мы его будем вызывать - по этому слову будем вызывать)
     * () - входящие параметры для выполнения метода
     * 5 - явные входящие параметры
     * 6 - тело выполнения метода
     */

    public static int countVowels(String text) {
        // text = "dslgfnkghkapsdgnksnga"
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'o' || ch == 'u' || ch == 'e' || ch == 'i') {
                count++;
            }
        }
        return count;
    }

    /**
     * Метод, который печатает на консоль зеркальный текст исходному (в обратном порядке)
     */
    public static void printReverse(String text) {
       for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));

        }
        System.out.println();
    }

    /**
     * Мы в метод передаем слово, которое нужно закодировать
     * метод возвращает закодированное слово
     */
    public static String codding(String word) {

        String alphabet = "abcdefghijklmnopqrstuvwxyzaABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String coddingWord = "";
        for (int i = 0; i < word.length(); i++) {
            char currentCharFromText = word.charAt(i);
            int indexFromAlphabet = alphabet.indexOf(currentCharFromText);
            if(indexFromAlphabet != -1){
                char charToCodding = alphabet.charAt(indexFromAlphabet + 1);
                coddingWord = coddingWord + charToCodding;
            }else {
                coddingWord = coddingWord + currentCharFromText;
            }
        }
        return coddingWord;
    }}

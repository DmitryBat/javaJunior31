package lesson6;

public class TextUtils {

    /**
     * �������� ����� � ������� ����� ���������� ����� �����
     * � ����� ����� ���������� ���������� ������� ���� � ���� ������
     * <p>
     * 1 - ����������� ������� (���� �� ������� ����)
     * ����������� ������� ���������� ������� ��������� ������� ������
     * public - �������� ������ ����� �������
     * ----- - (�����) (package) - �������� ������ �������� ������
     * protected - �������� ������ �������� ������ � �������� �������
     * private - �������� ������ �������� ����� (�������� ������)
     * 2 - static (����� ��� ���)
     * 3 - ������������ ��� - String, int, boolean... (��� ����� void ���� �� ���������� ������)
     * 4 - �������� ������ (����� ����� �� ��� ����� �������� - �� ����� ����� ����� ��������)
     * () - �������� ��������� ��� ���������� ������
     * 5 - ����� �������� ���������
     * 6 - ���� ���������� ������
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
     * �����, ������� �������� �� ������� ���������� ����� ��������� (� �������� �������)
     */
    public static void printReverse(String text) {
       for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));

        }
        System.out.println();
    }

    /**
     * �� � ����� �������� �����, ������� ����� ������������
     * ����� ���������� �������������� �����
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

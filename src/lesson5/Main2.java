package lesson5;

public class Main2 {
    public static void main(String[] args) {

         // � ��� ���� �����. ������: ��������� ������ ����� ����������

        String text = "� ��� ���� �����. ������: ��������� ������ ����� ����������";
        text = text.replace('.','\0');
        text = text.replace(':','\0');
        text = text.replace('-','\0');
        text = text.replace(';','\0');
        System.out.println(text);
    }
}

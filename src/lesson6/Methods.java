package lesson6;

public class Methods {
    /**
     * 1) ��������� ����������� �������� 3 ������� ������������, � ����� ������ �������� �� ������� �������
     * 2) �������� � ����� 4 �����, ����� ���������� ������� ����� �� 4�
     * 3) �������� � ����� �����, ����� ������ ���������� �� ������� ��� �� �����, ������ �������� ��������� �������
     * 4) �������� � ����� ��� ������� ������������, ����� ������ ���������� �� ������� ����� ��� �����������:
     * ��������������, �������������� ��� ��������������
     */

    //1) ��������� ����������� �������� 3 ������� ������������, � ����� ������ �������� �� ������� �������
    public static void printSquareTriangle(int a, int b, int c) {
        int perimeterTriangle = a + b + c;
        double s = (perimeterTriangle / 2) * ((perimeterTriangle / 2) - a) * ((perimeterTriangle / 2) - b) * ((perimeterTriangle / 2) - c);
        double squareTriangle = Math.sqrt(s);
        System.out.println(squareTriangle);
        System.out.println();

    }

    //2) �������� � ����� 4 �����, ����� ���������� ������� ����� �� 4�
    public static int lesserNumber(int a, int b, int c, int d) {
        if (a == b || a == c || a == d || b == c || b == d || c == d) {
            System.out.println("������� ������ �����");
        }
        if (a < b && a < c && a < d) {
            return a;
        }
        if (b < a && b < c && b < d) {
            return b;
        }
        if (c < a && c < b && c < d) {
            return c;
        }
        return d;
    }

    //3) �������� � ����� �����, ����� ������ ���������� �� ������� ��� �� �����, ������ �������� ��������� �������
    public static void wordOnTitleLetters(String text) {
        String titleLetters = text.toUpperCase();
        System.out.println(titleLetters);
    }

    //4) �������� � ����� ��� ������� ������������, ����� ������ ���������� �� ������� ����� ��� �����������:
    //     * ��������������, �������������� ��� ��������������

    public static void typeOfTriangle(int a, int b, int c) {

        if (a == b && b == c && c == a) {
            System.out.println("��� �������������� �����������");
        } else if (a != b && b != c && c != a) {
            System.out.println("��� �������������� �����������");
        } else {
            System.out.println("��� �������������� �����������");
        }
    }

}





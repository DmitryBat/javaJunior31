package lesson2;

public class Main9 {
    public static void main(String[] args) {
        // ���� ��� ����� (������ � ������ �����������)
        // ����� ����� ����������� ����� �����������

        int znam1 = 4;
        int znam2 = 6;

        // �� 6 ---> �� 6 * 24

        int bigestZnam;
        if (znam1 > znam2) {
            bigestZnam = znam1;
        } else {
            bigestZnam = znam2;
        }
        for (int i = bigestZnam; i <= znam1 * znam2; i++) {
            if (i % znam1 == 0 && i % znam2 == 0) {
                System.out.println(i);
                break;
            }
        }
    }

}

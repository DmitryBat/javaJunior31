package lesson8;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("�����");
        user.setLocation("������");
        user.setRegistration(new Date());

        Tovar tovar = new Tovar();
        tovar.setArticul("49627053");
        tovar.setFullPrice(6690);
        tovar.setSalePrice(4683);
        tovar.setFullName("Gorenje / ������ ������������� K17CLIN");
        tovar.setStatus(2);

        Otziv otziv = new Otziv();
        otziv.setUser(user);
        otziv.setDate(new Date());
        otziv.setReit(5);
        otziv.setDescription("������ ����� ��������! ������ �����������!!! ��, �� ������ ������������ ��������� � ������ ��������� ������, " +
                "���� ��������� �� ������� ����� ����� ���������. " +
                "���� ��������� ���� �����, �� ���������, ������, �������" +
                " ��� ����� ������ ������� � ��� �� ������. ��� ���� ��� �� ��������" +
                " - ����� �������� ���������, ������ ������ �� ���� �� �����" +
                " ���������� ������, ������ ���. �������� � ����������� ��������," +
                " ��� ����� ������ ������ �������� � ���� ��������" +
                " \uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D");

        otziv.setLike(1);

        tovar.addOtziv(otziv);
        System.out.println();
    }
}

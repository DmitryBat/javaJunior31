package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        //- ������ ������� � ��� ���� - 1000 ������
        //- ��������� ����� - 230 ������
        //- ��������� ������ - 26 ������
        //- ��������� ������� - 2,5 �����

        int cash = 1000;
        int pizzaPrice = 230;
        int gumPrice = 26;
        double candiesPrice = 2.5;

        //������ �������� ��������� ����, ����� �� ����� ������ �������� ������,
        //����� �� ���������� ����� ������ ������.
        //� ���������� ��� ����� ������� �������������� ������� � ������� �� ������� �������� ��� ����� ����������:
        //�� ��� ������ �� ����� ������:
        //- 4 �����
        //- 3 ������
        //- 0 ������
        //����� � ��������: 2 �����.

        int quantityPizza = cash / pizzaPrice;
        int cashAfterPizzaBuying = cash - pizzaPrice * quantityPizza;
        int quantityGum = cashAfterPizzaBuying / gumPrice;
        int cashAfterGumBuying = cashAfterPizzaBuying - gumPrice * quantityGum;
        int quantityCandies = (int) (cashAfterGumBuying / candiesPrice);
        double cashAfterCandiesBuying = cashAfterGumBuying - candiesPrice * quantityCandies;

        System.out.println("�� " + cash + " ��� �� ����� ������:");
        System.out.println(quantityPizza + " �����");
        System.out.println(quantityGum + " ������");
        System.out.println(quantityCandies + " ������");
        System.out.println("����� � ��������: " + cashAfterCandiesBuying + " ���");
    }
}

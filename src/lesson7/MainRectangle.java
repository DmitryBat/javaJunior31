package lesson7;

public class MainRectangle {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setA(5);
        rectangle.setB(5);

        int perimeterRectangle = rectangle.perimetrRectangle();
        System.out.println("�������� �������������� �����: " + perimeterRectangle);

        int squareRectangle = rectangle.squareRectangle();
        System.out.println("������� �������������� �����: " + squareRectangle);

        double diagonalRectangle =rectangle.diagonalRectangle();
        System.out.println("��������� �������������� �����: " + diagonalRectangle);

        double acuteAnglelBetweenDiagonal = rectangle.acuteAnglelBetweenDiagonal();
        System.out.println("������ ���� ����� ����������� ������: " + acuteAnglelBetweenDiagonal + " sin");

        double anglelBetweenDiagonalAndSyde = rectangle.anglelBetweenDiagonalAndSyde();
        System.out.println("���� ����� ���������� � �������� �����: " + anglelBetweenDiagonalAndSyde + " sin");

        rectangle.infoRectangle();
        rectangle.typeRectangle();
    }
}

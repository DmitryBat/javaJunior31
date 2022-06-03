package lesson3;
import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        // ���������� ���������� �� �������� ������� � ��������� ������ �����

        System.out.println("�������� ������:");
        System.out.println("1 - �������");
        System.out.println("2 - �������������");
        System.out.println("3 - �����������");
        System.out.println("4 - ��������");
        System.out.println("5 - ����/������");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        if (figura.equals("1") || figura.equalsIgnoreCase("�������")) {
            System.out.println("������� ������� ��������");
            String storona = scanner.nextLine();
            // "34" --> int
            int a = Integer.parseInt(storona);
            System.out.println("�������� ��������: " + (a + a + a + a));
            System.out.println("������� ��������: " + (a * a));
        }

        // �������� ������� �� ���������� �������
        if (figura.equals("2") || figura.equalsIgnoreCase("�������������")) {
            System.out.println("������� ������� ������� ��������������");
            String storona1 = scanner.nextLine();
            System.out.println("������� ������� ������� ��������������");
            String storona2 = scanner.nextLine();
            int a2 = Integer.parseInt(storona1);
            int b2 = Integer.parseInt(storona2);
            System.out.println("�������� ��������������: " + ((a2 + b2) * 2));
            System.out.println("������� ��������������: " + (a2 * b2));
        }

        if (figura.equals("3") || figura.equalsIgnoreCase("�����������")) {
            System.out.println("������� ������ ������� ������������");
            String storona1 = scanner.nextLine();
            System.out.println("������� ������ ������� ������������");
            String storona2 = scanner.nextLine();
            System.out.println("������� ������ ������� ������������");
            String storona3 = scanner.nextLine();
            int a3 = Integer.parseInt(storona1);
            int b3 = Integer.parseInt(storona2);
            int c3 = Integer.parseInt(storona3);
            int perimeterTriangle = a3 + b3 + c3;
            double s = (perimeterTriangle / 2) * ((perimeterTriangle / 2) - a3) * ((perimeterTriangle / 2) - b3) * ((perimeterTriangle / 2) - c3);
            double squareTriangle = Math.sqrt(s);
            double h = (2*Math.sqrt((perimeterTriangle / 2)*(perimeterTriangle / 2-a3)*(perimeterTriangle / 2-b3)*(perimeterTriangle / 2-c3)))/a3;
            double cosA = Math.toRadians(Math.cos(a3*a3+c3*c3-b3*b3)/(2*a3*c3));
            System.out.println("�������� ������������: " + (perimeterTriangle));
            System.out.println("������� ������������: " + (squareTriangle));
            System.out.println("������ ������������: " + h);
            System.out.println("������� ���� �: "+cosA);
        }

        if (figura.equals("4") || figura.equalsIgnoreCase("��������")) {
            System.out.println("������� ������ ��������� ��������");
            String storona1 = scanner.nextLine();
            System.out.println("������� ������ ��������� ��������");
            String storona2 = scanner.nextLine();
            System.out.println("������� ������ ������� ��������");
            String storona3 = scanner.nextLine();
            System.out.println("������� ��������� ������� ��������");
            String storona4 = scanner.nextLine();
            System.out.println("������� ������ ��������");
            String height = scanner.nextLine();
            int a4 = Integer.parseInt(storona1);
            int b4 = Integer.parseInt(storona2);
            int c4 = Integer.parseInt(storona3);
            int d4 = Integer.parseInt(storona4);
            int h = Integer.parseInt(height);
            int perimeterTrapeze = a4 + b4 + c4 + d4;
            double squareTrapeze = ((a4 + b4) / 2 * h);
            System.out.println("�������� ��������: " + (perimeterTrapeze));
            System.out.println("������� ��������: " + (squareTrapeze));
        }
        if (figura.equals("5") || figura.equalsIgnoreCase("����") || figura.equalsIgnoreCase("������")) {
            System.out.println("������� ����� ������� ������� �����/�������");
            String poluosLesser = scanner.nextLine();
            System.out.println("������� ����� ������� ������� �����/�������");
            String poluosBigger = scanner.nextLine();

            int a5 = Integer.parseInt(poluosLesser);
            int b5 = Integer.parseInt(poluosBigger);

            double perimeterOval = 4 * ((3.14 * a5 * b5 + (a5 - b5) * (a5 - b5)) / (a5 + b5));

            double squareOval = 3.14 * a5 * b5;
            System.out.println("�������� �����: " + (perimeterOval));
            System.out.println("������� �����: " + (squareOval));
        }
    }

}

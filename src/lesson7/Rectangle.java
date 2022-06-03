package lesson7;

public class Rectangle {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int perimetrRectangle() {
        return (this.a + this.b) * 2;
    }

    public int squareRectangle() {
        return this.a * this.b;
    }

    public double diagonalRectangle() {
        return Math.sqrt(this.a * this.a + this.b * this.b);
    }

    public double acuteAnglelBetweenDiagonal() {
        return (2 * squareRectangle()) / (diagonalRectangle() * diagonalRectangle());
    }

    public double anglelBetweenDiagonalAndSyde() {
        return acuteAnglelBetweenDiagonal() / 2;
    }

    public void typeRectangle(){
        if(this.a == this.b){
            System.out.println("\n��� ��� ������� �������������� �����, �� ��� �������!");
        }
        else {
            System.out.println("��� ������������� �� ��������� " + this.a + " � " + this.b);
        }
    }
    public void infoRectangle() {
        System.out.println("\n���������� � ��������������:");
        System.out.println("������ A ��������������: " + this.a);
        System.out.println("������ B ��������������: " + this.b);
        System.out.println("�������� �������������� �����: " + perimetrRectangle());
        System.out.println("������� �������������� �����: " + squareRectangle());
        System.out.println("��������� �������������� �����: " + diagonalRectangle());
        System.out.println("������ ���� ����� ����������� ������: " + acuteAnglelBetweenDiagonal() + " sin");
        System.out.println("���� ����� ���������� � �������� �����: " + anglelBetweenDiagonalAndSyde() + " sin");
    }
}


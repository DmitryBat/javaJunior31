package lesson7;

public class Triangle {
    private int a;
    private int b;
    private int c;
    //private double halfPerimetr = (this.a + this.b + this.c) / 2;

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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int perimetr() {
        return this.a + this.b + this.c;// ����� ������ a+b+c
    }

//    public double getHalfPerimetr() {
//        return halfPerimetr;
//    }

    private double halfPerimetr()
    {
        return (this.a + this.b + this.c) / 2;
    }
    public void poluPerimetr(){
        System.out.println(halfPerimetr());
    }

    public double height() {
        return (2 * Math.sqrt(halfPerimetr()* (halfPerimetr() - this.a) * (halfPerimetr() - this.b) * (halfPerimetr() - this.c))) / this.a;
    }

    public double cornerA() {
        //double corner = (this.a * this.a + this.c * this.c - this.b * this.b) / (2 * this.a * this.c);
        double corner = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        return corner;
    }

    //4
    public void infoTriangle() {
        System.out.println("���������� � ������������:");
        System.out.println("������ � ������������: " + this.a);
        System.out.println("������ � ������������: " + this.b);
        System.out.println("������ � ������������: " + this.c);
        System.out.println("�������� ������������ �����: " + perimetr());
        System.out.println("������ ������������ �����: " + this.height());
        System.out.println("������� ���� � �����: " + cornerA());
        System.out.println("��� ������������ �� ��������: ");
        typeTriangle();


    }

    //5
    public void typeTriangle() {
        if (this.a == this.b && this.b == this.c && this.c == this.a) {
            System.out.println("��� �������������� �����������");
        } else if (this.a != this.b && this.b != this.c && this.c != this.a) {
            System.out.println("��� �������������� �����������");
        } else {
            System.out.println("��� �������������� �����������");
        }

    }



    // 1 - ������� ������� ������������ (��������)
    // 2*** - ���������� ���� ������������
    // 3*** - ������� ������ ������������

    // 4 - ����� ������� ����� �������� �� ������� ��� ���������� � ������������
    // 5 - �����, ������� ����� ���������� ����� ��� ��� ������������

    // ��������� ������ ���������� ������� ������: �������������, �������, ����, ����
    // � ������� ��� ��� �� �� �����
}

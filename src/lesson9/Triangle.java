package lesson9;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

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
        return a + b + c;
    }

    public void typeTriangle() {
        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }

    }

    public void infoTriangle() {
        System.out.println("Информация о треугольнике:");
        System.out.println("Сторна А треугольника: " + a);
        System.out.println("Сторна B треугольника: " + b);
        System.out.println("Сторна C треугольника: " + c);
        System.out.println("Периметр треугольника равен: " + perimetr());


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (a != triangle.a) return false;
        if (b != triangle.b) return false;
        return c == triangle.c;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        result = 31 * result + c;
        return result;
    }

    @Override
    public String toString() {
        return "Треугольник со сторонами " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

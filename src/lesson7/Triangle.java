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
        return this.a + this.b + this.c;// можно просто a+b+c
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
        System.out.println("Информация о треугольнике:");
        System.out.println("Сторна А треугольника: " + this.a);
        System.out.println("Сторна А треугольника: " + this.b);
        System.out.println("Сторна А треугольника: " + this.c);
        System.out.println("Периметр треугольника равен: " + perimetr());
        System.out.println("Высота треугольника равна: " + this.height());
        System.out.println("Косинус угла А равен: " + cornerA());
        System.out.println("Тип треугольника по сторонам: ");
        typeTriangle();


    }

    //5
    public void typeTriangle() {
        if (this.a == this.b && this.b == this.c && this.c == this.a) {
            System.out.println("Это равносторонний треугольник");
        } else if (this.a != this.b && this.b != this.c && this.c != this.a) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }

    }



    // 1 - вернуть площадь треугольника (периметр)
    // 2*** - напечатать углы треугольника
    // 3*** - вернуть высоту треугольника

    // 4 - метод который будет печатать на консоль всю информацию о треугольнике
    // 5 - метод, который будет определять какой это вид треугольника

    // наподобие класса Тругольник создать классы: Прямоугольник, Квадрат, Круг, Овал
    // и сделать для них то же самое
}

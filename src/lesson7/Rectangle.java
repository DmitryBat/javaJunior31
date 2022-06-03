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
            System.out.println("\nТак как стороны прямоугольника равны, то это квадрат!");
        }
        else {
            System.out.println("Это прямоугольник со сторонами " + this.a + " и " + this.b);
        }
    }
    public void infoRectangle() {
        System.out.println("\nИнформация о прямоугольнике:");
        System.out.println("Сторна A прямоугольника: " + this.a);
        System.out.println("Сторна B прямоугольника: " + this.b);
        System.out.println("Периметр прямоугольника равен: " + perimetrRectangle());
        System.out.println("Площадь прямоугольника равна: " + squareRectangle());
        System.out.println("Диагональ прямоугольника равна: " + diagonalRectangle());
        System.out.println("Острый угол между диагоналями раывен: " + acuteAnglelBetweenDiagonal() + " sin");
        System.out.println("Угол между диагональю и стороной равен: " + anglelBetweenDiagonalAndSyde() + " sin");
    }
}


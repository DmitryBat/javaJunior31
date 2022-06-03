package lesson7;

public class MainRectangle {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setA(5);
        rectangle.setB(5);

        int perimeterRectangle = rectangle.perimetrRectangle();
        System.out.println("Периметр прямоугольника равен: " + perimeterRectangle);

        int squareRectangle = rectangle.squareRectangle();
        System.out.println("Площадь прямоугольника равна: " + squareRectangle);

        double diagonalRectangle =rectangle.diagonalRectangle();
        System.out.println("Диагональ прямоугольника равна: " + diagonalRectangle);

        double acuteAnglelBetweenDiagonal = rectangle.acuteAnglelBetweenDiagonal();
        System.out.println("Острый угол между диагоналями раывен: " + acuteAnglelBetweenDiagonal + " sin");

        double anglelBetweenDiagonalAndSyde = rectangle.anglelBetweenDiagonalAndSyde();
        System.out.println("Угол между диагональю и стороной равен: " + anglelBetweenDiagonalAndSyde + " sin");

        rectangle.infoRectangle();
        rectangle.typeRectangle();
    }
}

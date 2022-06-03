package lesson9;

public class Main {
    public static void main(String[] args) {
        Krug krug1 = new Krug(12);
        Krug krug2 = new Krug(12);
        Krug krug3 = new Krug(15);

        Triangle triangle = new Triangle(3, 4, 4);

        Kvadrat kvadrat = new Kvadrat(5);

        Pryamougolnik pryamougolnik = new Pryamougolnik(kvadrat.getA(), 8);

        System.out.println(krug1.equals(krug2));

        System.out.println(krug1.hashCode());
        System.out.println(krug2.hashCode());
        System.out.println(krug3.hashCode());

        System.out.println(krug1.toString());

        System.out.println("\n" + triangle.toString());
        triangle.typeTriangle();
        triangle.infoTriangle();

        System.out.println("\n" + kvadrat.toString());
        System.out.println("Периметр квадрата равен " + kvadrat.perimetr());
        System.out.println("Площадь квадрата равна " + kvadrat.ploshad());
        System.out.println("Диагональ квадрата равна: " + kvadrat.diagonal());

        System.out.println("\n" + pryamougolnik.toString());
        System.out.println("Периметр прямоугольника равен " + pryamougolnik.perimetr());
        System.out.println("Диагональ прямоугольника равна " + pryamougolnik.diagonal());
        System.out.println("Площадь прямоугольника равна " + pryamougolnik.ploshad());
        System.out.println(pryamougolnik.hashCode());
    }
}

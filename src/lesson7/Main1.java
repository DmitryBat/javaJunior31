package lesson7;

public class Main1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setA(8);
        triangle.setB(4);
        triangle.setC(10);

        int perim = triangle.perimetr();
        double h = triangle.height();
        double aa = triangle.cornerA();
        System.out.println(perim);
        System.out.println(h);
        System.out.println(aa);

        triangle.typeTriangle();

        triangle.infoTriangle();
        System.out.println();
        triangle.poluPerimetr();






    }

}


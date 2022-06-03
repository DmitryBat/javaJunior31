package lesson10;

public class Main1 {
    public static void main(String[] args) {
        double[][] num1 = {{2, 5, 6, 5},
                           {4, 6, 7, 8},
                           {2, 5, 7, 8}};
        Matrix matrix1 = new Matrix(num1);

        double[][] num2 = {{2, 1, 1, 7},
                           {6, 7, 8, 9},
                           {1, 2, 3, 4}};
        Matrix matrix2 = new Matrix(num2);

       // matrix1.printToConsole();
       //System.out.println(matrix2.getValueAt(0, 20));
//        matrix2.setValueAt(0, 0, 444);
//        matrix2.printToConsole();

        // явный параметр - matrix2
        // неявный параметр - matrix1
        IMatrix resultAdd = matrix1.add(matrix2);
        resultAdd.printToConsole();



    }
}

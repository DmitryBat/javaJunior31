package lesson10;

public class Matrix implements IMatrix{
    private double[][] numbers;

    public Matrix(int rows, int cols){
        numbers = new double[rows][cols];

    }

    public Matrix(double[][] numbers){
        this.numbers = numbers;
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if(rowIndex < 0 || rowIndex >= getRows()){
            System.out.println("Неверный индекс строки!!! " + rowIndex);
            return 0;
        }
        if(colIndex < 0 || colIndex > getColumns() ){
            System.out.println("Неверный индекс колонки!!! " + colIndex);
            return 0;
        }

        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if(rowIndex < 0 || rowIndex >= getRows()){
            System.out.println("Неверный индекс строки!!! " + rowIndex);
            return;
        }
        if(colIndex < 0 || colIndex > getColumns() ){
            System.out.println("Неверный индекс колонки!!! " + colIndex);
            return;
        }
        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // явный параметр otherMatrix
        // неявный параметр - this

        if(otherMatrix.getRows() != this.getRows()){
            System.out.println("Строки матриц не совпадают");
            return null;
        }

        if(otherMatrix.getColumns() != this.getColumns()){
            System.out.println("Колонки матриц не совпадают");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++){
            for (int j = 0; j < result.getColumns(); j++){
                result.setValueAt(i, j, this.getValueAt(i , j) + otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j< numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();

        }
    }
}

package lesson9;

public class Pryamougolnik extends Kvadrat {

    private int b;

    public Pryamougolnik() {

    }

    public Pryamougolnik(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int perimetr() {
        return (getA() + b) * 2;
    }

    public double diagonal() {
        return Math.sqrt(getA() * getA() + b * b);
    }

    public int ploshad() {
        return getA() *  b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pryamougolnik that = (Pryamougolnik) o;

        return b == that.b;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + b;
        return result;
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами {" +
                "a = " + Pryamougolnik.super.getA() +
                " b = " + b +
                '}';
    }

}

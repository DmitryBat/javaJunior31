package lesson9;

public class Kvadrat {
    private int a;

    public Kvadrat() {
    }

    public Kvadrat(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int perimetr() {
        return a * 4;
    }
    public int ploshad() {
        return a * a;
    }
    public double diagonal() {
        return a * Math.sqrt(2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kvadrat kvadrat = (Kvadrat) o;

        return a == kvadrat.a;
    }

    @Override
    public int hashCode() {
        return a;
    }

    @Override
    public String toString() {
        return " вадрат со стороной " +
                " a = " + a +
                '}';
    }
}

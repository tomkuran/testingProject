package shapes;

public class Rectangle {
    private Pair a;
    private Pair b;

    public Rectangle(Pair a, Pair b) {
        this.a = a;
        this.b = b;
    }

    public Pair getA() {
        return a;
    }

    public void setA(Pair a) {
        this.a = a;
    }

    public Pair getB() {
        return b;
    }

    public void setB(Pair b) {
        this.b = b;
    }
}

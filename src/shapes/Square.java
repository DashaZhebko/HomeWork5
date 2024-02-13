package shapes;

import shapes.Geometric;

public class Square implements Geometric {
    private int a;
    private int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getSquare() {
        return a * b;
    }
}

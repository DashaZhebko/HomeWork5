package shapes;

import shapes.Geometric;

public class Triangle implements Geometric {
    private int side;
    private int h;

    public Triangle(int side, int h) {
        this.side = side;
        this.h = h;
    }

    @Override
    public double getSquare() {
        return 0.5*side*h;
    }
}

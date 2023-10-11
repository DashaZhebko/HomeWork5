package shapes;

public class Circle implements Geometric {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI*Math.pow(radius, 2);
    }
}

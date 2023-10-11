package shapes;

public class TotalResults {

    public static void showResults(){
        double totalSum = 0;
        Geometric [] figures = new Geometric[3] ;
        Circle circle = new Circle(5);
        Square square = new Square(2, 4);
        Triangle triangle = new Triangle(6, 2);

        figures[0] = circle;
        figures[1] = square;
        figures[2] = triangle;

        for (Geometric figure: figures) {
            totalSum += figure.getSquare();
        }
        System.out.printf("Total sum of figures is: %.4f", totalSum);
    }
}

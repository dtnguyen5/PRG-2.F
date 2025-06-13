package Červen.dedicnost.ukol3;

public class Main {
    public static void main(String[] args) {

        Shape s = new Shape();
        s.drawShape();

        Square square = new Square();
        square.size = 4;
        square.drawShape();

        Triangle triangle = new Triangle();
        triangle.height = 5;
        triangle.drawShape();

    }
}

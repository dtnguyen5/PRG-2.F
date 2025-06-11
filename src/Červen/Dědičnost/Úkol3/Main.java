package Červen.Dědičnost.Úkol3;

public class Main {
    public static void main(String[] args) {

        Shape s = new Shape();
        s.drawShape();
        System.out.println();

        Square square = new Square();
        square.size = 4;
        square.drawShape();
        System.out.println();

        Triangle triangle = new Triangle();
        triangle.height = 5;
        triangle.drawShape();
    }
}

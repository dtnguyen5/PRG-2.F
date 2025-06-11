package Červen.Dědičnost.Úkol3;

public class Triangle extends Shape {
    public int height = 1;

    @Override
    public void drawShape() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

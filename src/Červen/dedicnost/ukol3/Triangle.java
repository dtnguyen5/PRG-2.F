package Červen.dedicnost.ukol3;

public class Triangle extends Shape {
    public int base;
    public int height;

    @Override
    public void drawShape() {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

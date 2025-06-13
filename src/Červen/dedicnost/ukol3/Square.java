package Červen.dedicnost.ukol3;

public class Square extends Shape{
    public int size;

    @Override
    public void drawShape() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

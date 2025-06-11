package Červen.Dědičnost.Úkol3;

public class Square extends Shape    {
    public int size = 1;
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

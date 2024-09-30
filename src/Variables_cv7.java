import java.util.Random;

public class Variables_cv7 {
    public static void main(String[] args) {
        // náhodné generování čísla

        // první možnost

        int max = 50;
        int min = 12;
        // prvni moznost Math.random() * (max - min) min;

        // druha moznost dole

        Random rng = new Random();
        rng.nextInt(15, 50);
    }
}

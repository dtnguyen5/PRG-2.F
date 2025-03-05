package Září;

import java.util.Random;

public class Variables_cv6 {
    private static Random scn;

    public static void main(String[] args) {
        // načíst stupně celsius a převest na F
        // °F = °C × (9/5) + 32

        System.out.println("Zadej teplotu ve stupních celsius");
        double celsius = scn.nextDouble();
        double F = celsius * (9.0/5.0) + 32;

        System.out.println("Teplota ve F:" + F);
    }
}

package Leden;

import java.util.Scanner;

public class Metody_6 {

    public static double nacistStranu(String strana) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Zadejte délku " + strana + " strany obdélníku: ");
        return scn.nextDouble();
    }

    public static double vypocetObvodu(double a, double b) {
        return 2 * (a + b);
    }

    public static double vypocetObvodu(double a) {
        return 2 * (a + rekurzivniStrana(a));
    }

    public static double rekurzivniStrana(double a) {
        if (a == 0) {
            return 0;
        }
        return a;
    }

    public static double vypocetObsahu(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        double a = nacistStranu("první");
        double b = nacistStranu("druhou");

        double obvod = vypocetObvodu(a, b);
        double obvodRekurzivni = vypocetObvodu(a);
        double obsah = vypocetObsahu(a, b);

        System.out.println("Obvod obdélníku: " + obvod);
        System.out.println("Obvod obdélníku (rekurzivně vypočítaný): " + obvodRekurzivni);
        System.out.println("Obsah obdélníku: " + obsah);

    }
}

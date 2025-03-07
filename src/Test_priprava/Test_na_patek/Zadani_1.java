package Test_priprava.Test_na_patek;

import java.util.Scanner;

public class Zadani_1 {

    // prvni moznost
    private static double soucetDvouCisel(double a, double b){

        double soucet = a + b;

        return soucet;
    }

    // druha moznost
    private static double soucetDvouCisel2(Scanner scn){

        System.out.println("Zadejte první cislo");
        double a = scn.nextDouble();

        System.out.println("Zadejte druhe cislo");
        double b = scn.nextDouble();

        double soucet = a + b;
        return soucet;
    }



    // treti moznost

    private static void soucetDvouCisel3(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Zadejte prvni cislo");
        double a = scn.nextDouble();

        System.out.println("Zadejte druhe cislo");
        double b = scn.nextDouble();

        double soucet = a + b;

        System.out.println("Soucet dvou cisel: " + soucet);

    }

    public static void main(String[] args) {

        // Příklad 1: Součet dvou čísel
        //Vytvořte metodu, která přijme dvě čísla a vrátí jejich součet.

        Scanner scn = new Scanner(System.in);

        // Prvni moznost
        System.out.println("Součet dvou čísel je: " + soucetDvouCisel(10,20));

        // Druha moznost
        System.out.println("Součet dvou čísel je: " + soucetDvouCisel2(scn));

        //treti moznost - kdyby nechtel abych to musel vratit
        soucetDvouCisel3();

        scn.close();
    }
}

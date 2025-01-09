package Leden;

import java.util.Scanner;

public class Metody_2 {

    static double obvodTelesa() {
        int a = 10;
        int b = 5;
        double c = Math.PI;
        double obvod = c  * a * b;

        return obvod;

    }


    static double nactiCislo(int a){

        a += 15;

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadej cislo: ");
        double vstup = scn.nextDouble();

        return vstup;
    }

    static double nactiCisloo(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadej cislo: ");
        double vstup = scn.nextDouble();

        return vstup;
    }


    static void print(String msq){
        System.out.println(msq);
    }

    public static void main(String[] args) {

        double vysledekObvodu = obvodTelesa();

        System.out.println(vysledekObvodu);



        double vysledek = nactiCislo(505050);


        double vstup1 = nactiCisloo();
        double vstup2 = nactiCisloo();

        System.out.println(vstup1 + vstup2);



        print("Ahoj světe");




    }
}

package Říjen;

import java.util.Scanner;

public class While_cv {
    public static void main(String[] args) {
//        //1. ukol
//        Scanner sc = new Scanner(System.in);
//        int cislo;
//        int soucet = 0;
//
//        do {
//            System.out.println("Zadejte číslo: ");
//            cislo = sc.nextInt();
//            soucet += cislo;
//        } while (cislo != 0);
//        System.out.println("Součet: " + soucet);


        //2. ukol
//        Scanner sc = new Scanner(System.in);
//        int heslo = 3197;
//        int momPokus = 0;
//
//        while (momPokus != 3) {
//            momPokus ++;
//            System.out.println("Zadejte 4-místné heslo: ");
//            int hesloPokus = sc.nextInt();
//
//            if (hesloPokus == heslo) {
//                System.out.println("Přístup povolen.");
//                return;
//            }
//        }
//        System.out.println("Přístup zamítnut ty blude.");


        //3. ukol
        Scanner sc = new Scanner(System.in);
        int cislo;
        int pocetSudych = 0;

        do {
            System.out.println("Zadejte číslo: ");
            cislo = sc.nextInt();
            if (cislo % 2 == 0) {
                pocetSudych ++;
            }
        } while (cislo > 0);
        System.out.println("Počet sudých čísel: " + pocetSudych);
    }
}

package Test_priprava.Test_na_patek;

import java.util.Scanner;

public class Zadani_5 {

    // Jednodussi moznost
    private static int faktorial(int cislo){

        int vysledek = 1;

        for (int i = 2; i <= cislo ; i++) {
            vysledek *= i;
        }

        return vysledek;
    }

    // Rekurzivni moznost

    private static int faktorial2(int cislo){

        if (cislo == 0 || cislo == 1){
            return 1; // Faktoriál 0! a 1! je vždy 1
        }
        else {
            return cislo * faktorial2(cislo - 1); // Rekurzivni volani
        }

    }

    public static void main(String[] args) {

        // Příklad 5: Výpočet faktoriálu rekurzivně
        //Vytvořte metodu, která vypočítá faktoriál zadaného čísla pomocí rekurze. - REKURZE NE

        Scanner scn = new Scanner(System.in);

        // Jednodussi priklad
        System.out.println("Zadejte číslo: ");
        int cislo = scn.nextInt();

        if (cislo < 0){
            System.out.println("Číslo je záporné, faktoriál nelze provést");
        }
        else if (cislo == 0){
            System.out.println("Číslo je 0, nemohu provést faktoriál");
        }
        else {
            System.out.println("Faktoriál čísla " + cislo + " je " + faktorial(cislo));
        }


        // Rekurzivni moznost - jednodussi bude lepsi :), nejsem zadna velka hlava
        System.out.println("Zadejte číslo: ");
        int cislo2 = scn.nextInt();

        if (cislo < 0){
            System.out.println("Číslo je záporné, faktoriál nelze provést");
        }
        else if (cislo == 0) {
            System.out.println("Číslo je 0, nemohu provést faktoriál");
        }
        else{
            System.out.println("Faktoriál čísla " + cislo2 + " je " + faktorial(cislo2));
        }

        scn.close();
    }
}

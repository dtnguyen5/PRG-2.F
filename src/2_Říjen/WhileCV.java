package Říjen;

import java.util.Scanner;

public class WhileCV {
    public static void main(String[] args) {


        // Prvni cviceni

        /*

        Scanner scn = new Scanner(System.in);


        int vstup;
        int suma = 0;

        do {

            System.out.println("Zadejte číslo");
            vstup = scn.nextInt();
            suma += vstup;

        } while (vstup != 0);
        System.out.println("Součet je: " + suma);

         */


        // Druhe cviceni
        // heslo bude cislo (pin)

        /*

        Scanner scan = new Scanner(System.in);

        int spravneHeslo = 666;

        int pokus = 0;

        while (pokus != 3){

            pokus ++;

            System.out.println("Zadejte heslo");
            int hesloOdUzivatele = scan.nextInt();

            if (spravneHeslo == hesloOdUzivatele){
                System.out.println("Pristup povolen");
                return;
            }
        }
        System.out.println("Zamítnuto");

         */

        Scanner can = new Scanner(System.in);
        int vstup2;
        int pocetSudychCisel = 0;

        do {
            System.out.println("Zadejte číslo: ");
            vstup2 = can.nextInt();

            if (vstup2 % 2 == 0){
                pocetSudychCisel ++;
            }

        }while (vstup2 > 0);

        System.out.println("Pocet sudych cisel: " + pocetSudychCisel);







    }
}

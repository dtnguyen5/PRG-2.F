package Listopad;

import java.util.Scanner;

public class string_3 {
    public static void main(String[] args) {

        // prevadeni cisla z int na string a ze string na int
        // ukol 1

        /*

        String cislo = "123";
        int c = 53;

        String retezovaReprezentaceCisla =String.valueOf(c);
        int ciselnaReprezentaceRetezce = Integer.parseInt(cislo);

        ciselnaReprezentaceRetezce = ciselnaReprezentaceRetezce + 15;
        System.out.println(ciselnaReprezentaceRetezce);

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadejte cislo:");
        String radka = scn.nextLine();

        int ciselnaHodnotaRadky = Integer.parseInt(radka);
        ciselnaHodnotaRadky += 10;

        System.out.println("Nové číslo: " + ciselnaHodnotaRadky);
         */

        // ukol 2

        /*

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej větu: ");
        String veta = sc.nextLine();

        String zacatekVety = "Java";
        String konecVety = "rocks.";

        System.out.println("Řetězec začíná na " + zacatekVety + ": " + veta.startsWith(zacatekVety));
        System.out.println("Řetězec končí na " + konecVety + ": " + veta.endsWith(konecVety));

        sc.close();

         */

        // ukol 3

        // Nacist vstup
        Scanner scan = new Scanner(System.in);

        System.out.println("Zadejte vetu: ");
        String veta2 = scan.nextLine();

        System.out.println("Zadejte zacatek (index): ");
        int zacatek = scan.nextInt();
        System.out.println("Zadejte konec (index): ");
        int konec = scan.nextInt();
        // nacteno

        // Vypis
        System.out.println(veta2.substring(zacatek, konec));




    }
}

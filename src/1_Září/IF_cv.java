package Září;

import java.util.Scanner;

public class IF_cv {
    public static void main(String[] args) {

        /*
        Scanner snc = new Scanner(System.in);
        System.out.println("Zadejte číslo, které je dělitelné 5");
        int a = snc.nextInt();

        if (a % 5 == 0) {
            System.out.println("Je dělitelný pěti");
        } else {
            System.out.println("není dělitelný pěti");
        }
      */


    /*
    Random rdn = new Random();

        // Generování náhodných čísel od 1 do 6
        int soucet1 = rdn.nextInt(1, 7);  // číslo od 1 do 6
        int soucet2 = rdn.nextInt(1, 7);  // číslo od 1 do 6

        System.out.println("První hod: " + soucet1);
        System.out.println("Druhý hod: " + soucet2);

        // Podmínka pro výhru
        if (soucet1 + soucet2 >= 10 || soucet1 == soucet2) { // >= alespon 10, treba kdyz padne 11 tak stejne vyhral, kdyz padne 2 a 2 tak vyhral to je OR
            System.out.println("Vyhráli jste!");
        }else {
            System.out.println("Nevyhráli jste.");
        }
    */

       /*
       Scanner scn = new Scanner(System.in);

       System.out.println("Zadejte číslo");
       int cislo = scn.nextInt();

       if (cislo > -100 && cislo < 100 && cislo != 0 ){
           System.out.println("číslo spadá do intervalu (-100;100) a není nula");
       }
       else {
           System.out.println("Nesplňuje podmínky");
       }
    */

    /*
        // Cena lístku (např. bez slevy)
        double cenaZakladni = 200.0;
        Scanner scanner = new Scanner(System.in);

        // Vstup uživatele - věk
        System.out.println("Zadejte svůj věk: ");
        int vek = scanner.nextInt();

        double cenaPoSleve = cenaZakladni;

        // Kontrola věkových kategorií a výpočet slevy
        if (vek >= 1 && vek <= 12 || vek >= 70) {
            cenaPoSleve = cenaZakladni * 0.6; // Sleva 40 %
        } else if (vek >= 13 && vek <= 18) {
            cenaPoSleve = cenaZakladni * 0.8; // Sleva 20 %
        }

        // Výpis ceny po slevě
        System.out.println("Cena lístku po slevě: " + cenaPoSleve + " Kč");

        */

        // Cena za 1 m²
        int cenaZaM2 = 640;
        Scanner scanner = new Scanner(System.in);

        // Vstup uživatele
        System.out.println("Zadejte délku pozemku (v metrech): ");
        double delka = scanner.nextDouble();

        System.out.println("Zadejte šířku pozemku (v metrech): ");
        double sirka = scanner.nextDouble();

        System.out.println("Zadejte částku, kterou máte (v Kč): ");
        double penize = scanner.nextDouble();

        // Výpočet plochy pozemku a celkové ceny
        double plocha = delka * sirka;
        double cenaPozemku = plocha * cenaZaM2;

        // Kontrola, zda si uživatel může pozemek dovolit
        if (penize >= cenaPozemku) {
            System.out.println("Pozemek si můžete dovolit. Cena: " + cenaPozemku + " Kč");
        } else {
            System.out.println("Na pozemek nemáte dostatek peněz. Cena: " + cenaPozemku + " Kč");
        }





    }
}

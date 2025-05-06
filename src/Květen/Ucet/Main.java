package Květen.Ucet;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("cs", "CZ"));   // Kvůli desetinné čárce

        Scanner scn = new Scanner(System.in);

        Ucet ucet1 = new Ucet("Ctirad");
        Ucet ucet2 = new Ucet("Zikmund");

        ucet1.pridejCastku(10_000);
        ucet2.pridejCastku(30_000);

        System.out.println("💸 Převod 2 500 Kč z účtu 1 na účet 2:");
        ucet1.posliPenize(ucet2, 2_500);

        System.out.println("🏧 Výběr 1 000 Kč z účtu 1:");
        ucet1.vyberPenize(1_000);

        System.out.println("📊 Konečné zůstatky:");
        ucet1.vypisZustatek();
        ucet2.vypisZustatek();

        // Přidejte textové menu (Scanner) pro opakované vklady, výběry a převody.
        int volba = -1; // NGUYEN  DUY TIEP, PATRIK STAUBER, DAVID LIPERT, DANIEL KOZLÍK

        while (volba != 0){

            System.out.println("---------- MENU ----------");
            System.out.println("1 - Vložit na účet 1 ");
            System.out.println("2 - Vybrat z účtu 1 ");
            System.out.println("3 - Převod z účtu 1 na účet 2 ");


            System.out.println("Zadej volbu");
            volba = scn.nextInt();

            if (volba == 1 ){
                System.out.println("Zadej částku");
                double castka = scn.nextDouble();
                ucet1.pridejCastku(castka);
            }
            else if (volba == 2) {
                System.out.println("Zadej částku");
                double castka = scn.nextDouble();
                ucet1.vyberPenize(castka);
            }
            else if (volba == 3){
                System.out.println("Zadej částku pro převod ");
                double castka = scn.nextDouble();
                ucet1.posliPenize(ucet2, castka);
            }


        }
    }

}

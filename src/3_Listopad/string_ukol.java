package Listopad;

import java.util.Scanner;

public class string_ukol {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);


        System.out.println("Zadejte jméno: ");
        String jmeno = scn.nextLine();

        System.out.println("Zadejte příjmení: ");
        String prijmeni = scn.nextLine();


        String velkaJmena = jmeno.toUpperCase();
        String velkaPrijmeni = prijmeni.toUpperCase();


        String pozpatkuJmeno = "";

        for (int i = velkaJmena.length() - 1; i >= 0; i--) {
            pozpatkuJmeno += velkaJmena.charAt(i);
        }


        String pozpatkuPrijmeni = "";

        for (int i = velkaPrijmeni.length() - 1; i >= 0; i--) {
            pozpatkuPrijmeni += velkaPrijmeni.charAt(i);
        }

        System.out.println("Výpis:");
        System.out.println(pozpatkuJmeno + " " + pozpatkuPrijmeni);

        scn.close();
    }
}

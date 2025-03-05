package Listopad;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String jmeno = "Pepa Pepa";
        String prijmeni = "Skocdopole";

        /*

        prijmeni = prijmeni.replace("Skodcdople", "Nejezchleba");


        System.out.println(jmeno.charAt(5));

        System.out.println(jmeno.toLowerCase());
        System.out.println(jmeno.toUpperCase());
        System.out.println(jmeno.equals(prijmeni));
        System.out.println(jmeno.trim());
        System.out.println(jmeno.strip());

        System.out.println(jmeno.length());


        System.out.println(jmeno.indexOf("Pepa"));

         */

        // uzivatel zada vetu 2 slovech a chceme vedet delku

        Scanner scn = new Scanner(System.in);
        // Jak se nazývá hlavní město Zimbabwe

        /*

        int pocetSlov = 1;
        String veta = scn.nextLine();

        veta.indexOf(' ');

        for (int i = 0; i < veta.length() ; i++) {
            if (veta.charAt(i) == ' '){
                pocetSlov++;

            }
        }

         */

        String vetaa = scn.nextLine();

        System.out.println(vetaa.split(" ").length);




        scn.close();
    }
}

package Leden;

import java.util.Scanner;

public class Metody_ukol_3 {

    public static String jmenoOdUzivatele(Scanner scn){

        System.out.println("Zadejte své jméno:");
        return scn.next();

    }

    public static String prijmeniOdUzivatele(Scanner scn){
        System.out.println("Zadejte své příjmení:");
        return scn.next();
    }

    public static String generovaniJmena(String jmeno, String prijmeni){

        String uzivatelskeJmeno = "";

        if (jmeno.length() < 3 ){
            uzivatelskeJmeno += jmeno.toLowerCase();
        }
        else {
            uzivatelskeJmeno += jmeno.substring(0,3).toLowerCase();
        }

        if (prijmeni.length() < 3){
            uzivatelskeJmeno += prijmeni.toLowerCase();
        }
        else {
            uzivatelskeJmeno += prijmeni.substring(0,3).toLowerCase();
        }

        return uzivatelskeJmeno;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String jmeno = jmenoOdUzivatele(scn);
        String prijmeni = prijmeniOdUzivatele(scn);

        String uzivatelskeJmeno = generovaniJmena(jmeno, prijmeni);

        System.out.println("Navrhované uživatelské jméno: " + uzivatelskeJmeno);


        if (uzivatelskeJmeno.length() <= 5){
            System.out.println("Uzivatelské jméno je příliš krátké. Přidejte delší znak!");
        }
        else {
            System.out.println("Vaše uživatelské jméno je v pořádku");
        }

        scn.close();

    }
}

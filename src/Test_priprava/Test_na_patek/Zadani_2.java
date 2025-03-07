package Test_priprava.Test_na_patek;

import java.util.Scanner;

public class Zadani_2 {

    // prvni moznost
    private static boolean jeSude(Scanner scn){

        System.out.println("Zadejte sude cislo");
        int x = scn.nextInt();

        return x % 2 == 0;
    }

    // druha moznost - kdyby to chtel takhle
    private static void jeSude2(Scanner scn){

        System.out.println("Zadejte sude cislo");
        int x = scn.nextInt();

        if (x % 2 == 0){
            System.out.println("Cislo je sude");
        }
        else {
            System.out.println("Cisclo je liche");
        }

    }

    public static void main(String[] args) {

        // Příklad 2: Kontrola, zda je číslo sudé
        //Vytvořte metodu, která zkontroluje, zda je zadané číslo sudé, a vrátí hodnotu true nebo false.

        Scanner scn = new Scanner(System.in);

        // prvni moznost
        System.out.println("Cislo je: " + jeSude(scn));

        // druha moznost
        jeSude2(scn);

    }
}

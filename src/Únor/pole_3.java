package Únor;

import java.util.Arrays;
import java.util.Scanner;

public class pole_3 {


    public static void main(String[] args) {

        /*
        Úkol 2
        načtěte od uživatele celé kladné číslo (například 5.)
        poté od uživatele načtěte dalších n čísel (n je předchozí vstup od uživatele (třeba 5)) a uložíte ho do pole, se kterým pak budete pracovat v dalších úkolech
        TLDR: uživatel zadá délku pole a program pole naplní čísly.
         */

        Scanner scn = new Scanner(System.in);

        System.out.print("Zadejte počet čísel v poli: ");
        int n = scn.nextInt();

        int[] pole = new int[n];
        System.out.println("Zadejte " + n + " čísel:");
        for (int i = 0; i < n; i++) {
            pole[i] = scn.nextInt();
        }

        System.out.println("Zadané pole:");
        for (int num : pole) {
            System.out.print(num + " ");
        }


    }
}

package Únor;

import java.util.Scanner;

public class pole_7_predesly_ukol {
    public static void main(String[] args) {

        // Úkol 1
        //vytvořte si pole s 10 čísly.
        //Například;
        //{ 1 , 2 , 3 , 18 , -5 , -167 , 3 , 21 , 191 , 3 }
        //Pole vypište zepředu i pozpátku

        int[] pole = {1, 0, -5, 17, 1};
        for (int i = 0; i < pole.length ; i++) {
            System.out.println(pole[i]);
        }

        // alternativní moznost

        System.out.println(" ");
        for (int prvekPole: pole){
            System.out.println(prvekPole);

        }

        for (int i = pole.length - 1; i >= 0 ; i--) {
            System.out.println(pole[i]);
        }

        //Úkol 2
        //načtěte od uživatele celé kladné číslo (například 5.)
        //poté od uživatele načtěte dalších n čísel (n je předchozí vstup od uživatele (třeba 5)) a uložíte ho do pole, se kterým pak budete pracovat v dalších úkolech
        //TLDR: uživatel zadá délku pole a program pole naplní čísly.

        Scanner scn = new Scanner(System.in);

        System.out.print("Zadejte počet čísel v poli: ");
        int n = scn.nextInt();

        int[] pole2 = new int[n];
        System.out.println("Zadejte " + n + " čísel:");
        for (int i = 0; i < n; i++) {
            pole2[i] = scn.nextInt();
        }

        System.out.println("Zadané pole:");
        for (int num : pole2) {
            System.out.print(num + " ");
        }

    }
}

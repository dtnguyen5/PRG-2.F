package Říjen;

import java.util.Random;
import java.util.Scanner;

public class For_cv {
    public static void main(String[] args) {

        /*

        // Vytvoření Scanneru pro uživatelský vstup
        Scanner scanner = new Scanner(System.in);

        // Zadání dolní a horní meze
        System.out.print("Zadejte dolní mez (celé číslo): ");
        int dolniMez = scanner.nextInt();

        System.out.print("Zadejte horní mez (celé číslo): ");
        int horniMez = scanner.nextInt();

        // Výpis hodnot funkce pro daný rozsah
        for (int x = dolniMez; x <= horniMez; x++) {
            int y = 2 * x - 3; // Vypočítání hodnoty y
            System.out.println("pro x = " + x + ", y = " + y);
        }


         */

        /*

        //Úkol 2
        //načtěte od uživatele kladné celé číslo n
        //vypište součet čísel od 1 do n
        //n = 5;
        //součet = 1 + 2 + 3 + 4 + 5 = 15;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;


        for (int i = 1; i <= n ; i++ ){
            sum += i;
        }

        System.out.println("Soucet je suma: " + sum);

         */

        //vypište faktoriál čísla n které načtete od uživatele
        //můžete předpokládát, že uživatel zadá celé číslo od 0 do 12
        //pro n = 5;
        //faktorial = 5 * 4 * 3 * 2 * 1 = 120;

        /*

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int faktorial = 1;


        for (int i = n; i > 0; i-- ){
            faktorial *= i;
        }

        System.out.println("Faktorial je: " + faktorial);

         */


        // Ruska ruleta

        int dead = 13;
        Random rng = new Random();

        int hod = -1;


        for (int i = 1; i <= 10; i++ ){
            hod = rng.nextInt(1, 21);
            if (hod == dead){
                System.out.println("Zdechl si");
            }
        }


    }
}


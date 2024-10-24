package Říjen;

import java.util.Scanner;

public class For_cv {
    public static void main(String[] args) {

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



    }
}


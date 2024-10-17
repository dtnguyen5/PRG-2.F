package Září;

import java.util.Scanner;

public class Variables_cv8 {
    public static void main(String[] args) {
        // načíst od uživatele horní a spodní mez a vypište mu náhodné číslo v rozmezí

        // Načítání vstupu od uživatele
        Scanner scn_2 = new Scanner(System.in);

        // Načtení horní a spodní meze
        System.out.println("Zadejte spodní mez:");
        int s = scn_2.nextInt();  // spodní mez

        System.out.println("Zadejte horní mez:");
        int h = scn_2.nextInt();  // horní mez

        // Generování náhodného čísla v zadaném rozmezí
        int randomCislo = (int)(Math.random() * (h - s + 1)) + s;

        // Výpis vygenerovaného čísla
        System.out.println("Vygenerované číslo: " + randomCislo);
    }
}

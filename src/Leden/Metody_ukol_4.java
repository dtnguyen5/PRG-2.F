package Leden;

import java.util.Scanner;

public class Metody_ukol_4 {

    public static int sumOfDigits(int n){

        n = Math.abs(n); // Převádí mi záporné číslo na kládné

        if (n < 10) { // Pokud je číslo jednociferné, jeho součet číslic je číslo samotné.
            return n;
        }
        else {
            n = n%10 + sumOfDigits(n/10); // Jinak: Součet číslic čísla n = poslední číslice (n % 10) + součet číslic zbývající části (n / 10)
            return n;
        }
    };

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++) {

            System.out.println("Zadejte číslo: ");
            int cislo = scn.nextInt();
            System.out.println("Součet číslic čísla" + cislo + " je: " + sumOfDigits(cislo));

        }
    }
}

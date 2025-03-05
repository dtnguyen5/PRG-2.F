package Test_priprava.Test_na_patek;

import java.util.Scanner;

public class Zadani_6 {

    // Jednodussi zpusob
    private static int vypocetFibonaccihoCisla(int n){

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {

            int temp = a + b;
            a = b; // Posuneme 'a' na další Fibonacciho číslo
            b = temp; // // Posuneme 'b' na další Fibonacciho číslo
        }

        return a; // Po skončení cyklu 'a' obsahuje F(n)
    }

    // Rekurzivne
    private static int fibonacciRekurzivne(int n){

        if (n == 0){
            return 0;
        }
        else if (n == 1) {
            return 1;
        }

        return fibonacciRekurzivne(n - 1) + fibonacciRekurzivne(n - 2);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Jednodussi zpusob
        System.out.println("Zadej cislo n pro Fibonacciho cislo nebo co ja vim, jak to funguje: ");
        int n = scn.nextInt();

        if (n < 0){
            System.out.println("Číslo n nesmí být záporn=, napište kladné číslo");
        }
        else {
            System.out.println("Fibonacciho cislo je: " + vypocetFibonaccihoCisla(n));
        }


        //Rekurzivni zpusob
        System.out.println("Zadej cislo n pro Fibonacciho cislo nebo co ja vim, jak to funguje: ");
        int n2 = scn.nextInt();

        if (n2 < 0){
            System.out.println("Číslo n nesmí být záporn=, napište kladné číslo");
        }
        else {
            System.out.println("Fibonacciho cislo je: " + fibonacciRekurzivne(n2));
        }



        scn.close();
    }
}

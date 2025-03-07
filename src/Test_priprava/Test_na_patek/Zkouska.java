package Test_priprava.Test_na_patek;

import java.util.Arrays;
import java.util.Scanner;

public class Zkouska {

    // Příklad 1: Součet dvou čísel
/*
    private static double soucetDvouCisel(Scanner scn){

        System.out.println("Zadejte první číslo pro a");
        double a = scn.nextDouble();
        System.out.println("Zadejte druhé číslo pro b");
        double b = scn.nextDouble();
        double soucet = a + b;

        return soucet;
    }

 */

    // Příklad 2: Kontrola, zda je číslo sudé
/*
    private static boolean jeSude(Scanner scn){

        System.out.println("Zadejte sudé číslo pro x");
        int x = scn.nextInt();

        return x % 2 == 0;
    }

 */

   // Příklad 3: Vytvoření uvítací zprávy
/*
    private static String uvitaciZprava(String jmeno){

        String pozdrav = "Ahoj " + jmeno;
        return pozdrav;
    }
 */

    // Příklad 4: Přetížená metoda pro výpočet mocniny
/*
    private static double mocnina(Scanner scn){

        System.out.println("Zadejte základ pro a");
        double a = scn.nextDouble();
        System.out.println("Zadejte exponent pro b");
        double b = scn.nextDouble();

        return Math.pow(a,b);
    }

 */

    // Příklad 5: Výpočet faktoriálu
/*-
    private static int faktorial(int cislo){

        int vysledek = 1;

        for (int i = 2; i <= cislo ; i++) {
            vysledek *= i;
        }

        return vysledek;
    }

 */

    // Příklad 6: Výpočet Fibonacciho čísla
    /*
    private static int fibonacci(int n){

        int a = 0;
        int b = 1;

        for (int i = 0; i < n ; i++) {

            int temp = a + b;
            a = b;
            b = temp;

        }
        return a;
    }

     */

    // Příklad 7: Bubble sort – třídění pole metodou
/*
    private static void bubbleSort(int [] pole){

        int n = pole.length;
        boolean vymena;

        for (int i = 0; i < n - 1 ; i++) {
            vymena = false;

            for (int j = 0; j < n - 1 ; j++) {

                if (pole[j] > pole[j + 1]){

                    int temp = pole[j];
                    pole[j] = pole[j + 1];
                    pole[j + 1] = temp;
                    vymena = true;
                }

            }
            if (!vymena){
                break;
            }

        }
    }

 */

    // Příklad 8: Zdvojnásobení hodnot v poli
/*
    private static int [] zdvojnasobeniPole(int[] pole){

        int[] novePole = new int[pole.length];

        for (int i = 0; i < pole.length ; i++) {

            novePole[i] = pole[i] * 2;
        }

        return novePole;
    }

 */

    // Příklad 9: Filtrace pole – vrácení pouze sudých čísel
    private static int[] vraceniSudychCisel(int [] pole){

        int [] sudaCisla = new int[pole.length];
        int index = 0;

        for (int i = 0; i < pole.length; i++) {

            if (pole[i] % 2 == 0 ){

                sudaCisla[index++] = pole[i];

            }

        }
        return Arrays.copyOf(sudaCisla, index);
    }

    public static void main(String[] args) {


        // Příklad 1: Součet dvou čísel

        Scanner scn = new Scanner(System.in);

        // Příklad 1: Součet dvou čísel
    /*
        System.out.println("Součet čísel dvou čísel je: " + soucetDvouCisel(scn));

    */
        // Příklad 2: Kontrola, zda je číslo sudé
        /*
        System.out.println("Číslo je: " + jeSude(scn));

         */

        // Příklad 3: Vytvoření uvítací zprávy
/*
        System.out.println(uvitaciZprava("Patriku"));

 */

        // Příklad 4: Přetížená metoda pro výpočet mocniny
        /*
        System.out.println("Výsledek po umocnění: " + mocnina(scn));
         */

       // Příklad 5: Výpočet faktoriálu
        /*

        System.out.println("Zadejte číslo pro faktorial");
        int cislo = scn.nextInt();

        if (cislo < 0){
            System.out.println("Číslo je záporné, faktoriál nelze provést");
        }
        else if (cislo == 0) {
            System.out.println("Číslo je nula, faktoriál nelze provést");
        }
        else {
            System.out.println("Faktoriál je: " + faktorial(cislo));
        }

         */

        // Příklad 6: Výpočet Fibonacciho čísla
/*
        System.out.println("Zadejte fibonacciho cislo");
        int n = scn.nextInt();

        System.out.println("Fibonacciho cislo pro n je: " + fibonacci(n));

 */

        // Příklad 7: Bubble sort – třídění pole metodou
/*
        int [] pole = {7, 6, 2, 1, 3, 9, 0 };

        bubbleSort(pole);
        System.out.println("Třídění pomocí bubblesortu: " + Arrays.toString(pole));

 */

        // Příklad 8: Zdvojnásobení hodnot v poli
        /*
        int [] pole = {1, 2, 3, 4, 5, 6, 7, 8,};

        zdvojnasobeniPole(pole);

        System.out.println("pole po zdvojnasobeni: " + Arrays.toString(zdvojnasobeniPole(pole)));

         */

        // Příklad 9: Filtrace pole – vrácení pouze sudých čísel

        int [] pole = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int [] sudaCisla = vraceniSudychCisel(pole);
        System.out.println("Vybrana suda cisla po filtraci: " + Arrays.toString(sudaCisla));


        scn.close();
    }

}

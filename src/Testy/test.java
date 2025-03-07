package Testy;

import java.util.Scanner;

public class test {

    // 1. Metoda pro převod jednoho čísla na záporné
    public static double makeNegative(double x) {

        if (x < 0){
            return x;
        }
        return -x;
    }


    // 2. Metoda swap pro pole celých číselt
    public static void swap(int[] arr, int pos1, int pos2) {

      int temp = arr[pos1];
      arr[pos1] = arr[pos2];
      arr[pos2] = temp;


    }

    public static void swap (double[] arr, int pos1, int pos2) {

        double temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;

    }


    // 3. Metoda, která projde pole a převede všechny prvky na záporné
    public static void makeAllNegative(double[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = makeNegative(arr[i]);
        }

    }

    public static void main(String[] args) {

        // 1. Metoda pro převod jednoho čísla na záporné

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadejte číslo");
        int x = scn.nextInt();
        System.out.println(makeNegative(x));




        // 2. Metoda swap pro pole celých čísel

        // Varianta A: Převod na záporné číslo
        //Metoda pro převod jednoho čísla na záporné.
        //
        //Vstup: Reálné (double) číslo
        //Výstup: Záporná hodnota tohoto čísla
        //Metoda swap(arr, pozice1, pozice2), která vymění dva prvky v poli.
        //
        //Přetížení pro pole celých čísel (int[]) a reálných čísel (double[])
        //Metoda, která projde pole reálných čísel a převede všechny prvky v poli na záporné.



        // Varianta 2: Druhá mocnina
        //Metoda pro převedení čísla na druhou mocninu.
        //Vstup: Reálné (double) číslo
        //
        //Výstup: Číslo umocněné na 2
        //
        //Metoda swap(arr, pozice1, pozice2), která vymění dva prvky v poli.
        //Přetížení pro pole celých čísel (int[]) a reálných čísel (double[])
        //Metoda, která projde pole a převede všechny prvky na druhou mocninu.


    }
}

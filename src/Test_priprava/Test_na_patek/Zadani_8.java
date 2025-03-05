package Test_priprava.Test_na_patek;

import java.util.Arrays;

public class Zadani_8 {

    //Prvni moznost
    private static int[] zdvojnasobeniPole(int[] pole){

        int[] novePole = new int[pole.length];

        for (int i = 0; i < pole.length; i++) {

            novePole[i] = pole[i] * 2;

        }

        return novePole;
    }

    // Druha moznost - asi jednodussi zpusob, neboli je kratší
    private static void zdvojnasobeniPole2(int[] pole){

        for (int i = 0; i < pole.length; i++) {

            pole[i] *= 2;
        }

    }

    public static void main(String[] args) {

        // Prvni moznost
        int [] pole = {1, 2, 3, 4, 5};
        System.out.println("Původní pole: " + Arrays.toString(pole));


        int [] novePole = zdvojnasobeniPole(pole);
        System.out.println("Pole po zdvojnásobení: " + Arrays.toString(novePole));


        // <------------------------------- Mezera ------------------------------->
        System.out.println();
        // <------------------------------- Mezera ------------------------------->

        // Druha moznost

        int [] pole2 = {1, 2, 3, 4, 5};
        System.out.println("Původní pole: " + Arrays.toString(pole2));

        zdvojnasobeniPole2(pole2);
        System.out.println("Pole po zdvojnásobení: " + Arrays.toString(pole2));

    }
}

package Test_priprava.Test_na_patek;

import java.util.Arrays;

public class Zadani_7 {

    // Prvni moznost
    private static void bubbleSort(int[] pole){

        int n = pole.length;

        for (int i = 0; i < n - 1 ; i++) {

            for (int j = 0; j < n - 1 ; j++) {

                // tady se porovnavaji sousedni prvky
                if (pole[j] > pole[j + 1]){

                    // Prohozeni cisel
                    int temp = pole[j];
                    pole[j] = pole[j + 1];
                    pole[j + 1] = temp;

                }
            }
        }
    }

    // Druha moznost
    private static void bubbleSort2(int[] pole){

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

    public static void main(String[] args) {

        //Příklad 7: Bubble sort – třídění pole metodou
        //Napište metodu, která setřídí zadané pole pomocí algoritmu Bubble Sort a vrátí setříděné pole.


        // Prvni moznost
        int[] pole = {8, 1 ,5 ,3 ,6 ,7 ,4};

        System.out.println("Původní pole: " + Arrays.toString(pole));

        bubbleSort(pole);

        System.out.println("Seřazení pole podle bubblesortu: " + Arrays.toString(pole));


        // Druha moznost
        int[] pole2 = {8, 1 ,5 ,3 ,6 ,7 ,4};

        System.out.println("Původní pole: " + Arrays.toString(pole2));

        bubbleSort2(pole2);

        System.out.println("Seřazení pole podle bubblesortu: " + Arrays.toString(pole2));

    }
}

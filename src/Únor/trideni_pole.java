package Únor;

import java.lang.reflect.Array;

public class trideni_pole {
    public static void main(String[] args) {

        // Bubblesort - porovnávání pak se prohodí

        String[] data = {"Bohdan", "Lucka", "Jakub", "Pavel"};
        int[] vysky = {200, 195, 190, 185};

        for (int j = 0; j < vysky.length; j++) {

            for (int i = 0; i < vysky.length - 1 ; i++) {

                if (vysky[0] > vysky[1]){
                    int temp = vysky[0]; // 180
                    vysky[0] = vysky[i + 1];
                    vysky[ i + 1] = temp;
                }
            }
        }

        // Array.sort(vysky); bude rychlejsi nez to co jsem zrobil

        for (int cislo : vysky) {
            System.out.println(cislo + "");
        }

    }
}

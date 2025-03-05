package Test_priprava.Test_na_patek;

import java.util.Arrays;

public class Zadani_9 {

    private static int[] filtracePoleSudychCisel(int[] pole){

        int [] sudaCisla = new int[pole.length]; // // Pole pro uchování sudých čísel
        int index = 0; // Pomocná proměnná pro přidávání do nového pole

        for (int i = 0; i < pole.length ; i++) {

            // // Kontrola, zda je číslo sudé
            if (pole[i] % 2 == 0){
                // Pokud je číslo sudé, přidáme ho do nového pole
                sudaCisla[index++] = pole[i]; // Uložíme do pole a zvýšíme index pro další číslo
            }

        }
        return Arrays.copyOf(sudaCisla, index); // Zkrácení pole na správnou velikost, ytvoříme nové pole, které bude mít velikost přesně odpovídající počtu sudých čísel. index obsahuje počet přidaných sudých čísel.
        // index -  Určuje, jak velká má být nová kopie pole. Tato hodnota znamená, že kopie bude mít přesně tolik prvků, kolik jsme uložili do pole sudaCisla

    }

    public static void main(String[] args) {

        int[] pole = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Původní pole: " + Arrays.toString(pole));

        int[] sudaCisla = filtracePoleSudychCisel(pole);
        System.out.println("Pole se sudými čísly: " + Arrays.toString(sudaCisla));

    }
}

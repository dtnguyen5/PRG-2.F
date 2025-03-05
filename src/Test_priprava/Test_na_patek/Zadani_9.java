package Test_priprava.Test_na_patek;

import java.util.Arrays;

public class Zadani_9 {

    private static int[] filtracePoleSudychCisel(int[] pole){

        int [] sudaCisla = new int[pole.length];
        int index = 0; // Pomocná proměnná pro přidávání do nového pole

        for (int i = 0; i < pole.length ; i++) {

            if (pole[i] % 2 == 0){
                sudaCisla[index++] = pole[i]; // Přidávání sudého čísla do nového pole
            }

        }
        return Arrays.copyOf(sudaCisla, index);
    }

    public static void main(String[] args) {

        int[] pole = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Původní pole: " + Arrays.toString(pole));

        int[] sudaCisla = filtracePoleSudychCisel(pole);
        System.out.println("Pole se sudými čísly: " + Arrays.toString(sudaCisla));

    }
}

package Říjen;

import java.util.Random;

public class While {
    public static void main(String[] args) {
        // vypsat vsechy sudy cisla od 0 - 1000, {..}


        int cisla = 0;

        while (cisla <= 1000){
            System.out.println(cisla);
            cisla += 2;
        }

        // simulujte hod kostkou, dokud nepadne 6, {}

        Random kostka = new Random();
        int hodKostky;
        do {
            hodKostky = kostka.nextInt(1, 7);
            System.out.println("Hodili jste číslo: " + hodKostky);
        } while(hodKostky != 6);
    }





}


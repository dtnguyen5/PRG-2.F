package Říjen;

public class For {
    public static void main(String[] args) {
        // Vypište všechny násobky 5 do čísla 1000.

//        for (int i = 0; i <= 1000; i += 5) {
//            System.out.println(i);
//        }

        /* Vypište všechny čísla od 100 do 0 */
//        for (int cislo = 100; cislo >= 0; cislo --) {
//            System.out.println(cislo);
//        }

        /* upravte předchozí příklad tak aby vypisoval 2 mocniny čísel */

//        for (int cislo = 100; cislo >= 0; cislo--) {
//            System.out.println(cislo * cislo);
//        }

        //vypsat malou násobilku
        //1. zpusob
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//        for (int i = 2; i <= 20; i+=2) {
//            System.out.println(i);
//        }
//        for (int i = 3; i <= 30; i+=3) {
//            System.out.println(i);
//        }
//        for (int i = 4; i <= 40; i+=4) {
//            System.out.println(i);
//        }
//        for (int i = 5; i <= 50; i+=5) {
//            System.out.println(i);
//        }
//        for (int i = 6; i <= 60; i+=6) {
//            System.out.println(i);
//        }
//        for (int i = 7; i <= 70; i+=7) {
//            System.out.println(i);
//        }
//        for (int i = 8; i <= 80; i+=8) {
//            System.out.println(i);
//        }
//        for (int i = 9; i <= 90; i+=9) {
//            System.out.println(i);
//        }
//        for (int i = 10; i <= 100; i+=10) {
//            System.out.println(i);
//        }


        //2. zpusob
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}

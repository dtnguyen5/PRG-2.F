package Únor;



public class pole_2 {
    public static void main(String[] args) {

        /*
        Červen.dedicnost.Úkol 1
        vytvořte si pole s 10 čísly.
                Například;
        { 1 , 2 , 3 , 18 , -5 , -167 , 3 , 21 , 191 , 3 }
        Pole vypište zepředu i pozpátku
        */

        // Červen.dedicnost.Úkol 1: Vytvoří a vypíše pole, nejprve normálně, pak pozpátku

        int[] pole = {1, 2, 3, 18, -5, -167, 3, 21, 191, 3};

        System.out.println("Pole zepředu:");
        for (int num : pole) {
            System.out.print(num + " ");
        }

        System.out.println("Pole pozpátku:");

        for (int i = pole.length - 1; i >= 0; i--) {
            System.out.print(pole[i] + " ");
        }

    }
}

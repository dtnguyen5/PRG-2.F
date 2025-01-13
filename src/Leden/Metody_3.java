package Leden;

public class Metody_3 {

    static void doubleOfA(int a){ // proémenna, která je nastavena jako parametr tak je vypsan tady

        a = a * 2;

        System.out.println(a); // zde mi vypíše 10
    }

    static void pridatKonec(StringBuilder text) {
        text.append(" konec");
    }

    public static void main(String[] args) {

        int a = 5;
        doubleOfA(a);

        System.out.println(a); // zde mi vypíše 5





        StringBuilder mujText = new StringBuilder("Začátek");

        System.out.println(mujText);

        pridatKonec(mujText);

        System.out.println(mujText);


    }
}

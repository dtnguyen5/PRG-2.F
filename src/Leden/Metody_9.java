package Leden;

public class Metody_9 {

    public static void vypis(String jmeno, int vek) {
        System.out.println("Jméno: " + jmeno + ", Věk: " + vek);
    }

    public static void vypis(int vek, String jmeno) {
        System.out.println("Věk: " + vek + ", Jméno: " + jmeno);
    }

    public static void main(String[] args) {

        vypis("Pepik", 25);
        vypis(30, "Honza");

    }
}

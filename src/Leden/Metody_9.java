package Leden;

public class Metody_9 {

    public static void vypis(String jmeno, int vek) {
        System.out.println("Jméno: " + jmeno + ", Věk: " + vek);
    }

    public static void vypis(int vek, String jmeno) {
        System.out.println("Věk: " + vek + ", Jméno: " + jmeno);
    }

    public static void main(String[] args) {

        //3. Výpis
        //Vytvořte metodu, která vypíše Jméno a věk uživatele.
        //Metoda bude schopná převzít tyto údaje v libovolném pořadí.

        vypis("Pepik", 25);
        vypis(30, "Honza");

    }
}

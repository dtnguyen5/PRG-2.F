package Leden;

public class Metody_7 {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static double suma(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {

        // 1. Suma
        //Vytvořte metodu, která sečte dva int a vrátí výsledek
        //Vytvořte druhou metodu se stejným jménem, která bude sčítat dva double a vrátí výsledek

        int vysledekInt = suma(5, 3);
        System.out.println("Suma int: " + vysledekInt);

        double vysledekDouble = suma(5.5, 3.3);
        System.out.println("Suma double: " + vysledekDouble);

    }
}

package Květen.Kruznice;

public class Main {
    public static void main(String[] args) {
        Kruznice kruznice = new Kruznice(); // vytvoření prázdného objektu

        kruznice.setPolomer(-7.5); // Hodnota předaná setteru je neplatná => nenastaví se

        kruznice.setPolomer(12.7);
        double polomerKruznice = kruznice.getPolomer();

        // Vypíše se: Hodnota polomeru kruznice je: 12.7
        System.out.println("Hodnota poloměru kružnice je: " + polomerKruznice);
    }
}

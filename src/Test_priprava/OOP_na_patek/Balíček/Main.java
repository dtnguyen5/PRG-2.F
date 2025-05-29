package Test_priprava.OOP_na_patek.Balíček;

public class Main {
    public static void main(String[] args) {

        // <--------------------- Vypsání ceny voláním cena() a slevovací kód--------------------->
        Balicek ppl = new Balicek("1ADSSA254", 1.25, 15.5, 2025, 6, 12);
        System.out.println("Slevovací kód: " + ppl.getId());
        System.out.println("Cena: " + ppl.cena() + "Kč");
    }
}

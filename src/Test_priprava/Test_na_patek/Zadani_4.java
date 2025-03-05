package Test_priprava.Test_na_patek;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Zadani_4 {

    // Prvni moznost

    private static double mocnina(Scanner scn){

        System.out.println("Zadejte prvni cislo");
        double a = scn.nextDouble();

        System.out.println("Zadejte druhe cislo");
        double b = scn.nextDouble();

        return Math.pow(a,b);
    }

    // Druha moznost
    private static double mocnina2 (double a, double b){
        return Math.pow(a,b);
    }

    // Treti moznost bez vraceni
    private static void mocnina3(){
        double a = 10;
        double b = 2;

        double mocnina = Math.pow(a, b);

        System.out.println("Výsledek: " + mocnina);
    }

    // Rekurzivni priklad
    private static double mocnina4(double zaklad, double exponent){

        if (exponent == 0){
            return 1; // Každé číslo umocněné na 0 je 1
        }
        else if (exponent > 0){
            return zaklad * mocnina4(zaklad, exponent - 1); // Rekurzivní volání pro kladný exponent
        }
        else {
            return 1 / mocnina4(zaklad, -exponent); // Převrácená hodnota pro záporný exponent
        }
    }

    public static void main(String[] args) {

        // Příklad 4: Přetížená metoda pro výpočet mocniny (rekurzivně) - rekurzivne to nechce, protoze moc slozity
        //Vytvořte metodu, která pomocí rekurze vypočítá mocninu zadaného čísla.

        Scanner scn = new Scanner(System.in);

        // Prvni moznost
        System.out.println("Výsledek: " + mocnina(scn));

        // Druha moznost
        System.out.println("Výsledek: " + mocnina2(5,2));

        // Treti moznost
        mocnina3();

        // Rekurzivni priklad

        System.out.println("Zadejte zaklad");
        double zaklad = scn.nextDouble();

        System.out.println("Zadejte exponent");
        double exponent = scn.nextDouble();

        System.out.println("Výsledek: " + mocnina4(zaklad, exponent));

    }
}

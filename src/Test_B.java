import java.util.Random;
import java.util.Scanner;

public class Test_B {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        System.out.println("Zadejte vaší výšku");
        int vyska = scn.nextInt();

        if (vyska <= 0 || vyska > 250){
            System.out.println("Zadejte výšku v rozmezí 0 - 250");
        }
        else {
            if (vyska >= 140 ){
                System.out.println("Můžete jet na horské dráze");
            }
            else {
                System.out.println("Nemůžete jet na horské dráze");
            }
        }




        Random rdn = new Random();

        int kostka1 = rdn.nextInt(1,7);
        int kostka2 = rdn.nextInt(1,7);

        System.out.println("hodnota první kostky je: " + kostka1);
        System.out.println("hodnota druhé kostky je: " + kostka2);

        int soucet = kostka1 + kostka2;

        if (soucet == 7 || soucet == 11){
            System.out.println("Gratuluji vyhráli jste, soucet kostek je:" + soucet);
        }
        else {
            System.out.println("Bohužel prohráli jste, soucet kostek je: " + soucet);
        }




        Scanner scn2 = new Scanner(System.in);

        int cenaJednohoLisku = 150;

        System.out.println("Zadejte pocet listku");
        int pocetListku = scn2.nextInt();

        double celkovaCena = 0;

        if (pocetListku <= 0 || pocetListku > 100){
            System.out.println("Zadejte počet lístků v rozmezí 0 - 100");
        }
        else {
            if ( pocetListku > 50){
                System.out.println("pokus o hromadný nákup");
            }
            else if(pocetListku >= 10){
                celkovaCena = pocetListku * cenaJednohoLisku * 0.7;
                System.out.println("Máte 15% slevu na listek");
            }
            else if (pocetListku >= 5) {
                celkovaCena = pocetListku * cenaJednohoLisku * 0.85;
                System.out.println("Máte 30% slevu na lístek");
            }
        }

        System.out.println("Zaplatíte celkem" + celkovaCena + "Kč");


    }
}

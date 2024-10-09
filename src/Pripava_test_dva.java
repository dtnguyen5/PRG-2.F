import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;
public class Pripava_test_dva {
    public class Priprava_na_test_2 {
        public static void main(String[] args) {

            // Zadani A 1-3

        /*
        Příklad 1
        Zadání
        Aby člověk mohl darovat krev, musí mu být alespoň 18 let.
        Nesmí mu být více než 65 let.
        Zeptejte se uživatele na věk a poté vypište, zda může darovat krev.
        Vstup
        Předpodkládejte vždy vstup od uživatele v rozsahu 0 - 100;
        Uživatel vždy zadá validní vstup (Né číslo s desetinou čárkou, řetězec, znak, apod.)
        Uživatel zadá právě jedno číslo.
        Výstup
        Pokud splní všechny podmínky -> Můžete darovat krev.
        Pokud nesplní všechny podmínky -> Nemůžete darovat krev.
         */

        /*
        Scanner scn = new Scanner(System.in);

        System.out.println("Zadejte váš věk");
        int vek = scn.nextInt();

        if (vek <= 0 || vek > 100){
            System.out.println("zadali jste neplatny vek, zadejte vek v rozmezi 1-100");
        }
        else if (vek >= 18 && vek < 65){
            System.out.println("Můžete darovat krev");
        }
        else {
            System.out.println("Nemůžete darovat krev");
        }

         */

        /*
        Příklad 2
        Zadání
        Simulujete tažení karet, ty mají hodnoty 1 – 12.
        Uživatel si táhne dvě (čísla jsou náhodně vygenerovaná).
        Uživatel vyhraje, pokud součet je přesně 21 anebo je menší než 10.
        Vypište, zda uživatel vyhrál.
        Vstup
        není vyžadován
        Výstup
        Hodnotu obou vygenerovaných karet
        Dle uvedené podmínky Vyhrál/Prohrál
         */

        /*

        vysledek druheho zadani

        Random rdn = new Random();

        int hodnotaKaret1 = rdn.nextInt(1,13);
        int hodnotaKaret2 = rdn.nextInt(1,13);

        System.out.println("Prvni hodnota: " + hodnotaKaret1);
        System.out.println("Druha hodnota: " + hodnotaKaret2);

        int soucet = hodnotaKaret1 + hodnotaKaret2;

        if (soucet == 21 || soucet < 10 ){
            System.out.println("Vyhráli jste, součet karet je: " + soucet);
        }
        else {
            System.out.println("Prohráli jste, součet karet je: " + soucet);
        }

         */

        /*
        Příklad 3
        Zadání
        Uživateli prodáváte gin.
        Uživatel zadá počet lahví, cena 1 ginu je 540,-
        Pokud je množství lahví do pěti, uživatel platí plnou sazbu.
        Pokud objednává do deseti lahví, má množstevní cenu 10 %.
        Pokud objednává do 50 lahví, má množstevní slevu 20 %.
        Pokud si objedná více, tak mu objednávku bude zamítnuta, protože se pravděpodobně jedná o překupnictví, to je trestné.
        Vypište, jakou celkovou cenu zaplatí, pokud bude objednávka zamítnuta, vypište tuto informaci do konzole a celková cena bude 0,
        Vstup
        Předpodkládejte vždy vstup od uživatele v rozsahu 0 - 100;
        Uživatel vždy zadá validní vstup (Né číslo s desetinou čárkou, řetězec, znak, apod.)
        Uživatel zadá právě jedno číslo.
        Výstup
        Celková cena za objednávku.
        0, pokud je objednávká zamítnuta a chybová hláška Pokus o překupnictví.
         */

            /*
         vysledek tretioho zadani
        Scanner scnLahve = new Scanner(System.in);

        int ginCena = 540;
        double celkovaCena = 0;

        System.out.println("Zadejte počet lahví");
        int pocetLahvi = scnLahve.nextInt();

        // Pokud objednávka překračuje 50 lahví
        if (pocetLahvi <= 0 || pocetLahvi > 100){
            System.out.println("Zadejte čísla mezi 0 - 100");
        }
        else if (pocetLahvi > 50) {
            System.out.println("Pokus o překupnictví");
            celkovaCena = 0; // Cena je 0 při zamítnutí objednávky
        }
        // Sleva 20 % pro objednávky od 11 do 50 lahví
        else if (pocetLahvi >= 11) {
            celkovaCena = pocetLahvi * ginCena * 0.8;
            System.out.println("Celková cena za objednávku se slevou 20 %: " + celkovaCena + " Kč");
        }
        // Sleva 10 % pro objednávky od 6 do 10 lahví
        else if (pocetLahvi >= 6) {
            celkovaCena = pocetLahvi * ginCena * 0.9;
            System.out.println("Celková cena za objednávku se slevou 10 %: " + celkovaCena + " Kč");
        }
        // Plná cena pro 1-5 lahví
        else if (pocetLahvi >= 1) {
            celkovaCena = pocetLahvi * ginCena;
            System.out.println("Platíte plnou cenu: " + celkovaCena + " Kč");
        }
        // Neplatný počet lahví (např. 0 nebo záporné číslo)
        else {
            System.out.println("Neplatný počet lahví");
        }

        scnLahve.close();

        */

        // B

        /*
        Příklad 1
        Zadání
        Aby člověk mohl darovat krev, musí vážit více než 50 kg a méně než 170 kg (nosnost křesla)
        Zeptejte se uživatele na váhu a vypište, zda může darovat krev.
        Vstup
        Předpodkládejte vždy vstup od uživatele v rozsahu 0 - 300;
        Uživatel vždy zadá validní vstup (Né číslo s desetinou čárkou, řetězec, znak, apod.)
        Uživatel zadá právě jedno číslo.
        Výstup
        Pokud splní všechny podmínky -> Můžete darovat krev.
        Pokud nesplní všechny podmínky -> Nemůžete darovat krev.
         */

            /*

            Vysledek prvni B zadani

            Scanner Scan = new Scanner(System.in);

            System.out.println("Zadejte vaší váhu");
            int vaha = Scan.nextInt();

            if (vaha <= 0 || vaha > 300){
                System.out.println("Zadali jste neplatnou váhu, zadejte vahu mezi 1 - 300");
            }
            else if (vaha > 50 && vaha < 170){
                System.out.println("Můžete darovat krev");
            }
            else {
                System.out.println("Nemůžete darovat krev");
            }



            /*
                Příklad 2
                Zadání
                Simulujete hození tří kostek.
                Kostky mají klasicky hodnotu 1 - 6, generovanou náhodně.
                Uživatel vyhrál, pokud jsou alespoň dvě kostky stejné
                Vypište, zda uživatel vyhrál.
                Vstup
                Není vyžadován
                Výstup
                Hodnoty všech hozených kostek
                Dle uvedené podmínky Vyhrál/Prohrál
             */

            /* reseni druhe B
            Random ran = new Random();

            int hodnotaKostky1 = ran.nextInt(1,7);
            int hodnotaKostky2 = ran.nextInt(1,7);
            int hodnotaKostky3 = ran.nextInt(1,7);

            System.out.println("Hodnota první kostky: " + hodnotaKostky1);
            System.out.println("Hodnota druhé kostky: " + hodnotaKostky2);
            System.out.println("Hodnota třetí kostky: " + hodnotaKostky3);

            if (hodnotaKostky1 == hodnotaKostky2 || hodnotaKostky2 == hodnotaKostky3 || hodnotaKostky1 == hodnotaKostky3){
                System.out.println("Vyhráli jste");
            }
            else {
                System.out.println("prohráli jste");
            }


             */


            /*
            Příklad 3
            Zadání
            Uživatel bude platit za elektřinu.

            Do programu zadá svou spotřebu (kWh).

            Podle toho, kolik spotřeboval, tak mu bude vypočtena cena za 1 kWh.

            Ceník je:

            spotřeba v kWh	Cena za 1 kWh
            0 – 199	8 Kč
            200 – 399	7 Kč
            400 - 599	6 Kč
            600 a více	5 Kč
            Vstup
            spotřeba elektřiny
            vždy celé číslo v rozmezí 0 - 10 000
            Uživatel vždy zadá validní vstup (Né číslo s desetinou čárkou, řetězec, znak, apod.)
            Uživatel zadá právě jedno číslo.
            Výstup
            Cena za elektřínu
             */

            Scanner can = new Scanner(System.in);

            System.out.println("Zadejte vasi spotrebu v kWh");
            int spotrebakWh = can.nextInt();

            double cenaZaJednukWh = 0;

            if (spotrebakWh <= 0 || spotrebakWh > 10000){
                System.out.println("Zadejte spotrebu mezi 0 - 10000");
            }
            else {
                if (spotrebakWh > 600){
                    cenaZaJednukWh = 5;
                }
                else if(spotrebakWh >= 400){
                    cenaZaJednukWh = 6;
                }
                else if (spotrebakWh >= 200) {
                    cenaZaJednukWh = 7;
                }
                else{
                    cenaZaJednukWh = 8;
                }
            }

            cenaZaJednukWh = spotrebakWh * cenaZaJednukWh;

            System.out.println("Cena za elektřinu je " + cenaZaJednukWh + "Kč");

        }
    }

}

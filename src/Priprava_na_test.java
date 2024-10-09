import java.util.Random;
import java.util.Scanner;

public class Priprava_na_test {
    public static void main(String[] args) {

        // 1 - 3 jsou zadani na AND = &&

       /* 1. Povolení vstupu na atrakci:
        Uživatel chce jít na adrenalinovou atrakci v zábavním parku.
                Aby mohl vstoupit, musí být starší než 12 let a jeho výška musí být alespoň 140 cm, ale ne více než 200 cm.
                Program se zeptá uživatele na věk a výšku, a poté vypíše, zda mu je vstup povolen.
        Vzorové řešení
        */

        // vysledek 1. zadaní

        /*

        Scanner scan = new Scanner(System.in);

        System.out.println("Zadejte svuj vek");
        int vek = scan.nextInt();

        System.out.println("Zadejte svoji vysku ");
        int vyska = scan.nextInt();

        if (vek > 12 && vyska >= 140 && vyska < 200){
            System.out.println("Splňujete vek a vyska, muzete vstoupit");
        }
        else {
            System.out.println("Bohuzel nespňujete naše požadavky, sem nemůžete");
        }

        */

        /*
        2. cviceni
            Uživatel se chce zaregistrovat na maraton, ale musí splnit dvě podmínky.
            Musí mít alespoň 18 let a musí mít tréninkový čas na 10 km menší než 60 minut.
            Program se zeptá uživatele na věk a čas na 10 km, a pokud splňuje obě podmínky, povolí registraci
            vypíše splněné podmínky pro registraci.
         */

        /*

        vysledek druheho zadani

        Scanner scn = new Scanner(System.in);

        System.out.println("Zadejte váš věk");
        int vek = scn.nextInt();

        System.out.println("Zadejte váš čas na 10 Km");
        double cas = scn.nextDouble(); //int

        if (vek >= 18 && cas < 60){
            System.out.println("Splňujete podmínky pro registraci");
        }
        else{
            System.out.println("Bohužel nespňujete naše podmínky, nekdy příště");
        }
        */

        /*
        3. Slevová akce:
        Uživatel získá slevu na nákup, pokud jeho věrnostní body překročí 100 a současně jeho nákupní košík obsahuje zboží v hodnotě alespoň 5000 Kč.
        Program se zeptá uživatele na počet věrnostních bodů a celkovou hodnotu košíku, a vypíše, zda uživatel získá slevu.
        Vzorové řešení
        */


        /*

        Vysledek tretiho zadani

        Scanner slevicka = new Scanner(System.in);

        System.out.println("Zadejte vaše věrnostní body");
        int body = slevicka.nextInt();

        System.out.println("Zadejte hodnotu vaše kosicku");
        int zbozi = slevicka.nextInt();

        if (body > 100 && zbozi >= 5000){
            System.out.println("Máte slevicku od náš");
        }
        else {
            System.out.println("Tak slevicka přístě");
        }
        */


        // 1 - 3 jsou zadani na OR = ||

        /*
        1. Generování dvou náhodných čísel (1-12)
        Napište program, který vygeneruje dvě náhodná čísla mezi 1 a 12 ( reprezentující hodnotu karet).
        Uživatel vyhraje, pokud je součet obou karet přesně 21 nebo menší než 10.
        Program vypíše, zda uživatel vyhrál nebo ne.
         */

        /*

        Vysledek prvniho "OR" zadani

        Random gen = new Random();

        int cislo = gen.nextInt(1,13);
        int cislo2 = gen.nextInt(1,13);

        System.out.println("Prvni cislo je: " + cislo);
        System.out.println("Druhé cislo je: " + cislo2);

        int soucetKaret= cislo + cislo2;

        if (soucetKaret == 21 || soucetKaret < 10){
            System.out.println("Vyhrali jste soucet karet je " + soucetKaret);
        }
        else {
            System.out.println("Nevyhráli jste, součet karet je " + soucetKaret);
        }
         */

        /*
            2. Hod dvou kostek:
            Napište program, který simuluje hození dvěma kostkami (hodnoty mezi 1 a 6).
            Uživatel vyhraje, pokud součet hozených hodnot je menší než 10 nebo pokud obě kostky mají hodnotu 6.
            Program vypíše, zda uživatel vyhrál.
         */

        /*  Vysledek druheho zadani v OR

        Random radnomKostky = new Random();

        int hodnota1 = radnomKostky.nextInt(1, 7);
        int hodnota2 = radnomKostky.nextInt(1, 7);

        System.out.println("hodnota prvni kostky je " + hodnota1);
        System.out.println("hodnota druhé kostky je " + hodnota2);

        int soucetKostek = hodnota1 + hodnota2;

        if (soucetKostek < 10 ||(hodnota1 == 6 && hodnota2 == 6)){
            System.out.println("Vyhrahli jste, soucet kostek je: " + soucetKostek);
        }
        else {
            System.out.println("Nevyhrali jste, soucet kostek je: " + soucetKostek);
        }
        */

        /*
           3. Hod tří kostek:
            Napište program, který simuluje hození třemi kostkami (hodnoty mezi 1 a 6).
            Uživatel vyhraje, pokud jsou alespoň dvě kostky stejné.
            Program vypíše, zda uživatel vyhrál.

         */

        /* Vysledek tretiho zadani v OR


        Random trikostky = new Random();

        int kostka1 = trikostky.nextInt(1,7);
        int kostka2 = trikostky.nextInt(1,7);
        int kostka3 = trikostky.nextInt(1,7);

        System.out.println("Prvni kostka je: " + kostka1);
        System.out.println("Druhá kostka je: " + kostka2);
        System.out.println("Třetí kostka je: " + kostka3);

        if (kostka1 == kostka2 || kostka2 == kostka3 || kostka3 == kostka1){
            System.out.println("Vyhráli jste, alespoň 2 kostky jsou stejné");
        }
        else{
            System.out.println("Bohuzel, nejsou zadne spolu stejne");
        }
         */


        // Praktické použití podmínek HAHA

        /*
        1. Pozdrav podle času:
            Napište program, který získá od uživatele aktuální hodinu (0–23) a na základě toho uživatele pozdraví.
            Pokud je hodina mezi 5 a 11, program vypíše "Dobré ráno".
            Pokud je hodina mezi 12 a 17, vypíše "Dobré odpoledne".
            Pokud je hodina mezi 18 a 4, vypíše "Dobrý večer".
         */


        /*
            prvni vysledek praktickeho pouziti podminky

        Scanner hodinaOdUzivatele = new Scanner(System.in);

        System.out.println("Zadejte cas");
        int hodina = hodinaOdUzivatele.nextInt();

        if (hodina >= 5 && hodina <= 11){
            System.out.println("Dobré ránko");
        }
        else if (hodina >= 12 && hodina <= 17){
            System.out.println("Dobré odpoledne");
        }
        else{
            System.out.println("Dobrý večer");
        }


         */

        /*

        /*
            2. Cenová kalkulace při prodeji vstupenek na koncert:
            Uživatel zadá počet vstupenek, které chce koupit na koncert.
            Cena jedné vstupenky je 1200 Kč.
                    Pokud uživatel objedná 1–5 vstupenek, platí plnou cenu.
            Pokud objedná 6–10 vstupenek, dostane slevu 15 %.
            Pokud objedná 11–20 vstupenek, dostane slevu 25 %.
            Pokud objedná více než 20 vstupenek, objednávka je zamítnuta, protože překračuje limit.
            Program vypíše celkovou cenu, kterou uživatel zaplatí, nebo informaci, že objednávka byla zamítnuta.
        */

        /*

        vysledek druheho zadani v prakticke podmince

        Scanner scn = new Scanner(System.in);

        int cenaJedneVstupenky = 1200;

        System.out.println("Zadejte počet vstupenek");
        int pocetVstupenek = scn.nextInt();

        double celkovaCena = 0;

        if (pocetVstupenek > 20) {
            System.out.println("Objednávka zamítnuta, překračujete limit");
        }
        // Sleva 25 % pro 11-20 vstupenek
        else if (pocetVstupenek >= 11) {
            celkovaCena = pocetVstupenek * cenaJedneVstupenky * 0.75;
            System.out.println("Celková cena se slevou 25 %: " + celkovaCena + " Kč");
        }
        // Sleva 15 % pro 6-10 vstupenek
        else if (pocetVstupenek >= 6) {
            celkovaCena = pocetVstupenek * cenaJedneVstupenky * 0.85;
            System.out.println("Celková cena se slevou 15 %: " + celkovaCena + " Kč");
        }
        // Plná cena pro 1-5 vstupenek
        else if (pocetVstupenek >= 1) {
            celkovaCena = pocetVstupenek * cenaJedneVstupenky;
            System.out.println("Celková cena: " + celkovaCena + " Kč");
        }
        // Pokud je zadán neplatný počet vstupenek (např. 0 nebo záporné číslo)
        else {
            System.out.println("Neplatný počet vstupenek");
        }
        */



        /*
        3. Výpočet ceny za spotřebu vody:
        Uživatel zadá svou měsíční spotřebu vody v litrech.

        Program vypočítá a vypíše, kolik uživatel zaplatí celkem za spotřebu vody za daný měsíc.

        Cena za 1 litr vody se odvíjí od spotřeby podle následujícího ceníku:

        spotřeba v litrech	Cena za 1 litr
        0 – 4999	0,03 Kč
        5000 – 9999	0,025 Kč
        10 000 – 14 999	0,02 Kč
        15 000 a více	0,015 Kč
         */


        /*
            vysledek spotreby vody

        Scanner voda = new Scanner(System.in);

        System.out.println("Zadejte vaší měsíční spotřebu vody");
        int spotreba = voda.nextInt();

        double cenaZaLitr = 0;

        if (spotreba >= 0 && spotreba<=4999){
            cenaZaLitr = 0.03;
        }
        else if (spotreba >= 5000 && spotreba <= 9999) {
            cenaZaLitr = 0.03;
        }
        else if (spotreba >= 10000 && spotreba <= 14999) {
            cenaZaLitr = 0.02;
        }
        else if(spotreba >= 15000){
            cenaZaLitr = 0.0015;
        }

        double celkovaSpotrebaVody = spotreba + cenaZaLitr;

        System.out.println("Celková spotřeba vody za měsic: " + celkovaSpotrebaVody + "Kč");

         */



    }
}

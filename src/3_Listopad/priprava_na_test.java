package Listopad;

import java.util.Random;
import java.util.Scanner;

public class priprava_na_test {
    public static void main(String[] args) {
        // Červen.dedicnost.Úkol 1

        Scanner input = new Scanner(System.in); // vytvoření scanneru

        int cislo = input.nextInt(); // načtení celého čísla
        double realneCislo = input.nextDouble(); // načtení reálného čísla
        String jmeno = input.next(); // načtení jednoho slova
        String veta = input.nextLine(); // načtení celé věty

        input.close();

// Úkol 2
        double a = 124.156;
        double b = 0.111;

        double soucet = a + b;
        double rozdil = a - b;
        double soucin = a * b;

        double podil = 0; // Výsledek při dělení nulou
        if (b != 0) {
            podil = a / b;
        }

        System.out.println(soucet);
        System.out.println(rozdil);
        System.out.println(soucin);
        System.out.println(podil);

// Úkol 3


        Random random = new Random();

        int kostka = random.nextInt(6) + 1; // Náhodné číslo 1-6 pro kostku
        int mince = random.nextInt(2); // Náhodné číslo 0-1 pro minci
        int karta = random.nextInt(52) + 1; // Náhodné číslo 1-52 pro karty

        System.out.println("Hod kostkou: " + kostka);
        System.out.println("Hod mincí: " + (mince == 0 ? "Panna" : "Orel"));
        System.out.println("Náhodná karta: " + karta);

// Úkol 4 a 5
        int x = 10;
        int y = 5;

        if (x > 5 && y <= 10) {
            System.out.println("Podmínka splněna");
        } else {
            System.out.println("Podmínka nesplněna");
        }

        int z = -10;
        if (z > 0) {
            System.out.println("Z je kladné číslo");
        } else if (z < 0) {
            System.out.println("Z je záporné číslo");
        } else {
            System.out.println("Z je rovno 0");
        }

// Úkol 6 a 7
// Typy cyklů:
// - While: Používá se, když nevíme předem počet iterací a chceme testovat podmínku na začátku.
// - Do While: Používá se, když chceme vykonat tělo cyklu alespoň jednou a testovat podmínku na konci.
// - For: Používá se, když známe předem počet iterací.

// Příklad použití:
// While
        int i = 0;
        while (i < 5) {
            System.out.println("While: " + i);
            i++;
        }

// Do While
        i = 0;
        do {
            System.out.println("Do While: " + i);
            i++;
        } while (i < 5);

// For
        for (int j = 0; j < 5; j++) {
            System.out.println("For: " + j);
        }

// Úkol 8
        int vysledek = 85 / 100;
// b: 0 (Výsledek je celočíselné dělení)

        String palindrom = "())(";
        boolean isTrue = !((palindrom.startsWith("()") || palindrom.endsWith(")(")) && palindrom.length() > 4);
// Výraz vrací true, protože podmínka uvnitř není splněna.

    // Úkol 9
            String test = "Dostanu jedničku.";

    // Metody length(), charAt(), indexOf()
            System.out.println(test.length()); // Vrací délku řetězce: 18
            System.out.println(test.charAt(3)); // Vrací znak na indexu 3: "t"
            System.out.println(test.indexOf("u")); // Vrací index prvního výskytu "u": 7



        //  Zadání 1: Rozmezí čísel
        // Doplň podmínku tak, aby kontrolovala, zda číslo x leží v rozmezí mezi 5 (včetně) a 10 (včetně):

        if(x >= 5 && x <= 10) {
            System.out.println("Číslo je v rozmezí 5 až 10");
        } else {
            System.out.println("Číslo není v rozmezí 5 až 10");
        }

        //Zadání 2: Porovnání dvou čísel
        //Ověř, zda je x větší než y, nebo zda jsou stejná:

        if(x >= y || x == y) {
            System.out.println("x je větší nebo rovno y");
        } else {
            System.out.println("x je menší než y");
        }


        //Zadání 3: Sudé nebo liché
        //Zjisti, zda je x sudé nebo liché číslo:


        if(x % 2 == 0) {
            System.out.println("x je sudé číslo");
        } else {
            System.out.println("x je liché číslo");
        }

            //Zadání 4: Testování hodnoty
            //Doplň podmínku, která ověří, zda hodnota z je kladná, záporná, nebo rovná nule:


        if(z > 0) {
            System.out.println("z je kladné číslo");
        } else if(z < 0) {
            System.out.println("z je záporné číslo");
        } else {
            System.out.println("z je rovno nule");
        }


        //Zadání 5: Pracovní doba
        //Zkontroluj, zda je aktuální čas (hodina hour) v rozmezí 9 až 17:

        /*
        if(hour >= 9 && hour <= 17) {
            System.out.println("Je pracovní doba");
        } else {
            System.out.println("Není pracovní doba");
        }
        */


        //Zadání 6: Roční období
        //Na základě hodnoty měsíce (1–12) vypiš, zda se jedná o zimu, jaro, léto, nebo podzim:
        /*
        if(month == 12 || month == 1 || month == 2) {
            System.out.println("Je zima");
        } else if(month >= 3 && month <= 5) {
            System.out.println("Je jaro");
        } else if(month >= 6 && month <= 8) {
            System.out.println("Je léto");
        } else {
            System.out.println("Je podzim");
        }

         */


        //Zadání 7: Platnost hesla
        //Doplň podmínku, která ověří, zda je heslo dlouhé alespoň 8 znaků a současně obsahuje písmeno a:

        String password = "heslo123";
        if(password.length() >= 8 && password.indexOf('a') != -1) {
            System.out.println("Heslo je platné");
        } else {
            System.out.println("Heslo není platné");
        }
        
        //Zadání 8: Kontrola vstupů
        //Zkontroluj, zda obě proměnné x a y jsou větší než nula:

        if(x > 0 && y > 0) {
            System.out.println("Obě proměnné jsou kladné");
        } else {
            System.out.println("Jedna nebo obě proměnné nejsou kladné");
        }

        //Zadání 9: Negace podmínky
        //Zjisti, zda x není v rozmezí mezi 5 a 15:


        if(x < 5 || x > 15) {
            System.out.println("x není v rozmezí 5 až 15");
        } else {
            System.out.println("x je v rozmezí 5 až 15");
        }


        //Zadání 10: Přestupný rok
        //Ověř, zda je daný rok year přestupný:
        /*
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Rok je přestupný");
        } else {
            System.out.println("Rok není přestupný");

         */



        // Sčítání čísel: Napište program, který sečte všechna čísla od 1 do 100 a zobrazí výsledek.
        /*
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
        sum += i;
        }
         */

        //Počítání výskytů: Nechť uživatel zadává čísla, dokud nezadá 0. Program by měl spočítat a zobrazit, kolikrát bylo číslo 5 zadáno.
        /*
            int count = 0;
            int number;
            Scanner scanner = new Scanner(System.in);
            while ((number = scanner.nextInt()) != 0) {
                if (number == 5) {
                    count++;
                }
            }
         */

        // Fibonacciho posloupnost: Vypiš prvních 10 čísel Fibonacciho posloupnosti.
        /*
                int a = 0, b = 1;
                System.out.println(a);
                System.out.println(b);
                for (int i = 2; i < 10; i++) {
                    int next = a + b;
                    System.out.println(next);
                    a = b;
                    b = next;
                }
        */

        //Hádání čísla: Napište program, kde uživatel hádá náhodně vygenerované číslo od 1 do 10. Program by měl pokračovat, dokud uživatel číslo neuhodne.

        /*
            int target = (int) (Math.random() * 10) + 1;
            int guess;
            Scanner scanner = new Scanner(System.in);
            do {
                guess = scanner.nextInt();
            } while (guess != target);

         */


        // Inverze řetězce: Vstupem je řetězec, který program otočí a zobrazí jeho inverzi.

        /*

            String str = "Hello";
            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }

         */

        // Hledání maximální hodnoty: Mějte pole s 10 náhodnými čísly. Najděte a zobrazte nejvyšší hodnotu v poli.

        /*
                int[] numbers = {2, 5, 1, 9, 7, 4, 3, 8, 6, 10};
                int max = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
         */

        //Kalkulačka průměru: Program nechá uživatele zadávat čísla (ukončeno číslem -1) a na konci vypočítá a zobrazí jejich průměr.

        /*
            int sum = 0;
            int count = 0;
            int number;
            Scanner scanner = new Scanner(System.in);
            while ((number = scanner.nextInt()) != -1) {
                sum += number;
                count++;
            }
            double average = (count > 0) ? (double) sum / count : 0;
         */

        // Tabulka násobků: Napište program, který zobrazí násobilku pro číslo zadané uživatelem (např. násobky 7 od 1 do 10).

        /*

            int n = 7;
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
            }

         */


        // Červen.dedicnost.Úkol 1: Vyhodnocení celočíselného dělení Vyhodnoťte výraz ručně a zvolte správnou odpověď:
        // a : 0.85
        //b : 0
        //c : 1
        //d : Error, nespustí se program.
        // int vysledek = 85 / 100; // Výsledek bude 0, protože dělení celých čísel v Javě vrací celočíselný výsledek.
        //vysledek - b


        // Úkol 2: Porovnání řetězců Vyhodnoťte výraz ručně a zvolte správnou odpověď:
        //a : true
        //b : false
        //c : Error, nespustí se program.

        /*
        String text = "Hello";
        boolean vysledek = text.equals("hello"); // Tato metoda porovnává řetězce "Hello" a "hello" a zjistí, že jsou odlišné.
         */
        //vysledek - b

        // Úkol 3: Výpočet s desetinami Vyhodnoťte výraz ručně:
        // a : 2.5
        //b : 2
        //c : Error, nespustí se program.
        /*
        double vysledek = 10 / 4; // Dělení celých čísel, výsledek je 2 (celé číslo).
         */
        //vysledek - b


        // Úkol 4: Logický výraz s NOT Vyhodnoťte výraz ručně a určete, jaký bude výstup:
        //a : true
        //b : false
        //c : Error, nespustí se program.
        // boolean vysledek = !(true && false) || (false && true); // Negace (false) nebo (false) = false.
        // vysledek - b

        // Úkol 5: Délka řetězce Vyhodnoťte výraz ručně:
        //a : true
        //b : false
        //c : Error, nespustí se program.
        /*
        String text = "Ahoj";
        boolean vysledek = text.length() == 4 && text.charAt(0) == 'A'; // Délka řetězce je 4, první znak je 'A'.
         */
        // Vysledek - a

        //Úkol 6: Modulo operátor Vyhodnoťte výraz ručně:
        //a : 1
        //b : 3
        //c : Error, nespustí se program.
        //Odpověď: a: 1
        /*
         int vysledek = 10 % 3; // 10 děleno 3 má zbytek 1.
         */

        //Úkol 7: Podmíněné přiřazení Vyhodnoťte, co bude uloženo v proměnné vysledek:
        //a : 5
        //b : 15
        //c : 20
        //d : Error, nespustí se program.
        /*
        int x = 5;
        int vysledek = (x > 10) ? 20 : 15; // Podmínka je nepravdivá, takže výsledek bude 15.
         */

        //podmínka ? hodnota1 : hodnota2;
        //Pokud je podmínka pravdivá, použije se hodnota1 (před dvojtečkou ?).
        //Pokud je podmínka nepravdivá, použije se hodnota2 (za dvojtečkou :).
        //Kdyby podmínka byla pravdivá, tedy kdyby x bylo větší než 10, přiřadila by se hodnota 20.
        //Protože podmínka není splněna (5 není větší než 10), místo 20 se přiřadí 15.
        //Odpověď: b: 15


        //Úkol 8: Palindrom Vyhodnoťte, co vrátí následující výraz:
        //a : true
        //b : false
        //c : Error, nespustí se program.
        /*
        String palindrom = "())(";
        boolean isTrue = !((palindrom.startsWith("()") || palindrom.endsWith(")(")) && palindrom.length() > 4);
        // Palindrom neodpovídá podmínkám.
        //vysledek: a: true
         */

        //Úkol 9: Přičítání v cyklu Určete hodnotu proměnné soucet po provedení cyklu:
        //a : 5
        //b : 15
        //c : 10
        //d : Error, nespustí se program.
        /*
        int soucet = 0;
        for (int i = 1; i <= 5; i++) {
            soucet += i; // Součet bude 1 + 2 + 3 + 4 + 5 = 15.
        }
         */
        //vysledek: b: 15

        //Úkol 10: Ověření hodnoty proměnné Vyhodnoťte, co vytiskne následující program:
        //a : Ano
        //b : Ne
        //c : Error, nespustí se program.

        /*
        int x = 10;
        if (x / 3 == 3) { // x / 3 je 3 (10 / 3 je 3)
            System.out.println("Ano");
        } else {
            System.out.println("Ne");
        }
         */
        //Odpověď: A: Ano

    }
    }


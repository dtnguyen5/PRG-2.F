import java.util.Scanner;

public class Variables_cv {
    public static void main(String[] args) {
        // připomínka z minulé hodiny

        // Rozdělte datové typy k proměnnám
        // String, boolean, char, int, double


//        type vek = 0;                         // celá čísla v rozsahu cca -2 miliardy až ~2 miliardy
//        type PI = 3.14159d;                   // reálná čísla (s desetinou čárkou)
//        type isTrue = true;                   // pravdivostní hodnota true/false (ano/ne)
//        type bigA = 'A';                      // jeden znak, píše se do ''
//        type name = "Jmeno";                  // textový řetězec (znak/slovo/text), píše se do "";

        /**
         * CV 1
         * Uložte 2 libovolná čísla do 2 proměnných
         * Poté je:
         * Vypište, Přehoďte, Vypište,
         */

        int a = 10;
        int b = 20;

        System.out.println("První číslo" + a);
        System.out.println("Druhé číslo" + b);

        int temp = 0;
        temp = a;
        a = b;
        b = temp
            
        System.out.println("První číslo" + a);
        System.out.println("Druhé číslo" + b);

        /**
         * CV 2
         * Napište jednoduchou kalkulačku, která bude umět +, -, *, / nad dvěma čísly z množiny R (Reálných čísel).
         * Výsledky vypište na konzoli
         */

        double num1 = 12;
        double num2 = 20;

        int some = num1 + num2;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        

        
        /**
         * CV 3
         * Uložte do proměnné pravdivostního typu, zda součet 3 libovolných malých písmen je větší než 300.
         * Výsledek vypište na konzoli
         */

        boolean isBigger = 'a' + 'b' + 'c' > 300;

         System.out.println("je součet větší než 300?;" + isBigger);

        /**
         * CV 4
         * Zeptejte se uživatele na jeho, jméno, příjmení, PSČ a rodné číslo
         * Údaje pak uživateli vypište
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte jméno");
        String jmeno = sc.next();
        
        System.out.println("Zadejte prijmeni");
        String prijmeni = sc.next();
        
        System.out.println("Zadejte PSC");
        Int PSC = sc.nextInt();
        
        System.out.println("Zadejte rodné cislo");
        String rodnecislo = sc.next();

        System.out.println("jmeno" + jmeno);
        System.out.println("prijmeni" + prijmeni);
        System.out.println("PSC" + PSC);
        System.out.println("rodnecislo" + rodnecislo);
      
        /**
         * CV 5
         * Vygenerujte šachovnici o velikosti NxN, kde N je vstup od uživatele
         * int n;
         *
         * Pro generaci šachovnice odkomentujte následující kód
             for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i + j) % 2 == 0) System.out.print("■");
                    else System.out.print("□");
                }
                System.out.println();
             }
         */

        /*
        Pokud byste chtěli vypisovat barevně, lze využít tyto řetězce
        - Použití - System.out.println(RED + "Your message" + Reset);
        final String RESET = "\u001B[0m";
        final String BLACK = "\u001B[30m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        final String PURPLE = "\u001B[35m";
        final String CYAN = "\u001B[36m";
        final String WHITE = "\u001B[37m";
        */


        // načíst od uživatele 2 strany obdélníku 
        // vypsat jeho obvod

        Scanner scn = new Scanner(System.in);

        System.out.println("Zadej stranu A:");
        int A = scn.nextInt();

        System.out.println("Zadej stranu B:");
        int B = scn.nextInt();
        
        System.out.println(2*(A+B));


        
        // načíst stupně celsius a převest na F
        // °F = °C × (9/5) + 32

        System.out.println("Zadej teplotu ve stupních celsius");
        double celsius = scn.nextDouble();
        double F = celsius * (9.0/5.0) + 32;

        System.out.println("Teplota ve F:" + F);

        // náhodné generování čísla

        // první možnost

        int max = 50;
        int min = 12;
       // prvni moznost Math.random() * (max - min) min;

        // druha moznost dole

        Random rng = new Random();
        rng.nextInt(15, 50);


        // načíst od uživatele horní a
        // spodní mez a vypište mu náhodné číslo v rozmezí



        int maxx = 50;
        int minn = 12;

        Scanner scn1 = new Scanner(System.in);
        System.out.println("Zadejte horní mez");
        int h = scn1.nextInt();
        System.out.println("Zadejte spodní mez");
        int s = scn1.nextInt();

        Random rngg = new Random();
        int horni = rngg.nextInt();
        System.out.println(horni);
        
    }
}

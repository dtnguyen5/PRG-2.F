# Příprava na test - další zkušební příklady

Tento dokument slouží jako příprava na test z programování.

---

##  Úkol 1: Rozmezí čísel
### Kód
```java
public class Main {
    public static void main(String[] args) {

        //  Zadání 1: Rozmezí čísel
        // Doplnění do závorel if("Zde doplň")
        // Doplň podmínku tak, aby kontrolovala, zda číslo x leží v rozmezí mezi 5 (včetně) a 10 (včetně):

        if(x >= 5 && x <= 10) {
            System.out.println("Číslo je v rozmezí 5 až 10");
        } else {
            System.out.println("Číslo není v rozmezí 5 až 10");
        }

    }
}

```
##  Úkol 2:  Porovnání dvou čísel
### Kód
```java

public class Main {
    public static void main(String[] args) {

     //Zadání 2: Porovnání dvou čísel
      // Zase doplň do závorek
     //Ověř, zda je x větší než y, nebo zda jsou stejná:

      if(x >= y || x == y) {
                System.out.println("x je větší nebo rovno y");
            } else {
                System.out.println("x je menší než y");
            }
    }
}

```
##  Úkol 3: Sudé nebo liché
### Kód
```java

public class Main {
    public static void main(String[] args) {

    // Zde doplň do závorek, aby to číslo, který vyjde bylo sudé if("zde doplnit") 

     if(x % 2 == 0) {
              System.out.println("x je sudé číslo");
          } else {
              System.out.println("x je liché číslo");
          }    
    }
}

```
##  Úkol 4: Testování hodnoty
### Kód
```java

public class Main {
    public static void main(String[] args) {

    //Zadání 4: Testování hodnoty
    // Doplň zase :)
    //Doplň podmínku, která ověří, zda hodnota z je kladná, záporná, nebo rovná nule:

     if(z > 0) {
            System.out.println("z je kladné číslo");
        } else if(z < 0) {
            System.out.println("z je záporné číslo");
        } else {
            System.out.println("z je rovno nule");
        }
    }
}

```
##  Úkol 5: Pracovní doba
### Kód
```java

public class Main {
    public static void main(String[] args) {

    //Zadání 5: Testování hodnoty
    // Doplň zase klasicky do závorek :)
    //Zkontroluj, zda je aktuální čas (hodina hour) v rozmezí 9 až 17:

     if(z > 0) {
            System.out.println("z je kladné číslo");
        } else if(z < 0) {
            System.out.println("z je záporné číslo");
        } else {
            System.out.println("z je rovno nule");
        }
    }
}

```
##  Úkol 6: Roční období
### Kód
```java

public class Main {
    public static void main(String[] args) {

    //Zadání 6: Roční období
    //Na základě hodnoty měsíce (1–12) vypiš, zda se jedná o zimu, jaro, léto, nebo podzim:

    if(month == 12 || month == 1 || month == 2) {
            System.out.println("Je zima");
        } else if(month >= 3 && month <= 5) {
            System.out.println("Je jaro");
        } else if(month >= 6 && month <= 8) {
            System.out.println("Je léto");
        } else {
            System.out.println("Je podzim");
        }
    }
}

```
##  Úkol 7: Platnost hesla
### Kód
```java

public class Main {
    public static void main(String[] args) {

    //Zadání 7: Platnost hesla
    //Doplň podmínku, která ověří, zda je heslo dlouhé alespoň 8 znaků a současně obsahuje písmeno a:

    String password = "heslo123";
        if(password.length() >= 8 && password.indexOf('a') != -1) {
            System.out.println("Heslo je platné");
        } else {
            System.out.println("Heslo není platné");
        }

    // Popis: Metoda length() vrací délku řetězce. Podmínka kontroluje, zda má heslo alespoň 8 znaků.
    //Výsledek pro "heslo123": Délka hesla je 8 (počet znaků: 'h', 'e', 's', 'l', 'o', '1', '2', '3'), což znamená, že první podmínka je splněna.

    //Popis: Metoda indexOf('a') hledá první výskyt znaku 'a' v řetězci a vrací jeho index. Pokud znak není nalezen, vrací -1.
    //Výsledek pro "heslo123": Znak 'a' se v hesle nenachází, takže indexOf('a') vrátí -1. Druhá podmínka tedy není splněna.

    //Popis: Podmínka if používá logický operátor && (AND), což znamená, že obě podmínky musí být pravdivé, aby byl výsledek true.
    //První podmínka (délka ≥ 8) je pravdivá.
    //Druhá podmínka (obsahuje 'a') je nepravdivá.

    }
}

```
##  Úkol 8: Kontrola vstupů
### Kód
```java

public class Main {
    public static void main(String[] args) {

     //Zadání 8: Kontrola vstupů
    //Zkontroluj, zda obě proměnné x a y jsou větší než nula:

    if(x > 0 && y > 0) {
            System.out.println("Obě proměnné jsou kladné");
        } else {
            System.out.println("Jedna nebo obě proměnné nejsou kladné");
        }
    }
}

```
##  Úkol 9: Negace podmínky
### Kód
```java

public class Main {
    public static void main(String[] args) {

     //Zadání 9: Negace podmínky
    //Zjisti, zda x není v rozmezí mezi 5 a 15:

     if(x < 5 || x > 15) {
            System.out.println("x není v rozmezí 5 až 15");
        } else {
            System.out.println("x je v rozmezí 5 až 15");
        }

    }
}

```
##  Úkol 10: Přestupný rok
### Kód
```java

public class Main {
    public static void main(String[] args) {

    //Zadání 10: Přestupný rok
    //Ověř, zda je daný rok year přestupný:

    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Rok je přestupný");
            } else {
                System.out.println("Rok není přestupný");

    //  Přestupný rok splňuje následující pravidla:
    // 1. Rok je dělitelný 4.
    // 2. Rok není dělitelný 100, pokud není zároveň dělitelný 400.

    // Podmínky:
    // year % 4 == 0 && year % 100 != 0:
    // year % 4 == 0:  Tento výraz kontroluje, zda je rok dělitelný 4.
    // year % 100 != 0: Tento výraz kontroluje, zda není rok dělitelný 100.
    // Pokud je rok dělitelný 4, ale zároveň není dělitelný 100, je přestupný.

    // year % 400 == 0: Tento výraz kontroluje, zda je rok dělitelný 400. Pokud je, je přestupný bez ohledu na to, zda je dělitelný 100.

    // Logika: Pokud je rok dělitelný 4, ale ne 100 (např. 2024), nebo pokud je dělitelný 400 (např. 2000), je rok přestupný
    // Pokud je rok dělitelný 100, ale ne 400 (např. 1900), není přestupný.

    // Příklady:
    // Rok 2024: Dělitelný 4, ale není dělitelný 100 → přestupný rok.
    // Rok 1900: Dělitelný 100, ale není dělitelný 400 → není přestupný rok.
    }
}

```
##  Úkol 11: Cykly
### Kód
```java

public class Main {
    public static void main(String[] args) {

    // Zde byly proste věty a určit cyklus, zde budou i kódy cyklů pro přehled (NEMUSEL SI PSAT RUCNE CELOU HRUZU JENOM URCIT CYKLUS, JESTLI WHILE, DO WHILE NEBO FOR)


    // Sčítání čísel: Napište program, který sečte všechna čísla od 1 do 100 a zobrazí výsledek.
    int sum = 0;
        for (int i = 1; i <= 100; i++) {
        sum += i;
        }

    //Počítání výskytů: Nechť uživatel zadává čísla, dokud nezadá 0. Program by měl spočítat a zobrazit, kolikrát bylo číslo 5 zadáno.
    int count = 0;
            int number;
            Scanner scanner = new Scanner(System.in);
            while ((number = scanner.nextInt()) != 0) {
                if (number == 5) {
                    count++;
                }
            }

    // Fibonacciho posloupnost: Vypiš prvních 10 čísel Fibonacciho posloupnosti.
    int a = 0, b = 1;
                System.out.println(a);
                System.out.println(b);
                for (int i = 2; i < 10; i++) {
                    int next = a + b;
                    System.out.println(next);
                    a = b;
                    b = next;
                }

    //Hádání čísla: Napište program, kde uživatel hádá náhodně vygenerované číslo od 1 do 10. Program by měl pokračovat, dokud uživatel číslo neuhodne.
    int target = (int) (Math.random() * 10) + 1;
            int guess;
            Scanner scanner = new Scanner(System.in);
            do {
                guess = scanner.nextInt();
            } while (guess != target);

    // Inverze řetězce: Vstupem je řetězec, který program otočí a zobrazí jeho inverzi.
    String str = "Hello";
            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }

    //Kalkulačka průměru: Program nechá uživatele zadávat čísla (ukončeno číslem -1) a na konci vypočítá a zobrazí jejich průměr.
    int sum = 0;
            int count = 0;
            int number;
            Scanner scanner = new Scanner(System.in);
            while ((number = scanner.nextInt()) != -1) {
                sum += number;
                count++;
            }
            double average = (count > 0) ? (double) sum / count : 0;

    // Tabulka násobků: Napište program, který zobrazí násobilku pro číslo zadané uživatelem (např. násobky 7 od 1 do 10).
    int n = 7;
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
            }
    }
}

# V testu (NEPAMATUJI SI TO UPLNE PRESNE JE MOZNY, ŽE NĚCO SI MYSLIM CO BYLO)

Tento dokument slouží jako příprava na test z programování.

---

## ✏️ Úkol 1: Práce se Scannerem

### Kód
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Napsat, jak má správně vypadat scanner
        Scanner input = new Scanner(System.in); // vytvoření scanneru

        // Zde si máš u každé proměnný napsat, jestli nextInt, nextDouble, next nebo nextLine
        int cislo = input.nextInt(); // načtení celého čísla
        double realneCislo = input.nextDouble(); // načtení reálného čísla
        String jmeno = input.next(); // načtení jednoho slova
        String veta = input.nextLine(); // načtení celé věty

        input.close();
    }
}

```

##  Úkol 2: Základní matematické operace

### Kód
```java
public class Main {
    public static void main(String[] args) {
        double a = 124.156;
        double b = 0.111;

        // Zde si máš doplnit základní matematické operace, takhle -> double soucet = "zde doplnit"
        // vzdycky tady bude nějaká poznámka u toho kódu (chyták), takže pořádně musíš ČÍST! Místo toho si třeba měla napsat takhle double soucet = a + a, dobule = a - a, double soucin = a * 3
        double soucet = a + b; 
        double rozdil = a - b;
        double soucin = a * b;


        // Zde bylo, že se nesmí dělit 0, takže doplnit do té a pak ten podíl doplnit 
        double podil = 0; // Výsledek při dělení nulou
        if (b != 0) {
            podil = a / b;
        }

        System.out.println(soucet);
        System.out.println(rozdil);
        System.out.println(soucin);
        System.out.println(podil);
    }
}

```

##  Úkol 3: Hod kostky

### Kód
```java

public class Main {
    public static void main(String[] args) {

    // Zde si měla vybrat buď ručně napíšeš hod kostkami pomocí Random nebo Math.random()

    // Random:
      Random radnomKostky = new Random();
      int hodnota1 = radnomKostky.nextInt(1, 7);

    // Math.random()?
      int hod = (int) (Math.random() * 6) + 1;
    }
}

```

## Úkol 4: Použití logické podmínky v Javě - AND = &&, OR = ||, NOT - !
### Kód
```java
public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        // do té závorky doplnit podmínku a logické operátody - if(     "Zde doplnit jak by to mělo vypadat"     )
        if (x > 5 && y <= 10) {
            System.out.println("Podmínka splněna");
        } else {
            System.out.println("Podmínka nesplněna");
        }
    }
}

```
## Úkol 5: Zjištění, zda je číslo kladné, záporné nebo nula
### Kód
```java
public class Main {
    public static void main(String[] args) {

        int z = -10; 
        //Zase doplň to těch závorek 
        if (z > 0) {
            System.out.println("Z je kladné číslo");
        } else if (z < 0) {
            System.out.println("Z je záporné číslo");
        } else {
            System.out.println("Z je rovno 0");
        }

    }
}



```
## Úkol 6: Určit cyklus podle věty
### Kód
```java

public class Main {
    public static void main(String[] args) {

    // Nepamatuji si to presne, ale nejspise tyhle 3 jsem mel, pravdepodobne budes mit jiné, stacilo určit for, while, do while cykly

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
    }
}

```
## Úkol 7: Výpočet v Javě
### Kód
```java
public class Main {
    public static void main(String[] args) {

// Vypočítat kolik tohle vyjde 
     int vysledek = 85 / 100; // je to 0
//vysveletní - Důvodem je, že obě čísla (85 a 100) i proměnná vysledek jsou typu int, a při celočíselném dělení se desetinná část vždy ořízne. Proto se výsledek 85 / 100 se rovná 0. Pro získání výsledku 0.85 je třeba použít typ double nebo float
    }
}

```

# Úkol 8: Práce s řetězci v Javě
# Kód
```java
public class Main {
    public static void main(String[] args) {

    String test = "Dostanu jedničku.";
    
    // Metody length(), charAt(), indexOf(), trim(), subString(), toUpperCase, toLowerCase
    // zde bylo jenom zadání, které metody slouží k čemu, takže stačilo doplnit např. test.toLowerCase
    System.out.println(test.length()); // Vrací délku řetězce: 18
    System.out.println(test.charAt(3)); // Vrací znak na indexu 3: "t"
    System.out.println(test.indexOf("u")); // Vrací index prvního výskytu "u": 7
    }
}

```

## Úkol 9: Výpočet s desetinami

### Kód
```java

public class Main {
    public static void main(String[] args) {

    // Úkol 3: Výpočet s desetinami Vyhodnoťte výraz ručně:

    // a : 2.5
    // b : 2
    // c : Error, nespustí se program.

    double vysledek = 10 / 4; // Dělení celých čísel, výsledek je 2 (celé číslo).
    //vysledek - b
    }
}

```

## Úkol 10: Logický výraz s NOT

### Kód
```java

public class Main {
    public static void main(String[] args) {

    // Úkol 4: Logický výraz s NOT Vyhodnoťte výraz ručně a určete, jaký bude výstup:

    // a : true
    // b : false
    // c : Error, nespustí se program.

    // boolean vysledek = !(true && false) || (false && true); // Negace (false) nebo (false) = false.
    // vysledek - b

    // Vysvetlení:
    // 1.Operátor && (logické AND): true && false: Operátor && vrací true, pokud jsou obě podmínky pravdivé. V tomto případě je první podmínka true a druhá false, takže výsledek je false.
    // false && true: Podobně, operátor && vrací false, protože jedna z podmínek je false.
    // 2. Operátor ! (logická negace):
    // !(true && false): Z negace výrazu false se stane true (negace false je true).
    // 3. Logický operátor || (logické OR):
    // true || false: Operátor || vrací true, pokud alespoň jedna z podmínek je true. V tomto případě je první podmínka true, takže celý výraz bude true.

    }
}

```
##  Úkol 11: Sudé nebo liché
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

    // TADY TO SCHVALNE PROHODIL TAKZE TO BYLO TAKHLE

    if(x % !2 == 0) {
              System.out.println("x je lichéčíslo");
          } else {
              System.out.println("x je sudé číslo");
          } 

    }
}

```

## Úkol 12: Porovnání řetězců

### Kód
```java

public class Main {
    public static void main(String[] args) {

    // Úkol 2: Porovnání řetězců Vyhodnoťte výraz ručně a zvolte správnou odpověď:
     //a : true
     //b : false
     //c : Error, nespustí se program.

      String text = "Hello";
      boolean vysledek = text.equals("hello"); // Tato metoda porovnává řetězce "Hello" a "hello" a zjistí, že jsou odlišné.
      //vysledek - b
    }
}

```

## Úkol 13: Délka řetězce 

### Kód
```java

public class Main {
    public static void main(String[] args) {

      // Úkol 5: Délka řetězce Vyhodnoťte výraz ručně:
        //a : true
        //b : false
        //c : Error, nespustí se program.

        String text = "Ahoj";
        boolean vysledek = text.length() == 4 && text.charAt(0) == 'A'; // Délka řetězce je 4, první znak je 'A'.
         // Vysledek - a
    }
}

```

## Úkol 14: Modulo operátor 

### Kód
```java

public class Main {
    public static void main(String[] args) {

    //Úkol 6: Modulo operátor Vyhodnoťte výraz ručně:
        //a : 1
        //b : 3
        //c : Error, nespustí se program.

      int vysledek = 10 % 3; // 10 děleno 3 má zbytek 1.
      vysledek - a : 1
     
    }
}

```
## Úkol 14: Modulo operátor 

### Kód
```java
// Jaká hra byla napsána v Javě - Minecraft :)

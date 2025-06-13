# Příprava na Testy.test

Tento dokument slouží jako příprava na Testy.test z programování.

---

## ✏️ Červen.dedicnost.Úkol 1: Práce se Scannerem

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

## 🧮 Úkol 2: Základní matematické operace

### Kód
```java
public class Main {
    public static void main(String[] args) {
        double a = 124.156;
        double b = 0.111;

        // Zde si máš doplnit základní matematické operace, takhle -> double soucet = "zde doplnit"
        double soucet = a + b;
        double rozdil = a - b;
        double soucin = a * b;


        // Zde bylo, že se nesmí dělit 0, takže doplnit do té zavorky a pak ten podíl doplnit 
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

## Úkol 3: Práce s náhodnými čísly v Javě
### Kód
```java
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int kostka = random.nextInt(6) + 1; // Náhodné číslo 1-6 pro kostku
        int mince = random.nextInt(2); // Náhodné číslo 0-1 pro minci
        int karta = random.nextInt(52) + 1; // Náhodné číslo 1-52 pro karty

        System.out.println("Hod kostkou: " + kostka);
        System.out.println("Hod mincí: " + (mince == 0 ? "Panna" : "Orel"));
        System.out.println("Náhodná karta: " + karta);
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

## Úkol 6: Zadané věty pro použití cyklu, nebyly tam kódy jenom věty a určit cyklus

V Javě existují tři základní typy cyklů, které se používají pro opakované vykonávání bloků kódu. Každý typ cyklu má svůj specifický účel a strukturu:

### Příklad použití cyklů:

```java
// 1. **While Cyklus**
// Cyklus **while** vykonává kód, dokud je podmínka pravdivá. Podmínka se kontroluje před každou iterací. Tento typ cyklu je vhodný, pokud nevíme předem, kolikrát se cyklus bude opakovat, ale víme, že chceme testovat podmínku před vykonáním těla cyklu.

int i = 0;
while (i < 5) {
    System.out.println("While: " + i);
    i++;
}

// 2. ** do While Cyklus**
//Cyklus do while vykonává kód alespoň jednou, a až poté kontroluje podmínku. Tento cyklus je ideální, když chceme, aby se tělo cyklu provedlo alespoň jednou, bez ohledu na to, jestli je podmínka pravdivá.
int i = 0;
do {
    System.out.println("Do While: " + i);
    i++;
} while (i < 5);

// 3. ** For Cyklus**
//Cyklus for je nejvhodnější, když známe počet iterací předem. Tento cyklus umožňuje definovat inicializaci, podmínku a inkrementaci v jedné řádce. Je ideální, když víme, kolikrát chceme cyklus provést.
for (int j = 0; j < 5; j++) {
    System.out.println("For: " + j);
}

```

## Úkol 8: Výpočet v Javě

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

## úkol 9: Analýza kódu: Kontrola podmínek v řetězci

### Kód
```java

public class Main {
    public static void main(String[] args) {

    String palindrom = "())(";
    boolean isTrue = !((palindrom.startsWith("()") || palindrom.endsWith(")(")) && palindrom.length() > 4);

    // Hodnota isTrue vyjde jako true, protože negace ! obrací výsledek podmínky. Pojďme to rozebrat krok za krokem:
    // palindrom.startsWith("()"): Řetězec "())(" začíná podřetězcem "()", takže tato část je true.
    // palindrom.endsWith(")("): Řetězec "())(" končí podřetězcem ")(", takže tato část je také true.
    // palindrom.length() > 4: Délka řetězce "())(" je 4, takže tato část je false.

    //Kombinace:
    //(true || true) je true.
    //(true && false) je false.

    }
}

```

## Úkol 10: Práce s řetězci v Javě
### Kód
```java
public class Main {
    public static void main(String[] args) {

    String Testy.test = "Dostanu jedničku.";
    
    // Metody length(), charAt(), indexOf(), trim(), subString(), toUpperCase, toLowerCase
    // zde bylo jenom zadání, které metody slouží k čemu, takže stačilo doplnit např. Testy.test.toLowerCase
    System.out.println(Testy.test.length()); // Vrací délku řetězce: 18
    System.out.println(Testy.test.charAt(3)); // Vrací znak na indexu 3: "t"
    System.out.println(Testy.test.indexOf("u")); // Vrací index prvního výskytu "u": 7
    }
}

```














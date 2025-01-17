## Úkol 1: Práce se Scannerem

### Kód
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

 // Vyplnit část scanneru, jak by měl vypadat
        Scanner input = new Scanner(System.in); // vytvoření scanneru

// U proměnný přidat, jestli to je nextInt, nextDouble, next, NextLine
        int cislo = input.nextInt(); // načtení celého čísla
        double realneCislo = input.nextDouble(); // načtení reálného čísla
        String jmeno = input.next(); // načtení jednoho slova
        String veta = input.nextLine(); // načtení celé věty

        input.close();
    }
}


## Úkol 2: Základní matematické operace

### Kód
```java
public class Main {
    public static void main(String[] args) {
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
    }
}
```

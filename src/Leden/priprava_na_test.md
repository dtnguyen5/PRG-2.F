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

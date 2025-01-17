# Příprava na test

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



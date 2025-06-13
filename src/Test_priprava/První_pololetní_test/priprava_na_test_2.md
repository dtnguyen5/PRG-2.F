# Příprava na Testy.test 

Tento dokument slouží jako příprava na Testy.test z programování.

---
##  Červen.dedicnost.Úkol 1: Vyhodnocení celočíselného dělení

### Kód
```java

public class Main {
    public static void main(String[] args) {

      // Červen.dedicnost.Úkol 1: Vyhodnocení celočíselného dělení Vyhodnoťte výraz ručně a zvolte správnou odpověď:
      // a : 0.85
      // b : 0
      // c : 1
      // d : Error, nespustí se program.

      int vysledek = 85 / 100; // / Výsledek bude 0, protože dělení celých čísel v Javě vrací celočíselný výsledek.
    }
}

```

## Úkol 2: Porovnání řetězců

### Kód
```java

public class Main {
    public static void main(String[] args) {

    // Úkol 2: Porovnání řetězců Vyhodnoťte výraz ručně a zvolte správnou odpověď:
     // a : true
     // b : false
     // c : Error, nespustí se program.

      String text = "Hello";
      boolean vysledek = text.equals("hello"); // Tato metoda porovnává řetězce "Hello" a "hello" a zjistí, že jsou odlišné.
      // vysledek - b
    }
}

```

## Úkol 3: Výpočet s desetinami

### Kód
```java

public class Main {
    public static void main(String[] args) {

    // Úkol 3: Výpočet s desetinami Vyhodnoťte výraz ručně:

    // a : 2.5
    // b : 2
    // c : Error, nespustí se program.

    double vysledek = 10 / 4; // Dělení celých čísel, výsledek je 2 (celé číslo).
    // vysledek - b
    }
}

```

## Úkol 4: Logický výraz s NOT

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

## Úkol 5: Délka řetězce 

### Kód
```java

public class Main {
    public static void main(String[] args) {

      // Úkol 5: Délka řetězce Vyhodnoťte výraz ručně:
        // a : true
        // b : false
        // c : Error, nespustí se program.

        String text = "Ahoj";
        boolean vysledek = text.length() == 4 && text.charAt(0) == 'A'; // Délka řetězce je 4, první znak je 'A'.
         // Vysledek - a
    }
}

```

## Úkol 6: Modulo operátor 

### Kód
```java

public class Main {
    public static void main(String[] args) {

    //Úkol 6: Modulo operátor Vyhodnoťte výraz ručně:
        // a : 1
        // b : 3
        // c : Error, nespustí se program.

      int vysledek = 10 % 3; // 10 děleno 3 má zbytek 1.
      // vysledek - a : 1
     
    }
}

```

## Úkol 7: Podmíněné přiřazení

### Kód
```java

public class Main {
    public static void main(String[] args) {
    
    /Úkol 7: Podmíněné přiřazení Vyhodnoťte, co bude uloženo v proměnné vysledek:
    // a : 5
    // b : 15
    // c : 20
    // d : Error, nespustí se program.

    int x = 5;
    int vysledek = (x > 10) ? 20 : 15; // Podmínka je nepravdivá, takže výsledek bude 15.

    /podmínka ? hodnota1 : hodnota2;
    //Pokud je podmínka pravdivá, použije se hodnota1 (před dvojtečkou ?).
    //Pokud je podmínka nepravdivá, použije se hodnota2 (za dvojtečkou :).
    //Kdyby podmínka byla pravdivá, tedy kdyby x bylo větší než 10, přiřadila by se hodnota 20.
    //Protože podmínka není splněna (5 není větší než 10), místo 20 se přiřadí 15.
    //Odpověď: b: 15
     
    }
}

```

## Úkol 8: Palindrom  

### Kód
```java

public class Main {
    public static void main(String[] args) {

    //Úkol 8: Palindrom Vyhodnoťte, co vrátí následující výraz:
    //a : true
    //b : false
    //c : Error, nespustí se program.

     String palindrom = "())(";
     boolean isTrue = !((palindrom.startsWith("()") || palindrom.endsWith(")(")) && palindrom.length() > 4);
     // Palindrom neodpovídá podmínkám.
     //Odpověď: a: true
    
    }
}

```

## Úkol 9: Přičítání v cyklu

### Kód
```java

public class Main {
    public static void main(String[] args) {

    //Úkol 9: Přičítání v cyklu Určete hodnotu proměnné soucet po provedení cyklu:
    //a : 5
    //b : 15
    //c : 10
    //d : Error, nespustí se program.

    int soucet = 0;
        for (int i = 1; i <= 5; i++) {
            soucet += i; // Součet bude 1 + 2 + 3 + 4 + 5 = 15.
        }
    //vysledek: b: 15
    }
}

```

## Úkol 10: Ověření hodnoty proměnné

### Kód
```java

public class Main {
    public static void main(String[] args) {

    //Úkol 10: Ověření hodnoty proměnné Vyhodnoťte, co vytiskne následující program:
    //a : Ano
    //b : Ne
    //c : Error, nespustí se program.

    int x = 10;
        if (x / 3 == 3) { // x / 3 je 3 (10 / 3 je 3)
            System.out.println("Ano");
        } else {
            System.out.println("Ne");
        }
         */
        //vysledek: a: Ano
   
    }
}

# Operace s proměnnými
- Existuje několik operací, které lze nad proměnnými dělat
- K provádění operací slouží operátory

### Typy operátoru

- Aritmetické operátory
- Přiřazovací operátory
- Porovnávací operátory
- Logické operátory
- Bitové operátory

## Aritmetické operace

### Operátory

- operátory slouží k provádění operací nad hodnotami a proměnnými

#### Seznam aritmetických operátorů

- `+` součet dvou čísel, či spojení dvou řetězců
- `-` rozdíl dvou čísel
- `/` podíl dvou čísel
- `*` součin dvou čísel
- `%` modulo operátor - vrátí zbytek po dělení
- `++` inkrement operátor - zvýší hodnotu o 1
- `--` dekrement operátor - sníží hodnotu o 1

#### Příklady použítí
```java
int suma = 100 + 200;         // 300
int rozdil = suma - 100;       // 300 - 100 = 200
int podil = suma / rozdil;    // 300 / 200 = 1.5! Ale ukládáme do int => 1
```

## Přiřazovací operátory

#### Seznam přiřazovacích operátorů
- `=` přiřadí hodnotu proměnné
- `+=` přičte hodnotu a přiřadí ji zpět do proměnné
- `-=` odečte hodnotu a přiřadí ji zpět do proměnné
- `*=` vynásobí hodnotu a přiřadí ji zpět do proměnné
- `/=` vydělí hodnotu a přiřadí ji zpět do proměnné
- `%=` aplikuje zbytek po dělení a přiřadí jej zpět do proměnné

#### Příklady použítí
```java
int x = 10;     // přiřazení hodnoty 10
x += 5;         // přičtení 5 => x je 15
x -= 3;         // odečtení 3 => x je 12
x *= 2;         // násobení 2 => x je 24
x /= 4;         // dělení 4 => x je 6
x %= 4;         // zbytek po dělení 4 => x je 2
```
## Porovnávací operátory

#### Seznam přiřazovacích operátorů
- `==` testuje, zda jsou dvě hodnoty rovny
- `!=` testuje, zda se dvě hodnoty nerovnají
- `>` testuje, zda je první hodnota větší než druhá
- `<` testuje, zda je první hodnota menší než druhá
- `>=` testuje, zda je první hodnota větší nebo rovna druhé
- `<=` testuje, zda je první hodnota menší nebo rovna druhé

#### Příklady použítí
```java
int a = 5;
int b = 10;

boolean isEqual = a == b;     // false
boolean isNotEqual = a != b;  // true
boolean isGreater = b > a;    // true
boolean isLessOrEqual = a <= 5; // true
```
#### Logické operátory
- `and &&` všechny výrazy musí být pravda 
- `or ||` alespoň jeden výraz musí být pravda
- `not !` změní výraz `true` na `false` a naopak

#### Příklady použítí
```java
// AND
int a = 50;
int dolniMez = 0;
int horniMez = 100;
boolean inInterval = a > dolniMez && a < horniMez;

// OR
int validID1 = 156781;
int validID2 = 982181;
int id = 42;

boolean isValidID = id == validID1 || id == validID2;

// NOT
boolean isNotValid = !isValidID;

```

## Bitové operátory (NEJSOU VYŽADOVÁNY)

Bitové operátory pracují na úrovni jednotlivých bitů.

#### Seznam bitových operátorů
- `&` bitový AND
- `|` bitový OR
- `^` bitový XOR (exkluzivní OR)
- `~` bitový NOT (negace všech bitu)
- `<<` bitový posun vlevo
- `>>` bitový posun vpravo

```java
int a = 5;      // 0101 v binární soustavě
int b = 3;      // 0011 v binární soustavě

int bitAnd = a & b;   // 0001 => 1
int bitOr = a | b;    // 0111 => 7
int bitXor = a ^ b;   // 0110 => 6
int bitNot = ~a;      // 1010 (v závislosti na počtu bitů, záporné číslo)

int shiftLeft = a << 1;  // 1010 => (10) (posun vlevo o 1 bit)
int shiftRight = a >> 1; // 0010 => (2) (posun vpravo o 1 bit)

```

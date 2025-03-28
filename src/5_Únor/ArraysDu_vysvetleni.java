package Únor;

import java.util.Arrays;

public class ArraysDu_vysvetleni {

    static String[] inventar = {
            "Spitzhacke",
            "Krankenwagen",
            "Apache-Hubschrauber 3000",
            "Monchhichi",
            "Chihuahua",
            "Gallone Milch",
            "Hubba Bubba",
            "48-Port-Switch",
            "Stiefel",
            "Schwanz eines weißen Wals",
            "DVD-Player",
            "16GB RAM",
            "LGM 30 Minuteman",
            "Lego Ninja Go",
            "Excalibur",
            "50-Meter-Seil",
            "Quanten-Discombobulator",
            "Empfindungsfähiges Gummiente",
            "Unsichtiges Glücks-Frettchen",
            "Zeitreisender Hamster",
            "Kosmische Luftpolsterfolie",
            "Telepathischer Spatel",
            "Interdimensionales Käserad",
            "Verzerrte Lavalampe",
            "Tanzender Kaktus des Chaos",
            "Mystische Fleischkugel",
            "Einhornfürze im Glas",
            "Singender Weltraum-Taco",
            "Antischwerkraft-Banane",
            "Multiversum-Becher",
            "Hellseherischer Toaster",
            "Atom-Schaumbad"
    };

    static char[] rarity = {
            'C', 'D', 'D', 'D', 'B', 'A', 'D', 'E', 'E', 'E', 'A', 'E', 'D', 'A', 'E', 'D', 'A', 'A', 'D', 'A', 'E', 'D', 'E', 'B', 'C', 'C', 'A', 'B', 'C', 'C', 'E', 'E'
    };

    // Jestli si delas poznamky a posilas mu to s tim jako myslim to dole co mam <---------------------- popis ------------------------->, tak si to zmen at to neni divny, ze to mame stejny

    // <---------------------------- Přidání položky do inventáře ---------------------------->

    static void pridavaniPolozky(String polozka, char rarita) { // tady si to nejak prejmenuj nebo nech, nevim jestli to pojmenujes ze dalsim slovem das velké písmeno

        // Když chceš něco přidat do pole v Javě, nemůžeš jen tak zvětšit jeho velikost.
        // Místo toho musíš vytvořit nové pole, které je větší, a zkopírovat do něj všechny staré hodnoty.

        //Zvětšíme pole o 1 místo
        //Arrays.copyOf(inventar, inventar.length + 1) znamená:
        // Vezmi staré pole inventar a vytvoř jeho kopii, která má o 1 prvek víc.
        // Uděláme totéž i pro pole rarity.
        //Teď máme místo pro novou položku
        inventar = Arrays.copyOf(inventar, inventar.length + 1);
        rarity = Arrays.copyOf(rarity, rarity.length + 1);

        // Přidáme novou položku na poslední místo
        inventar[inventar.length - 1] = polozka;
        rarity[rarity.length - 1] = rarita;
    }

    // <---------------------------- Seřazení podle abecedy ---------------------------->

    static void serazeniPodleAbecedy() {

        // Bubble sort - mozna si pamatujes :)
        // používá se pro seřazení položek v poli inventar podle jejich prvního písmena (abecedně).
        // K tomu se zároveň řadí i pole rarity, aby odpovídalo seřazeným položkám.

        //  vymena je proměnná typu boolean, která sleduje, zda došlo k nějaké výměně během průchodu přes pole.
        //  Pokud proběhne alespoň jedna výměna, nastavíme swapped = true a pokračujeme v dalším průchodu.
        //  Pokud žádná výměna neproběhne, znamená to, že je pole již seřazené, a tedy smyčka skončí.
        boolean vymena;

        // n je proměnná, která drží aktuální délku pole inventar.
        // Používá se pro omezení počtu porovnání při řazení
        int n = inventar.length;

        // Porovnání dvou sousedních položek
        // do-while smyčka je používána k tomu, aby průchod pokračoval, dokud se stále provádí výměny.
        // Na začátku každého nového průchodu nastavíme swapped = false, což znamená, že očekáváme, že žádné výměny neprobíhají.
        do {
            vymena = false;

            // for cyklus prochází všemi položkami v poli inventar.
            // Porovnává sousední položky, konkrétně první písmeno každé položky (pomocí charAt(0)).
            // Pokud je první písmeno položky i větší než první písmeno položky i+1, znamená to, že položky jsou v špatném pořadí, a je třeba je prohodit.
            // Po výměně položek v inventar se zároveň prohodí i odpovídající rarita v poli rarity.
            // Pokud k nějaké výměně dojde, nastavíme swapped = true
            for (int i = 0; i < n - 1; i++) {

                // compareTo() porovná dva řetězce podle abecedy.
                // Vrací kladné číslo, pokud je inventar[i] "větší" (je abecedně později než inventar[i + 1]).
                // Vrací záporné číslo, pokud je inventar[i] "menší" (je abecedně dříve).
                // Pokud je 0, znamená to, že oba názvy jsou stejné.
                if (inventar[i].compareTo(inventar[ i + 1]) > 0) {
                    // Prohození položek v inventáři
                    String temp1 = inventar[i];
                    inventar[i] = inventar[i + 1];
                    inventar[i + 1] = temp1;

                    // Prohození rarity
                    char temp2 = rarity[i];
                    rarity[i] = rarity[i + 1];
                    rarity[i + 1] = temp2;

                    vymena = true;
                }
            }
            n--; // Po každém průchodu už je poslední prvek správně umístěn
        } while (vymena);
    }

    // <---------------------------- Seřazení podle rarity ---------------------------->

    static void serazeniPodleRarity() {
        boolean vymena;
        int n = rarity.length;
        do {
            vymena = false;
            for (int i = 0; i < n - 1; i++) {

                // rarity[i] > rarity[i + 1]
                // Tento část kontroluje, zda je rarita položky i větší než rarita položky i + 1.
                // Pokud je tomu tak, znamená to, že by měla být položka i + 1 umístěna na místo před položku i, protože u vyšší rarity chceme položky seřadit od nejnižší k nejvyšší.

                // rarity[i] == rarity[i + 1]
                // Pokud mají dvě položky stejnou raritu, seřadíme je podle prvního písmena názvu. Pokud je první písmeno položky i větší než položky i + 1, prohodíme je.


                // rarity[i] > rarity[i + 1] → Pokud je aktuální rarita větší než ta následující, prohodíme je.
                // rarity[i] == rarity[i + 1] && inventar[i].compareTo(inventar[i + 1]) > 0 → Pokud mají stejnou raritu, porovnáme názvy pomocí compareTo().
                // compareTo() vrací kladné číslo, pokud inventar[i] je „větší“ než inventar[i + 1] (tedy je abecedně později), takže je prohodíme.
                if (rarity[i] > rarity[i + 1] || (rarity[i] == rarity[i + 1] && inventar[i].compareTo(inventar[i + 1]) > 0)) {

                    // Prohození rarity
                    char temp1 = rarity[i];
                    rarity[i] = rarity[i + 1];
                    rarity[i + 1] = temp1;

                    // Prohození položek v inventáři
                    String temp2 = inventar[i];
                    inventar[i] = inventar[i + 1];
                    inventar[i + 1] = temp2;

                    vymena = true;
                }
            }
            n--;
        } while (vymena);
    }

    static void vypis() {

        // takhle jsem to pouzil ja, že nejdřív rarita a pak invetar ( A - Polozka1)
        //for (int i = 0; i < inventar.length; i++) {
        //System.out.println(rarity[i] + " - " + inventar[i]);
        // }

        // Takže si vyber tanhle, nebo si to udělej jak chceš
        for (int i = 0; i < inventar.length; i++) {
            System.out.println(inventar[i] + " (" + rarity[i] + ")"); // tady ti vypise takhle ( Polozka1 (A)
        }
        System.out.println(""); // tady ti to udela mezeru mezi serazeni podle Abecedy a rarity, aby si videla ze to funguje, mozna si to dej potom pryc

    }

    public static void main(String[] args) {
        // tady si to prejmenuj neco random nemeckeho, tak jak to mam ja. NEZAPOMEN!!!!!!!!!!
        pridavaniPolozky("Zeitschleifen-Tasche", 'A');
        pridavaniPolozky("Schwebende Tasse Tee", 'B');
        pridavaniPolozky("Luftgitarre", 'C');
        pridavaniPolozky("Super USB-Kabel", 'D');

        System.out.println("Výpis podle abecedy:");
        serazeniPodleAbecedy();
        vypis();

        System.out.println("Výpis podle rarity");
        serazeniPodleRarity();
        vypis();
    }
}

// klidne si to zkontroluj, ze to jde podle abecedy a rarity

// Nezapomen <-----------------------neco------------------------> dej do haje nebo udelej jinym zpusobem
// metody si asi nemusis prejmenovat, ale jestli to delas ze serazeniPodleAbecedy nebo serazenipodleabecedy nevim jak to delas
// to n-- myslim ze neni nutné ani, takze to muzes dat do haje, ale muzes to zkusit to jsem tam dal, aby to bylo rychlejsi
// promenne si klidne muzes prejmenovat jak chces, ale nemusis, podle toho jestli se ti to libi
// snad to pochopis a tohle uz nechci videt



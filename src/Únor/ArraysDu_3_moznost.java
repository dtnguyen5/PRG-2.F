package Únor;

import java.util.Arrays;

public class ArraysDu_3_moznost {

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
            'C', 'D', 'D', 'D', 'B', 'A', 'D', 'E', 'E', 'E', 'A', 'E', 'D', 'A',
            'E', 'D', 'A', 'A', 'D', 'A', 'E', 'D', 'E', 'B', 'C', 'C', 'A', 'B',
            'C', 'C', 'E', 'E'
    };

    // <---------------------------- Přidání položky do inventáře ---------------------------->

    static void pridaniPolozky(String polozka, char rarita) {

        inventar = Arrays.copyOf(inventar, inventar.length + 1);
        rarity = Arrays.copyOf(rarity, rarity.length + 1);

        inventar[inventar.length - 1] = polozka;
        rarity[rarity.length - 1] = rarita;
    }

    // <---------------------------- Seřazení podle abecedy ---------------------------->

    static void serazeniDleAbecedy() {
        boolean swapped;
        int n = inventar.length;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (inventar[i].compareTo(inventar[i + 1]) > 0) {
                    // Prohození položek v inventáři
                    String temp = inventar[i];
                    inventar[i] = inventar[i + 1];
                    inventar[i + 1] = temp;

                    // Prohození rarity
                    char tempR = rarity[i];
                    rarity[i] = rarity[i + 1];
                    rarity[i + 1] = tempR;

                    swapped = true;
                }
            }
            n--; // Po každém průchodu už je poslední prvek správně umístěn
        } while (swapped);
    }

    // <---------------------------- Seřazení podle rarity ---------------------------->

    static void serazeniPodleRarity() {
        boolean swapped;
        int n = rarity.length;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (rarity[i] > rarity[i + 1] || (rarity[i] == rarity[i + 1] && inventar[i].charAt(0) > inventar[i + 1].charAt(0))) {

                    // Prohození rarity
                    char tempR = rarity[i];
                    rarity[i] = rarity[i + 1];
                    rarity[i + 1] = tempR;

                    // Prohození položek v inventáři
                    String temp = inventar[i];
                    inventar[i] = inventar[i + 1];
                    inventar[i + 1] = temp;

                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    // <---------------------------- Vypsání inventáře ---------------------------->

    static void vypisInventar() {

        for (int i = 0; i < inventar.length; i++) {
            System.out.println(rarity[i] + " - " + inventar[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        pridaniPolozky("Polozka1", 'A');
        pridaniPolozky("Polozka2", 'B');
        pridaniPolozky("Polozka3", 'C');
        pridaniPolozky("Polozka4", 'D');


        serazeniDleAbecedy();
        vypisInventar();

        serazeniPodleRarity();
        vypisInventar();
    }

}

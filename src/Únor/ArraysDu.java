package Únor;

import java.util.Arrays;

public class ArraysDu {

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

    private static void pridaniPolozky(String polozka, char rarita) {

        inventar = Arrays.copyOf(inventar, inventar.length + 1);
        rarity = Arrays.copyOf(rarity, rarity.length + 1);

        inventar[inventar.length - 1] = polozka;
        rarity[rarity.length - 1] = rarita;

    }

    // <---------------------------- Seřazení podle abecedy ---------------------------->

    private static void serazeniDleAbecedy() {

        // <---------------------------- Původní kód podle seřazení podle charAt mi nefunguje, protože mi to porovnává jenom první znak řetězce ---------------------------->
        /*
        for (int i = 0; i < inventar.length - 1; i++) {

            for (int j = 0; j < inventar.length - 1 - i; j++) {

                if (inventar[j].charAt(0) > inventar[j + 1].charAt(0)) {

                    String temp = inventar[j];
                    inventar[j] = inventar[j + 1];
                    inventar[j + 1] = temp;


                    char tempR = rarity[j];
                    rarity[j] = rarity[j + 1];
                    rarity[j + 1] = tempR;
                }
            }
        }
         */

        // <---------------------------- Nový kód ---------------------------->

        for (int i = 0; i < inventar.length - 1; i++) {

            for (int j = 0; j < inventar.length - 1 - i; j++) {

                if (inventar[j].compareTo(inventar[j + 1]) > 0) {

                    String temp = inventar[j];
                    inventar[j] = inventar[j + 1];
                    inventar[j + 1] = temp;


                    char tempR = rarity[j];
                    rarity[j] = rarity[j + 1];
                    rarity[j + 1] = tempR;
                }
            }
        }
    }

    // <---------------------------- Seřazení podle rarity ---------------------------->

    private static void serazeniPodleRarity() {

        // <---------------------------- Původní kód podle seřazení podle charAt mi nefunguje, protože mi to porovnává jenom první znak řetězce ---------------------------->
        /*
        for (int i = 0; i < rarity.length - 1; i++) {

            for (int j = 0; j < rarity.length - 1 - i; j++) {

                if (rarity[j] > rarity[j + 1] || (rarity[j] == rarity[j + 1] && inventar[j].charAt(0) > inventar[j + 1].charAt(0))) {

                    char tempR = rarity[j];
                    rarity[j] = rarity[j + 1];
                    rarity[j + 1] = tempR;


                    String temp = inventar[j];
                    inventar[j] = inventar[j + 1];
                    inventar[j + 1] = temp;
                }
            }
        }

         */

        // <---------------------------- Nový kód---------------------------->

        for (int i = 0; i < rarity.length - 1; i++) {

            for (int j = 0; j < rarity.length - 1 - i; j++) {

                if (rarity[j] > rarity[j + 1] || (rarity[j] == rarity[j + 1] && inventar[j].compareTo(inventar[j + 1]) > 0)) {

                    char tempR = rarity[j];
                    rarity[j] = rarity[j + 1];
                    rarity[j + 1] = tempR;


                    String temp = inventar[j];
                    inventar[j] = inventar[j + 1];
                    inventar[j + 1] = temp;
                }
            }
        }



    }

    // <---------------------------- Vypsání inventáře ---------------------------->

    private static void vypisInventar() {

        for (int i = 0; i < inventar.length; i++) {
            System.out.println("{ " + rarity[i] + " } - " + inventar[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        pridaniPolozky("Zeitschleifen-Tasche", 'C');
        pridaniPolozky("Schwebende Tasse Tee", 'A');
        pridaniPolozky("Luftgitarre", 'D');
        pridaniPolozky("Super USB-Kabel", 'B');

        System.out.println("Výpis podle abecedy:");
        serazeniDleAbecedy();
        vypisInventar();

        System.out.println("Výpis podle rarity:");
        serazeniPodleRarity();
        vypisInventar();
    }
}

    // Takovýhle úkol už nikdy :)
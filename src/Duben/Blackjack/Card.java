package Duben.Blackjack;

public class Card {

    String rank;
    String suit;
    int value;

    // <-------------------------------------- Konstruktor třídy -------------------------------------->
    public Card(String rank, String suit){

        this.rank = rank;
        this.suit = suit;

        if (rank.equals("A")) {
            this.value = 11;
        }
        else if (rank.equals("K") || rank.equals("Q") || rank.equals("J")) {
            this.value = 10;
        }
        else {
            this.value = Integer.parseInt(rank);
        }
    }

    // <-------------------------------------- Metoda pro výpis karty -------------------------------------->
    public void printCard(){
        System.out.println("[ " + suit + " ] - (" + rank + ")");
    }
}

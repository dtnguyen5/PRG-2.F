package Duben.Blackjack;

import java.util.ArrayList;

public class Player {

    // <-------------------------------------- Vytvoření ArrayListu pro seznam karet -------------------------------------->
    ArrayList<Card> hand = new ArrayList<>();

    // <-------------------------------------- Vytvoření metody => používá se když si hráč vezme novou kartu -------------------------------------->
    public void drawCard(Deck deck){
        Card card = deck.dealCard();

        if (card != null){
            hand.add(card);
            System.out.println("Lízl sis kartu: "   );
            card.printCard();
        }
    }

    // <-------------------------------------- Metoda zjistí, jestli dealer nebo hráč nepřesáhli číslo 21 ------------------------------------->
    public int getHandValue(){
        int suma = 0;

        for (Card i : hand){
            suma += i.value;
        }
        return suma; // vrací mi součet, jako celkovou hodnotu hráčovy ruky
    }

    // <-------------------------------------- Metoda zobrazení karet na konci hry nebo po každém líznutí a vypíše celkový součet ------------------------------------->
    public void showHand(){
        System.out.println("\nTvoje karty: ");
        for (Card i : hand){
            i.printCard();
        }
        System.out.println("Součet: " + getHandValue());
    }

    // Vezme všechny karty - vyprázdní ruku hráče, který se používá na začátku nové hry
    public void resetHand(){
        hand.clear();
    }

}

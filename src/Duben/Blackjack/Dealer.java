package Duben.Blackjack;

import java.util.ArrayList;

public class Dealer {

    // <-------------------------------------- Vytvoření ArrayListu pro uložení karet, který má dealer v ruce -------------------------------------->
    ArrayList<Card> hand = new ArrayList<>();

    // <-------------------------------------- Metoda pro dealera, že si lízne kartu z balíčku a přidá si ji do ruky -------------------------------------->
    public void drawCard(Deck deck){
        Card card = deck.dealCard();

        if (card != null){
            hand.add(card);
        }
    }

    // <-------------------------------------- Metoda sečtení všech karet v ruce -------------------------------------->
    public int getHandValue(){
        int suma = 0;

        for (Card i : hand){
            suma += i.value;
        }
        return suma;
    }

    // <-------------------------------------- Metoda pro vypsaní všech karet, co má dealer v ruce a taky zobrazí celkový součet -------------------------------------->
    public void showHand(){
        System.out.println("Dealerovy karty: ");

        for (Card i : hand){
            i.printCard();
        }
        System.out.println("Součet " + getHandValue());
    }

    // <-------------------------------------- Metoda pro odstranění všech karet z ruk při spuštění nové hry -------------------------------------->
    public void resetHand(){
        hand.clear();
    }
}

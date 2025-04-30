package Duben.Blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<>();
    private String[] suits;
    private String[] ranks;

    // <-------------------------------------- Konstruktor pro vytváření balíčku karet -------------------------------------->
    public Deck() {

        this.suits = new String[]{"Piky ♠", "Káry ♦", "Kříže ♣", "Srdce ♥"};
        this.ranks = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < suits.length; i++) {

            for (int j = 0; j < ranks.length; j++) {

                String suit = suits[i];
                String rank = ranks[j];

                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    // <-------------------------------------- Metoda, která promíchá karty v balíčku -------------------------------------->
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // <-------------------------------------- Metoda na rozdávání karet -------------------------------------->
    public Card dealCard() {

        if (!cards.isEmpty()){
            return cards.remove(0);
        }
        return null;
    }
}

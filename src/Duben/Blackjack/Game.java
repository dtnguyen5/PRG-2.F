package Duben.Blackjack;

import java.util.Scanner;

public class Game {
    Player player;
    Dealer dealer = new Dealer();
    Deck deck;

    Scanner scn = new Scanner(System.in);

    public Game (Player player){
        this.player = player;
        this.deck = new Deck();
    }

    // <-------------------------------------- Metoda pro otázku, jestli si chce hráč líznout další kartu -------------------------------------->
    public boolean takeTurn() {
        System.out.println("Chceš další kartu? (ano/ne)");
        String response = scn.nextLine();

        if (response.equalsIgnoreCase("ano")){
            return true;
        }
        else if (response.equalsIgnoreCase("ne")){
            return false;
        }
        else {
            System.out.println("Neodpovídáte, takže to ukončím!");
            return false;
        }
    }

    // <-------------------------------------- Hlavní metoda, která spouští průběh hry -------------------------------------->
    public void start(){

        boolean wantToPlay = true;

        while (wantToPlay){

            player.resetHand();
            dealer.resetHand();
            deck = new Deck();
            deck.shuffle();

            player.drawCard(deck);
            player.drawCard(deck);
            dealer.drawCard(deck);
            dealer.drawCard(deck);

            player.showHand();

            // Cyklus pro hráče, který si tahá karty, dokud chce a nepřekročí 21
            while (player.getHandValue() < 21 && (takeTurn())){
                player.drawCard(deck);
                player.showHand();
            }

            int playerValue = player.getHandValue();
            if (playerValue > 21){
                System.out.println("Překročili jste 21, bohužel jste prohrál!");
            }
            else {
                // Dealer tahá karty, dokud nemá alespoň 17
                while (dealer.getHandValue() < 17){
                    dealer.drawCard(deck);
                }

                dealer.showHand();
                int dealerValue = dealer.getHandValue();

                // Vyhodnocení výsledku hry
                if (dealerValue > 21){
                    System.out.println("Dealer překročil 21, vyhráli jste!");
                }
                else if (dealerValue > playerValue){
                    System.out.println("Dealer má více karet, prohráli jste!");
                }
                else if (dealerValue < playerValue) {
                    System.out.println("Máte více karet, vyhráli jste!");
                }
                else {
                    System.out.println("Remíza!");
                }
            }


            System.out.println("Chceš hrát znovu? (ano/ne)");
            String response = scn.nextLine();
            if (response.equalsIgnoreCase("ne")) {
                wantToPlay = false;
            }
        }
        System.out.println("Konec hry!");
    }

    // <-------------------------------------- Spuštění hry -------------------------------------->
    public static void main(String[] args) {
        Player player = new Player();
        Game game = new Game(player);
        game.start();
    }
}

package ua.hillel.HomeTask_09;

public class Poker {
    public  static  void main(String[] args) throws NotFullDeckException, JokerException, DeckNotShuffle, NotEnoughPlayer {
        PokerMachine machine = new PokerMachine();
        Deck deck = machine.createDeck();

        machine.shuffleDeck(deck);
        machine.serveCardsToPlayer(5, deck);
    }
}

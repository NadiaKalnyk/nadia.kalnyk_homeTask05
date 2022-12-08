package ua.hillel.HomeTask_09;

public class Poker {
    public  static  void main(String[] args) throws NotFullDeckException, JokerException, DeckNotShuffleException, NotEnoughPlayerException {
        PokerMachine machine = new PokerMachine();
        Deck deck = machine.createDeck();
        
        machine.shuffleDeck(deck);
        boolean isShuffleDeck;
        if (isShuffleDeck=true) {
            machine.serveCardsToPlayer(5, deck);
        } else {
        } throw new DeckNotShuffleException("Deck not shuffle");
    }
}

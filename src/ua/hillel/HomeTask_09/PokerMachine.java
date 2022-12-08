package ua.hillel.HomeTask_09;

import java.util.Random;

public class PokerMachine {
    public Deck createDeck() throws NotFullDeckException, IllegalArgumentException {
        String[] suites = { "Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Deck deck = new Deck();
        if ((suites.length == 4) & (values.length == 13)) {
            for (String suit : suites) {
                for (String value : values) {
                    Card card = new Card(value, suit);
                    deck.addCard(card);
                    if ((value == null) || (suit== null)) {
                        throw new NullPointerException ("Null pointer exception");
                    }
                }
            } return deck;
        } else throw new NotFullDeckException(" Not full deck");
    }

        public void shuffleDeck (Deck deck) throws DeckNotShuffle{
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                    int in = random.nextInt(52);
                    int out = random.nextInt(52);

                    Card tmpCard = deck.getCard(in);
                    deck.setCard(in, deck.getCard(out));
                    deck.setCard(out, tmpCard);
                    if (deck.getCard(in).equals(out)){
                        throw new DeckNotShuffle("Deck not shuffle");
                    }
            }
        }
        public void serveCardsToPlayer( int noOfPlayers, Deck deck) throws JokerException, NotEnoughPlayer {
            int index = 0;
            for (int round = 1; round <= 5; round++) {
                System.out.println("Round " + round);
                if ((noOfPlayers<8)&(noOfPlayers>2)) {
                    for (int player = 1; player <= noOfPlayers; player++) {
                        Card card = deck.getCard(index++);
                        if (card.getValue().equals("Ace") & (card.getSuit().equals("Spades"))) {
                            throw new JokerException(" Joker");
                        }
                        System.out.println(String.format("Player %d gets card %s%n", player, deck.getCard(index++)));
                    }
                } else throw new NotEnoughPlayer ("Not enough player ");
            }
            System.out.println("");
        }
   }
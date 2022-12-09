package ua.hillel.homeTask_04;

import java.util.Random;

public class Task04Poker {
    private static int noOfCards = 54;
    private static int noOfPlayers = 4;


    private static String[] cards = new String[noOfCards];

    public static void main(String[] args) {
        createDeck();
        shuffleDeck();
        serveCards();
    }

    public static void createDeck() {
        String[] suites = {"Heards", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int index = 0;
        for (String suit: suites) {
            for (String value: values) {
                cards[index++] = value+ " of " + suit;
            }
        }
    }

    private static void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(noOfCards);
            int out = random.nextInt(noOfPlayers);

            String tmpCard = cards[in];
            cards[in] = cards[out];
            cards[out] = tmpCard;
        }
    }

    private static void  serveCards() {
        int index = 0;
        for (int round = 1; round <= 5; round++) {
            System.out.println("Round " + round);
            for (int player = 1; player <= noOfPlayers; player++) {
                System.out.println(String.format("Player %d gets card %s%n", player, cards[index++]));
            }
            System.out.println("");
        }
    }
}

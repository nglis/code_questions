package OOP.DeckOfCards;

public class Deck {
    private Card[] cards;

    public static int defaultDeckSize = 52;
    public static String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
    public static String[] cardValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Deck() {
        cards = new Card[52];
        int count = 0;

        for(String suit : suits) {
            for (String value : cardValues) {
                cards[count++] = new Card(value, suit);
            }
        }
    }

}


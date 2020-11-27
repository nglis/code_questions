package OOP.DeckOfCards.Alternative;

import java.util.ArrayList;

public class Deck <T extends Card> {
    private ArrayList<T> cards;
    private int dealtIndex = 0;

    public void setDeckOfCards (ArrayList<T> deckOfCards) {
        cards = deckOfCards;
    }

    public void shuffle() {
        // Implements shuffle
    }

    public int remainingCards() {
        return cards.size() - dealtIndex;
    }

    public T[] dealHand(int number) {
        // Implement dealHand
        return null;
    }

    public T dealCard() {
        // Implement dealCard
        return null;
    }
}

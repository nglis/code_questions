package OOP.DeckOfCards.Alternative;

public enum Suit {
    Club(0),
    Diamond(1),
    Heart(2),
    Spade(3);

    private int value;
    Suit(int v) { value = v; }
    public int getValue() { return value; }
    public static Suit getSuitFromValue(int value) {
        // Implementation
        return null;
    }
}

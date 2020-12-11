package OOP.Othello.Alternative;

public class Player {
    private Color color;

    public Player(Color c) {
        color = c;
    }

    public int getScore() {
        // implement getScore
    }

    public boolean playPiece(int r, int c) {
        return Game.getInstance().getBoard().placeColor(r, c, color);
    }

    public Color getColor() {
        return color;
    }
}

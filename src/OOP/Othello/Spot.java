package OOP.Othello;

public class Spot {
    private int[] position;
    private Piece piece;

    public Spot(int x, int y) {
        position = new int[]{ x, y };
    }

    public int[] getPosition() {
        return position;
    }

    public boolean isEmpty() {
        return piece == null;
    }

    public void setPiece(Piece p) {
        piece = p;
    }

    public Piece getPiece() {
        return piece;
    }
}

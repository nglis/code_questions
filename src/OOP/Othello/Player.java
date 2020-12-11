package OOP.Othello;

public class Player {
    private int score;
    private boolean toMove;
    private PieceColor color;

    public Player(PieceColor c) {
        color = c;
        score = 0;
    }

    public Piece flipPieceAtPosition(Board b, int x, int y) {
        Piece p = b.getPieceAtPosition(x, y);
        if (p == null) {
            return null;
        } else {
            p.swapColor();
            return p;
        }
    }

    public Piece addPieceAtPosition(Board b, int x, int y) {
        Spot s = b.getSpot(x, y);
        if (s.isEmpty()) {
            Piece p = new Piece(color, new int[]{ x, y });
            s.setPiece(p);
            return p;
        }

        return null;
    }

    public int getScore() {
        return score;
    }

    public boolean isToMove() {
        return toMove;
    }

    public void setToMove(boolean m) {
        toMove = m;
    }
}

package OOP.Othello;

public class Piece {
    private PieceColor color;
    private int[] position;

    public Piece(PieceColor c, int[] p) {
        color = c;
        position = p;
    }

    public PieceColor getColor() {
        return color;
    }

    public PieceColor swapColor() {
        if (color == PieceColor.BLACK) {
            color = PieceColor.WHITE;
        } else {
            color = PieceColor.BLACK;
        }

        return color;
    }

    public int[] getPosition() {
        return position;
    }

}

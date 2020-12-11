package OOP.Othello.Alternative;

public class Board {
    private int blackCount = 0;
    private int whiteCount = 0;
    private Piece[][] board;

    public Board(int rows, int columns) {
        board = new Piece[rows][columns];
    }

    public void initialize() {
        // implement initialize
    }

    public boolean placeColor(int row, int column, Color color) {
        // implement placeColor
    }

    private int flipSection(int row, int column, Color color, Direction d) {
        // implement flipSection
    }

    public int getScoreForColor(Color c) {
        if (c == Color.Black)
            return blackCount;
        else
            return whiteCount;
    }

    public void updateScore(Color newColor, int newPieces) {
        // implement updateScore
    }
}

package OOP.Othello;

public class Board {
    private static int BOARD_LENGTH = 8;
    private Player player1;
    private Player player2;
    private Spot[] spots;

    public Board(Spot[] s) {
        spots = s;
    }

    public Board getBoard() {
        return this;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Piece getPieceAtPosition(int x, int y) {
        Spot s = getSpot(x, y);
        if (s.isEmpty()) {
            return null;
        }

        return s.getPiece();
    }

    public Spot getSpot(int x, int y) {
        for (Spot s : spots) {
            if (s.getPosition()[0] == x && s.getPosition()[1] == y) {
                return s;
            }
        }

        return null; // Invalid position
    }

    public void updateScore() {
        // Implement updateScore
    }

    public void clearBoard() {
        // Implement clearBoard
    }

    public void checkWinner() {
        // Implement checkWinner
    }
}

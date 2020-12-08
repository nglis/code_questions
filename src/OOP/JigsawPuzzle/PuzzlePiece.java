package OOP.JigsawPuzzle;

public class PuzzlePiece {
    private PuzzlePieceSide left_side;
    private PuzzlePieceSide top_side;
    private PuzzlePieceSide right_side;
    private PuzzlePieceSide bottom_side;

    private PuzzlePiece leftConnected;
    private PuzzlePiece topConnected;
    private PuzzlePiece rightConnected;
    private PuzzlePiece bottomConnected;

    public PuzzlePiece(PuzzlePieceSide l, PuzzlePieceSide t, PuzzlePieceSide r, PuzzlePieceSide b) {
        left_side = l;
        top_side = t;
        right_side = r;
        bottom_side = b;
    }

    public boolean fitsWith(PuzzlePiece piece) {
        // Implement fitsWith
    }

    // Implement getters for PuzzlePieceSides
    // Implement getters and setters for Connected sides
}

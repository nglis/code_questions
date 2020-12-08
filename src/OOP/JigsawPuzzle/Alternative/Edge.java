package OOP.JigsawPuzzle.Alternative;

public class Edge {
    enum Type {
        inner, outer, flat
    }
    Piece parent;
    Type type;
    int index;
    Edge attached_to;

    boolean fitsWith(Edge edge) {
        // Implement fitsWith
    }
}

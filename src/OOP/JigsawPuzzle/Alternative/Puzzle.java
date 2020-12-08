package OOP.JigsawPuzzle.Alternative;

public class Puzzle {
    Piece[] pieces;
    Piece[][] solution;

    Edge[] inners, outers, flats;
    Piece[] corners;

    void sort() {
//        for each piece p in pieces {
//            if (p has two flat edges)
//                then add p to corners
//
//            for each edge in p.edges {
//                if edge is inner then add to inners
//                if edge is outer then add to outers
//            }
//        }
    }

    void solve() {
//        Edge currentEdge = getExposedEdge(corner[0]);
//
//        while (currentEdge != null) {
//            Edge[] opposites = currentEdge.type == inner ? outers : inners;
//
//            for each Edge fittingEdge in opposites {
//                if (currentEdge.fitsWith(fittingEdge)) {
//                    attachEdges(currentEdge, fittingEdge);
//                    removeFromList(currentEdge);
//                    removeFromList(fittingEdge);
//
//                    currentEdge = nextExposedEdge(fittingEdge);
//                    break;
//                }
//            }
//        }
    }

    public void removeFromList(Edge edge) {
        if (edge.type == flat) return;
        Edge[] array = currentEdge.type == inner ? inners : outers;
        array.remove(edge);
    }

    public Edge nextExposedEdge(Edge edge) {
        int next_index = (edge.index + 2) % 4;
        Edge next_edge = edge.parent.edges[next_index];
        if (isExposed(next_edge)) {
            return next_edge;
        }

        return getExposedEdge(edge.parent);
    }

    public Edge attachEdges(Edge e1, Edge e2) {
        e1.attached_to = e2;
        e2.attached_to = e1;
    }

    public Edge isExposed(Edge e1) {
        return edge.type != flat && edge.attached_to == null;
    }

    public Edge getExposedEdge(Piece p) {
        for each Edge edge in p.edges {
            if (isExposed(edge)) {
                return edge;
            }
        }
    }
}

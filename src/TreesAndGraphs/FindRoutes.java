package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class FindRoutes {

    // Basic search for if two vertices have an edge
    public boolean hasEdge(Graph graph, Vertex a, Vertex b) {
        ArrayList<Vertex> forA = graph.get(a);
        ArrayList<Vertex> forB = graph.get(b);

        for (Vertex v : forA) {
            if (v.equals(b))
                return true;
        }

        for (Vertex v : forB) {
            if (v.equals(a))
                return true;
        }
    }

}

package TreesAndGraphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Vertex {
    String label;
    public Vertex(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (this == o)
            return true;

        if ((o instanceof Vertex) && ((Vertex) o).getLabel() == this.getLabel())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        return prime + (label == null ? 0 : label.hashCode());
    }
}

// Implementation uses adjacency list

public class Graph {
    private Map<Vertex, List<Vertex>> adjVertices;

    void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

}

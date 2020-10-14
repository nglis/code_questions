package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkAtDepth {
    // Links all the nodes at a given depth

    class NodeWrapper {
        Node node;
        int depth;

        public NodeWrapper(Node n , int d) {
            node = n;
            depth = d;
        }
    }

    public ArrayList<ArrayList> nodesAtDepth(Node root) {
        ArrayList <LinkedList> outer = new ArrayList<>();
        LinkedList <NodeWrapper> inner = new LinkedList<>();

        Queue q;
        q.add(new NodeWrapper(root, 0));

        int currentDepth = 0;

        while (q.size() > 0) {
            NodeWrapper temp = (NodeWrapper) q.peek();

            if (temp.depth != currentDepth) {
                currentDepth = temp.depth;
                outer.add(inner);
                inner = new LinkedList<>();
            }

            if (temp.node.left != null)
                q.add(new NodeWrapper(temp.node.left, temp.depth++));

            if (temp.node.right != null)
                q.add(new NodeWrapper(temp.node.right, temp.depth++));

        }

    }

}

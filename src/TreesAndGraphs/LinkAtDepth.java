package TreesAndGraphs;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkAtDepth {
    // Links all the nodes at a given depth

    public ArrayList<LinkedList<TreeNode>> createLevelLinkedList (TreeNode root) {
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();

        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        if (root != null) {
            current.add(root);
        }

        while (current.size() > 0) {
            result.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<TreeNode>();

            for (TreeNode p : parents) {
                if (p.left != null) {
                    current.add(p.left);
                }
                if (p.right != null) {
                    current.add(p.right);
                }
            }
        }

        return result;
    }

    class NodeWrapper {
        Node node;
        int depth;

        public NodeWrapper(Node n , int d) {
            node = n;
            depth = d;
        }
    }

    public ArrayList <LinkedList> nodesAtDepth(Node root) {
        ArrayList <LinkedList> outer = new ArrayList<>();
        LinkedList <Node> inner = new LinkedList<>();

        Queue q;

        NodeWrapper rootWrapped = new NodeWrapper(root, 0);

        inner.push(rootWrapped.node);
        q.add(rootWrapped);

        int currentDepth = -1;

        while (q.size() > 0) {
            NodeWrapper temp = (NodeWrapper) q.peek();

            if (temp.depth != currentDepth) {
                currentDepth = temp.depth;
                outer.add(inner);
                inner = new LinkedList<>();
            }

            if (temp.node.left != null) {
                NodeWrapper leftNodeWrapped = new NodeWrapper(temp.node.left, temp.depth++);
                inner.push(leftNodeWrapped.node);
                q.add(leftNodeWrapped);
            }

            if (temp.node.right != null){
                NodeWrapper rightNodeWrapped = new NodeWrapper(temp.node.right, temp.depth++);
                inner.push(rightNodeWrapped.node);
                q.add(rightNodeWrapped);
            }
        }

        return outer;
    }
}

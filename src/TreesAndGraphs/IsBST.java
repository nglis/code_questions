package TreesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class IsBST {
    // Check if left node is lesser than root node and right node is greater than root node
    public boolean subTreeIsBST(Node root) {
        if (root.left != null && root.left.data > root.data)
            return false;

        if (root.right != null && root.right.data < root.data)
            return false;

        return true;
    }

    public boolean isBST(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (q.size() > 0) {
            Node temp = q.remove();

            if (!subTreeIsBST(temp))
                return false;

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
        }
    }
}

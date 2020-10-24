package TreesAndGraphs;

import javax.swing.tree.TreeNode;

public class Successor {

    // Solution
    public TreeNode inOrderSuccessor(TreeNode n) {
        if (n == null)
            return null;

        if (n.right != null) {
            return n. right;
        } else {
            TreeNode q = n;
            TreeNode x = q.parent;
            while (x != null && x.left != q) {
                q = x;
                x = q.parent;
            }

            return x;
        }
    }

    // Solution helper
    public TreeNode leftMostChild(TreeNode n) {
        if (n == null)
            return null;

        while (n.left != null)
            n = n.left;

        return n;
    }

    // Helper node to find first right node ancestor
    public Node helper (Node n) {
        if (n.parent == null || n.parent.parent == null)
            return null;

        if (n.parent.parent.left == n.parent)
            return n.parent.parent;
        else
            return helper(n.parent);
    }

    // Written attempt
    public Node getSuccessor (Node n) {
        if (n == null)
            return null;

        Node temp = n;

        if (temp.right != null) {
            temp = temp.right;
            while (temp.left != null)
                temp = temp.left;

            return temp;
        }

        if (temp.parent.left == temp)
            return temp.parent;

        if (temp.parent.right == temp)
            return helper(temp);

        return null;
    }

}

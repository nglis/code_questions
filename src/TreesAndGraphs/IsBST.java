package TreesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class IsBST {

    // Solution
    boolean checkBST(TreeNode n, int min, int max) {
        if (n == null)
            return false;

        if (n.data <= min || n.data >= max)
            return false;

        if (!checkBST(n.left, min, n.data) ||
                !checkBST(n.right, n.data, max))
            return false;

        return true;
    }

    // Alternative solution: depth-first traversal method
    public static int index = 0;
    public void checkBST(Node root, int[] array) {
        if (root == null)
            return;

        checkBST(root.left, array);
        array[index] = root.data;
        index++;

        checkBST(root.right, array);
    }
    public boolean isBST(Node root) {
        int[] array = new int [root.size];
        checkBST(root, array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i +1])
                return false;
        }
        return true;
    }

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

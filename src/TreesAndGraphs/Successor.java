package TreesAndGraphs;

public class Successor {

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

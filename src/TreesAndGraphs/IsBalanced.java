package TreesAndGraphs;

public class IsBalanced {
    // Gets the height of a binary (sub)tree
    public int getHeight(Node root) {
        if (root == null)
            return 0;

        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    // Recursively checks if all subtrees are balanced in a binary tree
    public boolean isBalanced(Node root) {
        if (root == null)
            return true;

        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(heightDiff) > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }
}

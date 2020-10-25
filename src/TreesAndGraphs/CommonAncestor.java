package TreesAndGraphs;

import javax.swing.tree.TreeNode;

public class CommonAncestor {
    public boolean covers(TreeNode root, TreeNode p) {
        if (root == null) return false;
        if (root == p) return true;
        return covers(root.left, p) || covers(root.right, p);
    }

    TreeNode commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        boolean p_on_left = covers(root.left, p);
        boolean q_on_left = covers(root.right, q);

        if (q_on_left != p_on_left) return root;

        TreeNode subtree_side = p_on_left ? root.left : root.right;
        return commonAncestorHelper(subtree_side, p, q);
    }

    TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (!covers(root, p) || !covers(root, q))
            return null;

        return commonAncestorHelper(root, p, q);
    }
}

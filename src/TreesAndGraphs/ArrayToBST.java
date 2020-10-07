package TreesAndGraphs;

import javax.swing.tree.TreeNode;

public class ArrayToBST {

    // Sorted (increasing) array with unique integer elements
    // Convert to a binary search tree with minimal height

    TreeNode createMinimalBST(int arr[], int start, int end) {
        if (end < start) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = createMinimalBST(arr, start, mid - 1);
        n.right = createMinimalBST(arr, mid, end);
        return n;
    }

    TreeNode createMinimalBST(int arr[]) {
        createMinimalBST(arr, 0, arr.length -1);
    }

}

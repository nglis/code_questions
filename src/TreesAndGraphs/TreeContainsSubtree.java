package TreesAndGraphs;

import com.sun.source.tree.Tree;

public class TreeContainsSubtree {

    // Attempt
    boolean TreesAreEqual(Node r1, Node r2) {
        if (r1 == null && r2 == null)
            return true;

        if (r1 == null || r2 == null)
            return false;

        if (r1.data != r2.data)
            return false;

        return TreesAreEqual(r1.left, r2.left) && TreesAreEqual(r1.right, r2.right);
    }

    boolean existsEqualSubtree(Node r1, Node r2) {
        if (r1 == null)
            return false;

        if (r1.data == r2.data)
            if (TreesAreEqual(r1, r2))
                return true;

        return existsEqualSubtree(r1.left, r2) || existsEqualSubtree(r1.right, r2);
    }


}

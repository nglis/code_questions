package TreesAndGraphs;

public class FindSumPaths {

    // Print paths of a tree that give a sum
    // Paths can start or end at any node

    public void findSum(Node node, int sum) {
        int depth = depth(node);
        int[] path = new int[depth];
        findSum(node, sum, path, depth);
    }

    public void findSum(Node node, int sum, int[] path, int level) {
        if (node == null)
            return;

        path[level] = node.data;

        int t = 0;
        for (int i = level; i >= 0; i--) {
            t += path[i];
            if (t == sum)
                printPath(path, i, level);
        }

        findSum(node, sum, path, level + 1);
        findSum(node, sum, path, level + 1);
    }

    // Every time a path is found for a sum, print the values
    public void printPath(int[] path, int start, int end) {
        for (int i = start; i <= end; i++)
            System.out.print(path[i] + " ");
    }

    // Get depth of a node in a tree
    public int depth(Node node) {
        if (node == null)
            return 0;

        return Math.max(depth(node.left), depth(node.right)) + 1;
    }

}

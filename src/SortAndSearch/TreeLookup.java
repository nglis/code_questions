package SortAndSearch;

public class TreeLookup {

    // Read stream of integers into a suitable data structure - Implement track and getRankOfNumber

    public static RankNode root = null;

    public void track(int n) {
        if (root == null) root = new RankNode(n);
        else root.insert(n);
    }

    public int getRankOfNumber(int n) {
        return root.getRank(n);
    }

    class RankNode {
        int leftNodes = 0;
        RankNode left = null;
        RankNode right = null;
        int data;

        public RankNode(int d) {
            data = d;
        }

        public void insert(int n) {
            if (n <= data) {
                if (left == null) left = new RankNode(n);
                else left.insert(n);
                leftNodes++;
            } else {
                if (right == null) right = new RankNode(n);
                else right.insert(n);
            }
        }

        public int getRank(int n) {
            if (data == n) {
                return leftNodes;
            } else if (n < data) {
                if (left == null) return -1;
                else return left.getRank(n);
            } else {
                int rightRank = right != null ? right.getRank(n) : -1;
                if(rightRank == -1) return -1;
                else return leftNodes + 1 + rightRank;
            }
        }
    }
}

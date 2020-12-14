package Recursion;

import java.awt.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class RobotPaths {

    // x, y represent current coordinates
    // X, Y represent goal coordinates

    public int paths(int x, int y, int X, int Y, int[][] visited, boolean[][] offLimits) {
        if (y > Y || x > X || offLimits[x][y] == true) {
            return 0;
        } else if (x == X && y == Y) {
            return 1;
        } else if (visited[x][y] > -1) {
            return visited[x][y];
        }

        visited[x][y] = paths(x + 1, y, X, Y, visited, offLimits) + paths(x, y + 1, X, Y, visited, offLimits);
        return visited[x][y];
    }

    // sol'n

    public boolean getPath(int x, int y, ArrayList<Point> path, Hashtable<Point, Boolean> cache) {
        Point p = new Point(x, y);

        if (cache.containsKey(p)) {
            return cache.get(p);
        }

        if (x == 0 && y == 0) {
            return true;
        }

        boolean success = false;
        if (x >= 1 && isFree(x - 1, y)) {
            success = getPath(x - 1, y, path, cache);
        }

        if (!success && y >= 1 && isFree(x, y - 1)) {
            success = getPath(x, y - 1, path, cache);
        }

        if (success) {
            path.add(p);
        }

        cache.put(p, success);
        return success;
    }

}

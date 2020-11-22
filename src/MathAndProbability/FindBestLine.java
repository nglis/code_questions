package MathAndProbability;

import java.util.ArrayList;
import java.util.HashMap;

// On a 2d graph, find the line that connects the most points

public class FindBestLine {
    Line findBestLine(GraphPoint[] points) {
        Line bestLine = null;
        int bestCount = 0;
        HashMap<Double, ArrayList<Line>> linesBySlope = new HashMap<Double, ArrayList<Line>>();

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                Line line = new Line(points[i], points[j]);
                insertLine(linesBySlope, line);
                int count = countEquivalentLines(linesBySlope, line);
                if (count > bestCount) {
                    bestLine = line;
                    bestCount = count;
                }
            }
        }
        return bestLine;
    }

    int countEquivalentLines(ArrayList<Line> lines, Line line) {
        if (lines == null) return 0;
        int count = 0;
        for (Line parallelLine : lines) {
            if (parallelLine.isEquivalent(line))
                count++;
        }

        return count;
    }

    int countEquivalentLines(HashMap<Double, ArrayList<Line>> linesBySlope, Line line) {
        double key = floorToNearestEpsilon(line.slope);
        double eps = epsilon;
        int count = countEquivalentLines(linesBySlope.get(key), line) +
                countEquivalentLines(linesBySlope.get(key - eps), line) +
                countEquivalentLines(linesBySlope.get(key + eps), line);

        return count;
    }

    void insertLine(HashMap<Double, ArrayList<Line>> linesBySlope, Line line) {
        ArrayList<Line> lines = null;
        double key = floorToNearestEpsilon(line.slope);
        if (!linesBySlope.containsKey(key)) {
            lines = new ArrayList<Line>();
            linesBySlope.put(key, lines);
        } else {
            lines = linesBySlope.get(key);
        }
    }

    // Use epsilon as an alternative for checking value equivalency
    public static double epsilon = .0001;

    public static double floorToNearestEpsilon(double d) {
        int r = (int) (d / epsilon);
        return ((double) r) * epsilon;
    }

    public class Line {
        public double slope, intercept;
        private boolean infinite_slope = false;

        public Line(GraphPoint p, GraphPoint q) {
            if (Math.abs(p.x - q.x) > epsilon) {
                slope = (p.y - q.y) / (p.x - q.x);
                intercept = p.y - slope * p.x;
            } else {
                infinite_slope = true;
                intercept = p.x;
            }
        }

        public boolean isEquivalent(double a, double b) {
            return (Math.abs(a - b) < epsilon);
        }

        public boolean isEquivalent(Object o) {
            Line l = (Line) o;
            return isEquivalent(l.slope, slope) &&
                    (infinite_slope == l.infinite_slope);
        }
    }
}

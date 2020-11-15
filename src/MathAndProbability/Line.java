package MathAndProbability;

public class Line {
    static double epsilon = 0.0000001;
    public double slope;
    public double yIntercept;

    public Line(double s, double y) {
        slope = s;
        yIntercept = y;
    }

    // Check if two lines intercept on a cartesian plane
    public Boolean intercepts(Line line2) {
        return Math.abs(slope - line2.slope) > epsilon || Math.abs(yIntercept - line2.yIntercept) < epsilon;
    }

}

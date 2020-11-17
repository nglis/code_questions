package MathAndProbability;

public class LineThroughSquares {

    class Line {
        int slope;
        int yIntercept;

        public Line(int s, int y) {
            slope = s;
            yIntercept = y;
        }
    }

    public Line infiniteLine(Square A, Square B) {
        // Assuming Square object has centerpoint (x,y)
        int x_1 = A.center_x;
        int y_1 = A.center_y;

        int x_2 = B.center_x;
        int y_2 = B.center_y;

        int m = (y_2 - y_1) / (x_2 - x_1);
        int intercept = y_1 - m * x_1;

        return new Line(m, intercept);
    }

}

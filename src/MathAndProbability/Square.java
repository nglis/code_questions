package MathAndProbability;

public class Square {

    class Point {
        double x;
        double y;

        public Point(double a, double b) {
            x = a;
            y = b;
        }
    }

    public Point middle() {
        return new Point((this.left + this.right) / 2.0, (this.top + this.bottom) / 2);
    }

    public Point extend(Point mid1, Point mid2, double size) {
        double xdir = mid1.x < mid2.x ? -1 : 1;
        double ydir = mid1.y < mid2.y ? -1 : 1;

        if (mid1.x == mid2.x) {
            return new Point(mid1.x, mid1.y + ydir * size / 2);
        }

        double slope = (mid1.y - mid2.y) / (mid1.x - mid2.x);
        double x1 = 0;
        double y1 = 0;

        if (Math.abs(slope) == 1) {
            x1 = mid1.x + xdir * size / 2.0;
            y1 = mid1.y + ydir * size / 2.0;
        } else if (Math.abs(slope) < 1) {
            x1 = mid1.x + xdir * size / 2.0;
            y1 = slope * (x1 - mid1.x) + mid1.y;
        } else {
            y1 = mid1.y + ydir * size / 2.0;
            x1 = (y1 - mid1.y) / slope + mid1.x;
        }

        return new Point(x1, y1);
    }

    public Line cut(Square other) {}

}

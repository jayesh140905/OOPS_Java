public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x) {
        this.x = x;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.getY(), 2));
    }
}
public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(7, 1);

        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");

        double distance = point1.distance(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);
    }
}

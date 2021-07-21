public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean containsPoint(Point p) {
    double distance = center.distanceTo(p);
    return distance <= radius;
    }
}

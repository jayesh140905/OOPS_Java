class Circle {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double circumference() {
        return 2 * Math.PI * this.radius;
    }

    public void display() {
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + this.area());
        System.out.println("Circumference: " + this.circumference());
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.display();

        Circle customCircle = new Circle(5.5);
        System.out.println("\nCustom Circle:");
        customCircle.display();
    }
}

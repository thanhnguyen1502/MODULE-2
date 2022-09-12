package ss5_static_access_modifier.execise.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}


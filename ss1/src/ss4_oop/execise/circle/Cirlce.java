package ss4_oop.execise.circle;

public class Cirlce {
     private double radius;
     private String color;

    public Cirlce() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "Cirlce{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

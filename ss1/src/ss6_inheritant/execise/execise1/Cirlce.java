package ss6_inheritant.execise.execise1;

public class Cirlce {
      double radius;
      String color = "black";

    public Cirlce() {
    }

    public Cirlce(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Hình tròn: " + '\t' +
                "đường kính = " + radius + '\t' +
                "màu : " + color + '\t'
                ;
    }
}

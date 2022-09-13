package ss6_inheritant.execise.execise1;

public class Cylinder extends Cirlce{
    private double col;

    public Cylinder() {
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public double getCol() {
        return col;
    }

    public void setCol(double col) {
        this.col = col;
    }

    @Override
    public String toString() {
        return "Hình trụ: " + '\t' +
                "chiều cao: " + col + '\t' +
                "đường kính = " + radius + '\t' +
                "màu : " + color + '\t'
                ;
    }
    public double getAreaCylinder(){
        return this.col*super.getArea();
    }
}

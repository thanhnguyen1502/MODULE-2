package ss4_oop.execise.circle;

import java.util.Scanner;

public class Cylinder extends Cirlce{
    private double col;

    public Cylinder() {
    }

    public double getCol() {
        return col;
    }

    public void setCol(double col) {
        this.col = col;
    }

    public double getAreaCylinder(){
       return Math.PI*this.getRadius()*getCol();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "col=" + col +
                '}';
    }

    public static void main(String[] args) {
        Cirlce cirlce = new Cirlce();
        Scanner sc = new Scanner(System.in);
        System.out.println("Diện tích hình tròn !");
        System.out.println("nhập đường kính là: ");
        double radius = Integer.parseInt(sc.nextLine());
        cirlce.setRadius(radius);
        System.out.println("diện tích hình tròn là: "+cirlce.getArea());
        Cylinder cylinder = new Cylinder();
        System.out.println("chiều cao của hình tròn là: ");
        double col = Integer.parseInt(sc.nextLine());
        cylinder.setCol(col);
        System.out.println("diện tích hình trụ là: "+(cylinder.getAreaCylinder()+cirlce.getArea()));
    }
}

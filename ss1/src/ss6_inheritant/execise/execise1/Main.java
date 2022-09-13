package ss6_inheritant.execise.execise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder cylinder = new Cylinder();
        Cirlce cirlce = new Cirlce();
        System.out.println("nhập đường kính là: ");
        double radius = sc.nextDouble();
        System.out.println("chiều cao của hình tròn là: ");
        double col = sc.nextDouble();
        cylinder.setCol(col);
        cylinder.setRadius(radius);
        cirlce.setRadius(radius);
        cylinder.setColor("Pink");
        System.out.printf("diện tích hình tròn là: " + cylinder.getArea() + '\n' + cirlce+ '\n' + '\n');
        System.out.println("diện tích hình trụ là: "+cylinder.getAreaCylinder()+ '\n' + cylinder);
    }
}

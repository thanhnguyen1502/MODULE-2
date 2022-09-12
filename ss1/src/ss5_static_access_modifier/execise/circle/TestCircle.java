package ss5_static_access_modifier.execise.circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều dài đường kính: ");
        double radius = Double.parseDouble(sc.nextLine());
        Circle circle1 = new Circle(2 );
        Circle circle2 = new Circle(radius);
        System.out.println(circle1.getRadius());
        System.out.printf("radius = " + circle1.getRadius() + '\t' + " Area: " + circle1.getArea());
        System.out.println(circle2.getRadius());
        System.out.printf("radius = " + circle2.getRadius() + '\t' + "Area 2: " + circle2.getArea());

    }
}

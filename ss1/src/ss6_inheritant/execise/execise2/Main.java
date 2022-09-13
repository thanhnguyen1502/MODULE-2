package ss6_inheritant.execise.execise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Enter y: ");
        int y = Integer.parseInt(sc.nextLine());
        System.out.println("Enter z: ");
        int z = Integer.parseInt(sc.nextLine());
        Point3D point3D = new Point3D(x,y,z);
        Point2D point2D = new Point2D(x,y);
        System.out.println("Point 2D : " + point2D);
        System.out.println("Point 3D : " + point3D);
    }
}

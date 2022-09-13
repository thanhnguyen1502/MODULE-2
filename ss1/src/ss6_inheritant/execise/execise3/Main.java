package ss6_inheritant.execise.execise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        float x = scanner.nextFloat();
        System.out.println("Enter y: ");
        float y = scanner.nextFloat();
        System.out.println("Enter xSpeed: ");
        float xSpeed = scanner.nextFloat();
         System.out.println("Enter ySpeed: ");
        float ySpeed = scanner.nextFloat();
        MoveablePoint moveablePoint = new MoveablePoint(x,y,xSpeed,ySpeed);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}

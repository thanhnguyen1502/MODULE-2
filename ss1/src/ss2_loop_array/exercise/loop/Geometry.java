package ss2_loop_array.exercise.loop;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Input your choice");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    for (int i = 5; i >=1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("không có ! ");
            }
        } while (choice != 4);
    }
}
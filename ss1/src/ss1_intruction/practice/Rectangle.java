package ss1_intruction.practice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int width;
        int height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài hình chữ nhật: ");
        height = sc.nextInt();
        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        width = sc.nextInt();
        System.out.println("diện tích hình chữ nhật là: " + width*height);
    }
}

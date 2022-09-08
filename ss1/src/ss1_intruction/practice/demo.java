package ss1_intruction.practice;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhập số nguyên dương: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n < 0) {
                System.out.println("mời nhập lại ! ");
            }
        }while (n < 0) ;
    }
}
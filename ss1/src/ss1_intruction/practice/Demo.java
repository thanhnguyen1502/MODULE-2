package ss1_intruction.practice;

import java.util.Scanner;

public class Demo {
    int year;
    String name;

    public Demo(int nam, String ten) {
         year = nam ;
         name = ten  ;
    }

    public static void main(String[] args) {
        Demo demo = new Demo(2021,"Thành");
        System.out.println(demo.year + " " + demo.name);

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
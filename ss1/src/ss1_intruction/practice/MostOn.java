package ss1_intruction.practice;

import java.util.Scanner;

public class MostOn {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất! ");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a: ");
        int a = sc.nextInt();
        System.out.println("nhập b: ");
        int b = sc.nextInt();
        if (a!=0){
            System.out.println("có nghiệm là: " + (-b/a));
        }else if (b!=0){
            System.out.println("phương trình vô nghiệm ! ");
        }else {
            System.out.println("phương trình có vô số nghiệm!");
        }
    }
}

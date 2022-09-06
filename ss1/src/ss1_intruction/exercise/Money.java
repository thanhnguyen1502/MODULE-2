package ss1_intruction.exercise;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        System.out.println("Chuyển đổi tiền tệ! ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập USD cần chuyển đổi: ");
        int usd = sc.nextInt();
        System.out.println("Giá trị VND là: " + usd*23000 + " đồng");
    }
}

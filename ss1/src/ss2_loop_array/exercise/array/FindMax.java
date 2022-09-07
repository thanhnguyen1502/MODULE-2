package ss2_loop_array.exercise.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cột: ");
        int col = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số hàng: ");
        int row = Integer.parseInt(scanner.nextLine());
        int[][] arrays = new int[col][row];
        System.out.println("nhập chuỗi !");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arrays[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (arrays[i][j] > max) {
                    max = arrays[i][j];
                }
            }
        }
        System.out.println(max + " là số lớn nhất! ");
    }
}

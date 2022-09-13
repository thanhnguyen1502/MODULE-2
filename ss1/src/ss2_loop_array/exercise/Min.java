package ss2_loop_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arrays = new int[size];
        System.out.println("nhập chuỗi " + size + " số");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arrays));
        int min = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i]<min){
                min = arrays[i];
            }
        }
        System.out.println(min + " là số nhỏ nhất! ");
    }
}

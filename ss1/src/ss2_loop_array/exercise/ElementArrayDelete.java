package ss2_loop_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ElementArrayDelete {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0};
        System.out.println("mảng của bạn là: " + Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử bạn muốn xoá: ");
        int delete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (delete==arr[i]){
                for (int j = i; j < arr.length-1; j++) {
                    arr[j]=arr[j+1];
                    arr[arr.length-1]=0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

package ss2_loop_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ElementArrayAdd {
    public static void main(String[] args) {
        int [] arrays = {10,4,6,7,8,0,0,0};
        System.out.println("phần tử trong mảng :" + Arrays.toString(arrays));
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số muốn thêm vào : ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vị trí cần thêm vào ! ");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = arrays.length - 1; i > index; i--) {
            arrays[i] = arrays[i - 1];
        }
        arrays[index] = value;
        System.out.println("Mảng sau khi thêm giá trị: " + value + " vào vị trí thứ: " + index
                + " là: " + Arrays.toString(arrays));
    }
}

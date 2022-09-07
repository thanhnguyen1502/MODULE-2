package ss2_loop_array.exercise.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args) {
        int [] arrays1 = new int[3];
        int [] arrays2 = new int[4];
        int [] arrays3 = new int[arrays1.length + arrays2.length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays1.length; i++) {
            System.out.println("Array 1: thứ " + (i+1));
            arrays1[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < arrays2.length; i++) {
            System.out.println("Array 2: thứ " + (i+1));
            arrays2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arrays1));
        System.out.println(Arrays.toString(arrays2));
        for (int i = 0; i < arrays1.length; i++) {
            arrays3[i] = arrays1[i];
        }
        for (int i = 0; i < arrays2.length; i++) {
            arrays3[arrays1.length + i] = arrays2[i];
        }
        System.out.println(Arrays.toString(arrays3));

    }
}

package ss14_sort_algorithm.exrcise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mang truoc khi sap xep" + Arrays.toString(array));
        System.out.println("------------------------------------------");
        insertSortMethod(array);
        System.out.println(Arrays.toString(array));

    }
    public static void insertSortMethod(int[] array){
        int x ;
        int position;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            position = i;
            System.out.println("lay gia tri" +" "+array[i]+ " "+"de so sanh ");
            while (position>0 && x<array[position-1]){
                array[position]=array[position-1];
                position--;
            }
            System.out.println("doi vi tri lan thu " +i + Arrays.toString(array));
            array[position]=x;
        }
    }
}

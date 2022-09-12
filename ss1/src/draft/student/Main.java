package draft.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student [] students = new Student[1000];
        int countStudents = 2;
        for (int i = 0; i < countStudents; i++) {
            System.out.println("nhập học sinh thứ " + (i+1));
            System.out.println("Tên: ");
            String name = scanner.nextLine();
            System.out.println("Tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Màu thích: ");
            String color = scanner.nextLine();
            System.out.println("giới tính: ");
            String sex = scanner.nextLine();
            students[i] = new Student(name,age,color,sex);
        }
        for (int i = 0; i < countStudents; i++) {
            System.out.println(students[i]);
        }
    }
}

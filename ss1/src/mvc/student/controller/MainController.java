package mvc.student.controller;

import java.util.Scanner;

public class MainController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println();
        String choice = "";
        do {
            System.out.println("-------CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN VÀ GIẢNG VIÊN–-------\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Học sinh\n" +
                    "2. Giảng viên\n" +
                    "3. Thoát\n" +
                    "Chọn chức năng:\n");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    StudentController.displayStudentMenu();
                    break;
                case "2":
                    TeacherController.displayTeacherMenu();
                    break;
                case "3":
                    System.out.println("Bạn đã thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn chưa có! Mời bạn chọn lại");
            }
        } while (!choice.equals("3"));
    }
}

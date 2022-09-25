package mvc.student.controller;

import mvc.student.service.ITeacherService;
import mvc.student.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    public static Scanner scanner = new Scanner(System.in);
    public static ITeacherService teacherService = new TeacherService();

    public static void displayTeacherMenu() {
        System.out.println();
        String choice = "";

        do {
            System.out.println("------Giảng viên------ \n" +
                    "1. Thêm mới \n" +
                    "2. Xoá \n" +
                    "3. Xem danh sách\n" +
                    "3. Tìm kiếm\n" +
                    "3. Sắp xếp\n" +
                    "4. Thoát\n");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    teacherService.add();
                    break;
                case "2":
                    teacherService.delete();
                    break;
                case "3":
                    teacherService.display();
                    break;
                case "4":
                    teacherService.search();
                    break;
                case "5":
                    teacherService.sortName();
                    break;
                case "6":
                    System.out.println("Bạn đã thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn chưa có! Mời bạn chọn lại");
            }
        } while (!choice.equals("4"));
    }
}

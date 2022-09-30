package mvc.student.controller;

import mvc.student.service.IStudentService;
import mvc.student.service.impl.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class StudentController {
    public static Scanner scanner = new Scanner(System.in);
    public static IStudentService studentService = new StudentService();

    public static void displayStudentMenu() throws IOException {
        System.out.println();
        int choice;

        do {
            System.out.println("------Học Sinh------ \n" +
                    "1. Thêm mới\n" +
                    "2. Xoá\n" +
                    "3. Xem danh sách\n" +
                    "4. Tìm kiếm\n" +
                    "5. Sắp xếp\n" +
                    "6. Thoát\n");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    studentService.add();
                    break;
                case 2:
                    studentService.delete();
                    break;
                case 3:
                    studentService.display();
                    break;
                case 4:
                    studentService.search();
                    break;
                case 5:
                    studentService.sortName();
                    break;
                case 6:
                    return;
//                    System.out.println("Bạn đã thoát khỏi chương trình");
                default:
                    System.out.println("Lựa chọn của bạn chưa có! Mời bạn chọn lại");
            }
        } while (true);
    }
}

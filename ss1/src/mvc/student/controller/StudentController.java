package mvc.student.controller;

import mvc.student.service.IStudentService;
import mvc.student.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    public static Scanner scanner = new Scanner(System.in);
    public static IStudentService studentService = new StudentService();
    public static void displayStudentMenu(){
        System.out.println();
        String choice = "";
        do {
            System.out.println("1. Thêm mới học sinh\n" +
                    "2. Xoá học sinh\n" +
                    "3. Xem danh sách học sinh\n" +
                    "4. Thoát\n");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    studentService.add();
                    break;
                case "2":
                    studentService.delete();
                    break;
                case "3":
                    studentService.display();
                    break;
                case "4":
                    System.out.println("Bạn đã thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn chưa có! Mời bạn chọn lại");
            }
        }while (!choice.equals("4"));
    }

}

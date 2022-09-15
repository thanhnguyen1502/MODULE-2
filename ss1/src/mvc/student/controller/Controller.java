package mvc.student.controller;

import mvc.student.service.IStudentService;
import mvc.student.service.ITeacherService;
import mvc.student.service.impl.StudentService;
import mvc.student.service.impl.TeacherService;

import java.util.Scanner;

public class Controller {
    public void displayMenu() {
        System.out.println("-------CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN –-------\n" +
                "Chọn chức năng theo số (để tiếp tục):\n" +
                "1. Thêm mới giảng viên hoặc học sinh\n" +
                "2. Xóa giảng viên hoặc học sinh\n" +
                "3. Xem danh sách giảng viên hoặc học sinh\n" +
                "4. Thoát\n" +
                "Chọn chức năng:\n");
        do {

            Scanner scanner = new Scanner(System.in);
            IStudentService studentService = new StudentService();
            ITeacherService teacherService = new TeacherService();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.printf("1. Học sinh" + '\n' + "2. Giảng viên " + '\n' + "Chọn chức năng:\n");

                    break;
                case "2":
                    System.out.printf("1. Học sinh" + '\n' + "2. Giảng viên " + '\n' + "Chọn chức năng:\n");
                    System.out.println("1 fgdgfd\n" +
                            "2 hdfgfdfg\n" +
                            "3 sgsg");
                    break;
                case "3":
                    do {
                        System.out.printf("1. Học sinh" + '\n' + "2. Giảng viên " + '\n' + "3. Trở lại MENU\n"+ "4. Thoát ra\n" + "Chọn chức năng:\n");
                        String choiceDisplay = scanner.nextLine();
                        switch (choiceDisplay) {
                            case "1":
                                studentService.display();
                                break;
                            case "2":
                                teacherService.display();
                                break;
                            case "3":
                                displayMenu();
                                return;
                            case "4":
                                System.exit(0);
                            default:
                                System.out.println("Mời nhập lại ! ");
                        }
                    } while (true);

                case "4":
                    System.exit(0);
                    return;
                default:
                    System.out.println("Mời nhập lại ! ");
            }
        } while (true);
    }
}

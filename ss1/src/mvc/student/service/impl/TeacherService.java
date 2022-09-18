package mvc.student.service.impl;

import mvc.student.model.Teacher;
import mvc.student.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();


    @Override
    public void add() {
        Teacher teacher = this.infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công !");
    }



    @Override
    public void delete() {
        System.out.println("nhập vào id giảng viên cần xóa: ");
        int idRemove = Integer.parseInt(sc.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getCode() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;

            }
        }
    }

    @Override
    public void display() {
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }

    public Teacher infoTeacher(){
        System.out.println("code ?");
        int code = Integer.parseInt(sc.nextLine());
        System.out.println("name ?");
        String name = sc.nextLine();
        System.out.println("date of birth ?");
        String birth = sc.nextLine();
        System.out.println("gender ?");
        String gender = sc.nextLine();
        System.out.println("Chuyên môn ?");
        String specialize = sc.nextLine();
        Teacher teacher = new Teacher(code,name,birth,gender,specialize);
        return teacher;
    }
}

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
            if (teacher.getCode().equals(idRemove)) {
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

    @Override
    public void search() {
        System.out.println("Tìm kiếm:\n" +
                "1. theo tên\n" +
                "2. theo mã");
        int choise = Integer.parseInt(sc.nextLine());
        switch (choise) {
            case 1:
                System.out.println("Nhập tên học sinh");
                String name = sc.nextLine();
                for (int i = 0; i < teacherList.size(); i++) {
                    if (teacherList.get(i).getName().contains(name)) {
                        System.out.println(teacherList.get(i));
                    }
                }
            case 2:
                System.out.println("Nhập mã học sinh");
                String code = sc.nextLine();
                for (int i = 0; i < teacherList.size(); i++) {
                    if (teacherList.get(i).getName().equals(code)) {
                        System.out.println(teacherList.get(i));
                        break;
                    }
                }
        }
    }

    @Override
    public void sortName() {
        for (int i = 0; i < teacherList.size() - 1; i++) {
            for (int j = teacherList.size() - 1; j > i; j--) {
                if (teacherList.get(j).compareTo(teacherList.get(j - 1)) < 0) {
                    Teacher temp = teacherList.get(j);
                    teacherList.set(j, teacherList.get(j - 1));
                    teacherList.set(j - 1, temp);
                }
            }
        }
    }

    public Teacher infoTeacher(){
        System.out.println("Enter code ?");
        String code = sc.nextLine();
        System.out.println("Enter name ?");
        String name = sc.nextLine();
        System.out.println("Enter date of birth ?");
        String birth = sc.nextLine();
        System.out.println("Enter gender ?");
        String gender = sc.nextLine();
        System.out.println("Enter specialize ?");
        String specialize = sc.nextLine();
        Teacher teacher = new Teacher(code,name,birth,gender,specialize);
        return teacher;
    }
}

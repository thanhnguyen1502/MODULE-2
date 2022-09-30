package mvc.student.service.impl;

import mvc.student.model.Teacher;
import mvc.student.service.ITeacherService;
import mvc.student.util.read_write.ReadFife;
import mvc.student.util.read_write.WriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    public static final String TEACHER_PATH = "ss1/src/mvc/student/data/teacher.scv";
    private static Scanner sc = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

//    static {
//        teacherList.add(new Teacher("1", "Quang","1/1/1992","Nam", "Giang vien"));
//        teacherList.add(new Teacher("1", "Hai","1/1/1992","Nam", "Tutor"));
//        teacherList.add(new Teacher("1", "Quang","1/1/1992","Nam", "Giang vien"));
//    }

    @Override
    public void add() throws IOException {
        teacherList = ReadFife.teacherReadFile(TEACHER_PATH);
//        teacherList = ReadFife
        Teacher teacher = this.infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công !");
        WriteFile.writeFileTeacher(TEACHER_PATH, teacherList);

    }


    @Override
    public void delete() throws IOException {
        teacherList = ReadFife.teacherReadFile(TEACHER_PATH);

        System.out.println("nhập vào id giảng viên cần xóa: ");
        String idRemove = sc.nextLine();
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
        WriteFile.writeFileTeacher(TEACHER_PATH, teacherList);

    }

    @Override
    public void display() throws IOException {
        teacherList = ReadFife.teacherReadFile(TEACHER_PATH);

        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        WriteFile.writeFileTeacher(TEACHER_PATH, teacherList);

    }

    @Override
    public void search() throws IOException {
        teacherList = ReadFife.teacherReadFile(TEACHER_PATH);

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
        WriteFile.writeFileTeacher(TEACHER_PATH, teacherList);

    }

    @Override
    public void sortName() throws IOException {
        teacherList = ReadFife.teacherReadFile(TEACHER_PATH);

        for (int i = 0; i < teacherList.size() - 1; i++) {
            for (int j = teacherList.size() - 1; j > i; j--) {
                if (teacherList.get(j).compareTo(teacherList.get(j - 1)) < 0) {
                    Teacher temp = teacherList.get(j);
                    teacherList.set(j, teacherList.get(j - 1));
                    teacherList.set(j - 1, temp);
                }
            }
        }
        WriteFile.writeFileTeacher(TEACHER_PATH, teacherList);

    }

    public Teacher infoTeacher() {
        String code;
        while (true) {
            try {
                System.out.println("Enter code ?: ");
                code = sc.nextLine();
                if (!code.matches("[0-9]{2}")) {
                    throw new NumberFormatException("bạn nhập không đúng rồi ☺ !");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Enter name ?");
        String name = sc.nextLine();
        System.out.println("Enter date of birth ?");
        String birth = sc.nextLine();
        System.out.println("Enter gender ?");
        String gender = sc.nextLine();
        System.out.println("Enter specialize ?");
        String specialize = sc.nextLine();
        Teacher teacher = new Teacher(code, name, birth, gender, specialize);
        return teacher;
    }
}

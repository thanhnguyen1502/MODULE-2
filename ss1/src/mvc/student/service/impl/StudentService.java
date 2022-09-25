package mvc.student.service.impl;

import mvc.student.model.Student;
import mvc.student.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    @Override
    public void add() {
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công !");
    }


    @Override
    public void delete() {

        System.out.println("nhập vào id học sinh cần xóa: ");
        int idRemove = Integer.parseInt(sc.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getCode().equals(idRemove)) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;

            }
        }
    }

    @Override
    public void display() {
        for (Student student : studentList) {
            System.out.println(student);
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
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).getName().contains(name)) {
                        System.out.println(studentList.get(i));
                    }
                }
            case 2:
                System.out.println("Nhập mã học sinh");
                String code = sc.nextLine();
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).getName().equals(code)) {
                        System.out.println(studentList.get(i));
                        break;
                    }
                }
        }
    }

    @Override
    public void sortName() {
        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = studentList.size() - 1; j > i; j--) {
                if (studentList.get(j).compareTo(studentList.get(j - 1)) < 0) {
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j - 1));
                    studentList.set(j - 1, temp);
                }
            }
        }
    }


    public Student infoStudent() {
        System.out.println("Enter code ?: ");
        String code = sc.nextLine();
        System.out.println("Enter name ?");
        String name = sc.nextLine();
        System.out.println("Enter date of birth ?");
        String birth = sc.nextLine();
        System.out.println("Enter gender ?");
        String gender = sc.nextLine();
        System.out.println("Enter classer ?");
        String classer = sc.nextLine();
        System.out.println("Enter score ?");
        double score = Double.parseDouble(sc.nextLine());
        Student student = new Student(code, name, birth, gender, classer, score);
        return student;
    }
}

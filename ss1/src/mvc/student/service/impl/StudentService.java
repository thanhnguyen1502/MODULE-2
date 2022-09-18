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
            if (student.getCode() == idRemove) {
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
    public void display(){
        for (Student student: studentList) {
            System.out.println(student);
        }
    }

    public Student infoStudent(){
        System.out.print("code ?");
        int code = Integer.parseInt(sc.nextLine());
        System.out.print("name ?");
        String name = sc.nextLine();
        System.out.print("date of birth ?");
        String birth = sc.nextLine();
        System.out.print("gender ?");
        String gender = sc.nextLine();
        System.out.print("classer ?");
        String classer = sc.nextLine();
        System.out.print("score ?");
        double score = sc.nextDouble();
        Student student = new Student(code,name,birth,gender,classer,score);
        return student;
    }
}

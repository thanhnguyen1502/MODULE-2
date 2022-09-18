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

    public Student infoStudent(){
        System.out.println("code ?");
        String code = sc.nextLine();
        System.out.println("name ?");
        String name = sc.nextLine();
        System.out.println("date of birth ?");
        String birth = sc.nextLine();
        System.out.println("gender ?");
        String gender = sc.nextLine();
        System.out.println("classer ?");
        String classer = sc.nextLine();
        System.out.println("score ?");
        double score = sc.nextDouble();
        Student student = new Student(code,name,birth,gender,classer,score);
        return student;
    }

    @Override
    public void delete() {
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        String code = sc.nextLine();
        boolean flagDelete = false;
        for(int i = 0 ; i< studentList.size(); i++) {
            if(studentList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = sc.nextLine();
                if(choice.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if(!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
    }

    @Override
    public void display(){
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
}

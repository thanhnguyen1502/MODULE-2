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
        Teacher teacher = this.infoStudent();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công !");
    }

    public Teacher infoStudent(){
        System.out.println("code ?");
        String code = sc.nextLine();
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

    @Override
    public void delete() {
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        int code = Integer.parseInt(sc.nextLine());
        boolean flagDelete = false;
        for(int i = 0 ; i< teacherList.size(); i++) {

            if(teacherList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = sc.nextLine();
                if(choice.equals("Y")) {
                    teacherList.remove(i);
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
    public void display() {
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }
}

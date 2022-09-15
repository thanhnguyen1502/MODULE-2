package mvc.student.service.impl;

import mvc.student.model.Student;
import mvc.student.service.IStudentService;

public class StudentService implements IStudentService {
    static Student[] students = new Student[1000];
    static int countStudents;
    static {
        students[0] = new Student(1,"Văn Thành", "15/02/1997", "Nam", "C0422G1", 7.5);
        students[1] = new Student(2,"Ngọc Lệ", "24/01/1997", "Nữ", "C0422G1", 7);
        students[2] = new Student(3,"Thị Ngân", "02/03/1998", "Nữ", "C0422G1", 8.5);
    countStudents = 3;
    }

    @Override
    public void add() {
        for (int i = 0; i <= countStudents; i++) {
            students[i] = countStudents[i];

        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void display(){
        for (int i = 0; i < countStudents; i++) {
            System.out.println(students[i]);
        }
        System.out.println();
    }
}

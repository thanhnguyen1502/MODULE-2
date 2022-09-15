package mvc.student.service.impl;

import mvc.student.model.Teacher;
import mvc.student.service.ITeacherService;

public class TeacherService implements ITeacherService {
    static Teacher [] teachers = new Teacher[1000];
    static int countTeacher;
    static {
        teachers[0] = new Teacher(1,"Ngọc Lệ", "24/01/1997", "Nữ", "Giáo viên mầm non");
        teachers[1] = new Teacher(1,"Ánh Dương", "10/03/1998", "Nữ", "Toán lớp 2");
        teachers[2] = new Teacher(1,"Thị Ngân", "03/02/1998", "Nữ", "Sinh lớp 5");
        countTeacher = 3;
    }
    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        for (int i = 0; i < countTeacher; i++) {
            System.out.println(teachers[i]);
        }
    }
}

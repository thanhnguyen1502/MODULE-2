package ss5_static_access_modifier.execise.student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Văn Thành");
        student.setClasses("C07");
        student.display();
        student.setName("Ngọc Lệ");
        student.setClasses("C07");
        student.display();
    }
}

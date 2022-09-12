package ss5_static_access_modifier.practice.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Văn Thành");
        Student s2 = new Student(222,"Ngọc Lệ");
        Student s3 = new Student(333,"Thị Ngân");
        s1.display();
        s2.display();
        s3.display();
    }
}

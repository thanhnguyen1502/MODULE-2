package ss5_static_access_modifier.practice.static_method;

public class Student {
    private int roll;
    private String name;
    private static String college = "ABC";

    public Student() {
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    static void change() {
        college = "CODE GYM";
    }

    void display() {
        System.out.println("Số báo danh: " + roll + '\t' + "Tên: " + name + '\t' + "Trung tâm: " + college);
    }
}

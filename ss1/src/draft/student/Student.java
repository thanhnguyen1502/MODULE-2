package draft.student;

public class Student {
    private String name;
    private int age;
    private String color;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String color, String sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }

    public void eat(){
        System.out.println("Hi " + name + ", có thể ăn !");
    }
    public void drink(){
        System.out.println("Hi " + name + ", có thể uống !");
    }
    public void run(){
        System.out.println("Hi " + name + ", có thể chạy !");
    }

    @Override
    public String toString() {
        return "Học sinh {" +
                " Tên: " + name + '\t' +
                " Tuổi: " + age + '\t' +
                " Màu yêu thích: " + color + '\t' +
                " Giới tính: " + sex + '\t' +
                '}';
    }
}

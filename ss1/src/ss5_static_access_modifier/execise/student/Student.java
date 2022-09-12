package ss5_static_access_modifier.execise.student;

public class Student {
    private String name;
    private String classes;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    void display(){
        System.out.printf("Name: " + name + '\t'+ "Class: " + classes +'\n');
    }
}
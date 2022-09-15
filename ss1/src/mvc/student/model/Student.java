package mvc.student.model;

public class Student {
    private int id;
    private String name;
    private String DateOfBirth;
    private String sex ;
    private String classer;
    private double score;

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, String sex, String classer, double score) {
        this.id = id;
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.sex = sex;
        this.classer = classer;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClasser() {
        return classer;
    }

    public void setClasser(String classer) {
        this.classer = classer;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Học Viên:   " + "Mã số: " + id + "\t"+
                "Tên: " + name + "\t"+
                "Ngày sinh: " + DateOfBirth + "\t"+
                "Giới tính: " + sex + "\t"+
                "Lớp: " + classer + "\t"+
                "Điểm: " + score
                ;
    }
}

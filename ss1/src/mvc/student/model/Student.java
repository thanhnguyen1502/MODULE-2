package mvc.student.model;

public class Student extends Person{
    private String classer;
    private double score;

    public Student(int code, String name, String dateOfBirth, String sex, String classer, double score) {
        super(code, name, dateOfBirth, sex);
        this.classer = classer;
        this.score = score;
    }

    public Student(String classer, double score) {
        this.classer = classer;
        this.score = score;
    }

    public Student() {
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
        return  super.toString() +
                "Lớp: " + classer + "\t"+
                "Điểm: " + score
                ;
    }
}

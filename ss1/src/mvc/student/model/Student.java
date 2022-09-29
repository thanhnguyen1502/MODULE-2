package mvc.student.model;

public class Student extends Person implements Comparable<Student> {
    private String classer;
    private double score;

    public Student() {
    }

    public Student(String code, String name, String dateOfBirth, String sex, String classer, double score) {
        super(code, name, dateOfBirth, sex);
        this.classer = classer;
        this.score = score;
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
        return super.toString() +
                "," + classer + "," + score
//                "Lớp: " + classer + "\t"+
//                "Điểm: " + score
                ;
    }

    @Override
    public int compareTo(Student o) {
        int compareName = this.getName().compareTo(o.getName());
        if (compareName > 0) {
            return 1;
        }
        if (compareName == 0) {
            return this.getCode().compareTo(o.getCode());
        }
        return -1;
    }
}

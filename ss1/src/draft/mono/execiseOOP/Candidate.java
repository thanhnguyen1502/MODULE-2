package draft.mono.execiseOOP;

public class Candidate {
    private int roll;
    private String name;
    private String birthDate;
    private int maths;
    private int literary;
    private int english;
    static String school = "THCS NVT";
    static int countCandidate = 2;

    public Candidate() {
    }

    public Candidate(int roll, String name, String birthDate, int maths, int literary, int english) {
        this.roll = roll;
        this.name = name;
        this.birthDate = birthDate;
        this.maths = maths;
        this.literary = literary;
        this.english = english;
        countCandidate++;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        if (maths <= 10 || maths >= 0) {
            this.maths = maths;
        }
    }

    public int getLiterary() {
        return literary;
    }

    public void setLiterary(int literary) {
        this.literary = literary;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int mediumScore() {
        return (maths + english + literary);
    }

    void display() {
        if (mediumScore() > 15) {
            System.out.println("Serial: " + roll + '\t' + "name: " + name + '\t' + "birth: " + birthDate + '\t' + "Score: " + mediumScore() + '\t' + school);
        }
    }
}

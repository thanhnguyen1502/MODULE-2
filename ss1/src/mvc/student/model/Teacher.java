package mvc.student.model;

public class Teacher extends Person implements Comparable<Teacher>{
    private String specialize;

    public Teacher(String code, String name, String dateOfBirth, String sex, String specialize) {
        super(code, name, dateOfBirth, sex);
        this.specialize = specialize;
    }

    public Teacher() {
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return  super.toString() + ","+specialize;
//                "Chuyên môn: " + specialize;
    }

    @Override
    public int compareTo(Teacher o) {
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

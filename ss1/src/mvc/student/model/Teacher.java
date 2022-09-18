package mvc.student.model;

public class Teacher extends Person{
    private String specialize;

    public Teacher(String code, String name, String dateOfBirth, String sex, String specialize) {
        super(code, name, dateOfBirth, sex);
        this.specialize = specialize;
    }

    public Teacher(String specialize) {
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
        return super.toString()+
                "Chuyên môn: " + specialize;
    }
}

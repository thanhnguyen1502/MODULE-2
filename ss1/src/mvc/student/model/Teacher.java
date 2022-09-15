package mvc.student.model;

public class Teacher {
    private int id;
    private String name;
    private String DateOfBirth;
    private String sex ;
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String dateOfBirth, String sex, String specialize) {
        this.id = id;
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.sex = sex;
        this.specialize = specialize;
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

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Giảng Viên:   " +
                "Mã số: " + id + "\t"+
                "Tên: " + name + "\t"+
                "Ngày sinh: " + DateOfBirth + "\t"+
                "Giới tính: " + sex + "\t"+
                "Chuyên môn: " + specialize;
    }
}

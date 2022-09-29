package mvc.student.model;

public class Person {
    private String code;
    private String name;
    private String DateOfBirth;
    private String sex ;

    public Person(String code, String name, String dateOfBirth, String sex) {
        this.code = code;
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public Person() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    @Override
    public String toString() {
        return
                this.code+","+this.getName()+","+DateOfBirth+","+sex
//                "Học Viên:   " + "Mã số: " + code + "\t"+
//                "Tên: " + name + "\t"+
//                "Ngày sinh: " + DateOfBirth + "\t"+
//                "Giới tính: " + sex + "\t"
                ;
    }
}

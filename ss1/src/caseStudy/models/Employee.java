package caseStudy.models;

public class Employee extends Person {
    private String lever;
    private String location;
    private String salary;

    public Employee(int code, String name, String birthDay, String gender, String cardID, String numberPhone, String email, String lever, String location, String salary) {
        super(code, name, birthDay, gender, cardID, numberPhone, email);
        this.lever = lever;
        this.location = location;
        this.salary = salary;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Nhân viên: " + super.toString() + '\t' +
                "Cấp bậc: " + lever + '\t' +
                "Vị trí: " + location + '\t' +
                "Lương: " + salary;
    }
}

package caseStudy.models;

public class Person {
    private String code;
    private String name;
    private String birthDay;
    private String Gender;
    private String cardID;
    private String numberPhone;
    private String email;

    public Person(String code, String name, String birthDay, String gender, String cardID, String numberPhone, String email) {
        this.code = code;
        this.name = name;
        this.birthDay = birthDay;
        Gender = gender;
        this.cardID = cardID;
        this.numberPhone = numberPhone;
        this.email = email;
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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "Mã: " + code + '\t' +
                "Họ và tên: " + name + '\t' +
                "Ngày sinh: " + birthDay + '\t' +
                "Giới tính: " + Gender + '\t' +
                "số CMND: " + cardID + '\t' +
                "Số điện thoại: " + numberPhone+ '\t' +
                "Email: " + email;
    }
}

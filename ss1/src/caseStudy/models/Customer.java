package caseStudy.models;

public class Customer extends Person{
    private String typeOfGuest;
    private String address;

    public Customer(String code, String name, String birthDay, String gender, String cardID, String numberPhone, String email, String typeOfGuest, String address) {
        super(code, name, birthDay, gender, cardID, numberPhone, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer() {
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Khách hàng: " + super.toString() + '\t' +
                "Kiểu khách hàng: " + typeOfGuest + '\t' +
                "Địa chỉ: " + address;
    }
}

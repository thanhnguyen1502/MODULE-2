package caseStudy.models;

public class Resort {
    private String nameService;
    private double useArea;
    private int Cost;
    private int fullPerson;
    private String rentalType;

    public Resort(String nameService, double useArea, int cost, int fullPerson, String rentalType) {
        this.nameService = nameService;
        this.useArea = useArea;
        Cost = cost;
        this.fullPerson = fullPerson;
        this.rentalType = rentalType;
    }

    public Resort() {
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    public int getFullPerson() {
        return fullPerson;
    }

    public void setFullPerson(int fullPerson) {
        this.fullPerson = fullPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return  "Tên dịch vụ: " + nameService + '\t' +
                "Diện tích sử dụng: " + useArea  + '\t' +
                "Chi phí thuê: " + Cost  + '\t' +
                "Số lượng người tối đa: " + fullPerson  + '\t' +
                "Kiểu thuê: " + rentalType;
    }
}

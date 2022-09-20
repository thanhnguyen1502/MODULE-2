package caseStudy.models;

public class Villa extends Resort{
    private String roomStandard;
    private double poolArea;
    private int roomNumber;

    public Villa(String nameService, double area, int cost, int fullPerson, String rentalType, String roomStandard, double poolArea, int roomNumber) {
        super(nameService, area, cost, fullPerson, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.roomNumber = roomNumber;
    }

    public Villa(String roomStandard, double poolArea, int roomNumber) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.roomNumber = roomNumber;
    }

    public Villa() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Villa: " +super.toString() + '\t' +
                "Tiểu chuẩn phòng: " + roomStandard  + '\t' +
                "Diện tích hồ bơi: " + poolArea + '\t' +
                "Số phòng: " + roomNumber;
    }
}

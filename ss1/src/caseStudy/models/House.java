package caseStudy.models;

public class House extends Resort{
    private String roomStandard;
    private int numberOfFloors;

    public House(String nameService, double useArea, int cost, int fullPerson, String rentalType, String roomStandard, int numberOfFloors) {
        super(nameService, useArea, cost, fullPerson, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House: " + super.toString() + '\t'+
                "Tiêu chuẩn phòng: " + roomStandard  + '\t'+
                "Số tầng: " + numberOfFloors;
    }
}

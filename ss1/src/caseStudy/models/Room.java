package caseStudy.models;

public class Room extends Resort{
    private String freeService;

    public Room(String nameService, double useArea, int cost, int fullPerson, String rentalType, String attachmentService) {
        super(nameService, useArea, cost, fullPerson, rentalType);
        this.freeService = attachmentService;
    }

    public Room(String attachmentService) {
        this.freeService = attachmentService;
    }

    public Room() {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room: " + super.toString() +'\t' +
                "dịch vụ miễn phí đi kèm: " + freeService;
    }
}

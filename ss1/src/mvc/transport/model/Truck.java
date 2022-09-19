package mvc.transport.model;

public class Truck extends Transport {
    private String tonnage;

    public Truck(String tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(String idCar, String manufacturer, String yearCar, String owner, String tonnage) {
        super(idCar, manufacturer, yearCar, owner);
        this.tonnage = tonnage;
    }

    public Truck() {
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Xe tải: " + super.toString()+'\t' +
                "Trọng tải: " + tonnage;
    }
}

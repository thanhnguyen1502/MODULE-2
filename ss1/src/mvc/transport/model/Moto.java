package mvc.transport.model;

public class Moto extends Transport {
    private String wattage;

    public Moto(String wattage) {
        this.wattage = wattage;
    }

    public Moto(String idCar, String manufacturer, String yearCar, String owner, String wattage) {
        super(idCar, manufacturer, yearCar, owner);
        this.wattage = wattage;
    }

    public Moto() {
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Xe mô tô" +super.toString()+ '\t' +
                "Công suất: " + wattage;
    }
}

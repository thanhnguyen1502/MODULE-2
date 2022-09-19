package mvc.transport.model;

public class Oto extends Transport {
    private int noSeat;
    private String carType;

    public Oto(int noSeat, String carType) {
        this.noSeat = noSeat;
        this.carType = carType;
    }

    public Oto(String idCar, String manufacturer, String yearCar, String owner, int noSeat, String carType) {
        super(idCar, manufacturer, yearCar, owner);
        this.noSeat = noSeat;
        this.carType = carType;
    }

    public Oto() {
    }

    public int getNoSeat() {
        return noSeat;
    }

    public void setNoSeat(int noSeat) {
        this.noSeat = noSeat;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Xe ô tô: " + super.toString() +
                "Chổ ngồi: " + noSeat + '\t' +
                "Kiểu xe: " + carType;
    }
}

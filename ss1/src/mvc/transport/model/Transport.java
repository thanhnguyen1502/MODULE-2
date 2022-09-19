package mvc.transport.model;

public class Transport {
    private String idCar;
    private String manufacturer;
    private String yearCar;
    private String owner;

    public Transport() {
    }

    public Transport(String idCar, String manufacturer, String yearCar, String owner) {
        this.idCar = idCar;
        this.manufacturer = manufacturer;
        this.yearCar = yearCar;
        owner = owner;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYearCar() {
        return yearCar;
    }

    public void setYearCar(String yearCar) {
        this.yearCar = yearCar;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        owner = owner;
    }

    @Override
    public String toString() {
        return
                "Biển số xe: " + idCar + '\t' +
                "Tên hãng sản xuất: " + manufacturer + '\t' +
                "Năm sản xuất: " + yearCar + '\t' +
                "Chủ sở hữu: " + owner + '\t';
    }
}

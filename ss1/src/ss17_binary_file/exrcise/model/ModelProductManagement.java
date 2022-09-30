package ss17_binary_file.exrcise.model;

public class ModelProductManagement {
    private String codeProduct;
    private String nameProduct;
    private String management;
    private int price;

    public ModelProductManagement(String codeProduct, String nameProduct, String management, int price) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.management = management;
        this.price = price;
    }

    public ModelProductManagement() {
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManagement() {
        return management;
    }

    public void setManagement(String management) {
        this.management = management;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ModelProductManagement{" +
                "codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", management='" + management + '\'' +
                ", price=" + price +
                '}';
    }
}

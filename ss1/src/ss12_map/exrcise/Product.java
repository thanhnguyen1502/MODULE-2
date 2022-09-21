package ss12_map.exrcise;

public class Product implements Comparable<Product>{
    private int productId;
    private String productName;
    private int price;

    public Product() {
    }

    public Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sản phẩm: " + '\t'+
                "Mã sản phẩm: " + productId + '\t'+
                "Tên sản phẩm: " + productName + '\t'+
                "Giá sản phẩm: " + price;
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice() - o.getPrice();
    }
}

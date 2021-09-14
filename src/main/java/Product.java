
public class Product {

    private Double price;
    private String color;
    private String size;
    private String name;

    public Product(Double price, String color, String size, String name) {
        this.price = price;
        this.color = color;
        this.size = size;
        this.name = name;
    }

    public Product() {
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

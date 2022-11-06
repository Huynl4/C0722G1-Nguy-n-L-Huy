package Model;

public class Product {
    private int id;
    private String name;
    private String origin;
    private String color;
    private String price;

    public Product() {
    }

    public Product(int id, String name, String origin, String color, String price) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

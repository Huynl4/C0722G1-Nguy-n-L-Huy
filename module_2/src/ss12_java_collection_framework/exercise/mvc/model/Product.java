package ss12_java_collection_framework.exercise.mvc.model;

public class Product {
    private String id;
    private String name; //tên sản phẩm
    private Double price; //giá sản phẩm
    private String source; // nguồn gốc sản phẩm
    private String color; // màu sắc sản phẩm

    public Product() {
    }

    public Product(String id, String name, Double price, String source, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.source = source;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", source='" + source + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

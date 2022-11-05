package Model;

public class Product {
    private int id;
    private String name;
    private String origin;
    private String color;
    private String cost;

    public Product() {
    }

    public Product(int id, String name, String origin, String color, String cost) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.color = color;
        this.cost = cost;
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}

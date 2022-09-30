package ss17_io_binary_file_serialization.exercise.exercise1.model;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer code;
    private String name;
    private String source;
    private Double price;

    public Product() {
    }

    public Product(Integer code, String name, String source, Double price) {
        this.code = code;
        this.name = name;
        this.source = source;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", this.getCode(), this.getName(), this.getSource(), this.getPrice());
    }
}

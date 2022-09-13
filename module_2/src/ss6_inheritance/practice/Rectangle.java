package ss6_inheritance.practice;

public class Rectangle extends Shape {
    private double width;
    private double lenght;

    public Rectangle() {
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return width * lenght;
    }

    public double getPerimeter() {
        return (width + lenght) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width"
                + getWidth()
                + getLenght()
                + "which is a subclass of"
                + super.toString();
    }
}

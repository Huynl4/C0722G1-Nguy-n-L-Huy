package ss7_abstractc_class_interface.exercise.Interface_colorable;

import ss7_abstractc_class_interface.exercise.Interface_resizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
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
        return  "Hinh chu nhat sau khi hoan thanh: " + "width" + "\t"
                + getWidth()
             +" length" +"\t"  + getLenght() + "\t"
               + "Dien tich : " + getArea() +"\t"
                + "Chu vi :" + getPerimeter();
    }

    @Override
    public void resize(double percent) {
        this.width = this.getWidth() + this.getWidth() * (percent / 100);
        this.lenght = this.getLenght() + this.getLenght() * (percent / 100);

    }
}

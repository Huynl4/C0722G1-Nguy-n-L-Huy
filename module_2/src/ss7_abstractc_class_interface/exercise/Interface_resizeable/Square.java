package ss7_abstractc_class_interface.exercise.Interface_resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }


    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return + getSide() + "\t" + "Diện tích hình vuông:" + getArea() + "\t" + "Chu vi: " + getPerimeter();


    }


}



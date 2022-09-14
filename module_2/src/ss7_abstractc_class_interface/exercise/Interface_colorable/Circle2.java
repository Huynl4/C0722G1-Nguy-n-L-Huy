package ss7_abstractc_class_interface.exercise.Interface_colorable;

import ss7_abstractc_class_interface.exercise.Interface_resizeable.Resizeable;

public class Circle2 extends Shape implements Colorable {
    private double radius = 1.0;

    public Circle2() {
    }

    public Circle2(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius"
                + getRadius() + "Diện tích: " + getArea();


    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}

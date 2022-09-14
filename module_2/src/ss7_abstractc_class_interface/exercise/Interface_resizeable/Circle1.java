package ss7_abstractc_class_interface.exercise.Interface_resizeable;

public class Circle1 extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle1() {
    }

    public Circle1(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle1(double  radius) {
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
                + getRadius();


    }

    @Override
    public void resize(double percent) {
        this.radius = this.getRadius()+this.getRadius()*(percent/100);
    }
}

package ss6_inheritance.exercise.circleandcylinder;

public class Cylinder extends Circle {
    private int heigh;

    public Cylinder(int heigh) {
        super(2, "red");
        this.heigh = heigh;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public double getCapacity() {
        return Math.PI * heigh * (this.getRadius() * 2);
    }
}

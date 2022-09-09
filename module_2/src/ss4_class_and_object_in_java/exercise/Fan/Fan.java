package ss4_class_and_object_in_java.exercise.Fan;

public class Fan {
    //khai báo hằng
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    @Override
    public String toString() {
//        return "Fan{}";
        if (on) {
            return "Giá trị lớn nhất " + speed + ", màu " + color + "," + radius + ",fan is on";
        } else {
            return "Giá trị trung bình " + speed + ", màu " + color + "," + radius + ",fan is off";
        }
    }
}

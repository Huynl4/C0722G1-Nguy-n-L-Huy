package ss7_abstractc_class_interface.exercise.Interface_resizeable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2, 4);
        System.out.println(rectangle);
        rectangle = new Rectangle("red", false, 2, 4);
        System.out.println(rectangle);
    }
}

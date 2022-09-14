package ss7_abstractc_class_interface.exercise.Interface_resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        System.out.println("Truoc khi tang");
        Circle1 circle1 = new Circle1();
        System.out.println(circle1.getRadius());
        System.out.println("sau khi tang");
        circle1.resize(30);
        System.out.println(circle1);

        System.out.println("độ dài hình chữ nhật trước khi tăng: ");
        Rectangle rectangle = new Rectangle(1, 2);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLenght());
        System.out.println("Hình chữ nhật sau khi tăng: ");
        rectangle.resize(10);
        System.out.println(rectangle);

        System.out.println("Độ dài hình vuông ban đầu: ");
        Square square = new Square(3);
        System.out.println(square.getSide());
        System.out.println("Hình vuông sau khi tăng: ");
        square.resize(30);
        System.out.println(square);
    }
}
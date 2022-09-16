package ss7_abstractc_class_interface.exercise.Interface_resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
//        System.out.println("Truoc khi tang");
//        Circle1 circle1 = new Circle1();
//        System.out.println(circle1.getRadius());
//        System.out.println("sau khi tang");
//        circle1.resize(30);
//        System.out.println(circle1);
//
//        System.out.println("độ dài hình chữ nhật trước khi tăng: ");
//        Rectangle rectangle = new Rectangle(1, 2);
//        System.out.println(rectangle.getWidth());
//        System.out.println(rectangle.getLenght());
//        System.out.println("Hình chữ nhật sau khi tăng: ");
//        rectangle.resize(10);
//        System.out.println(rectangle);
//
//        System.out.println("Độ dài hình vuông ban đầu: ");
//        Square square = new Square(3);
//        System.out.println(square.getSide());
//        System.out.println("Hình vuông sau khi tăng: ");
//        square.resize(30);
//        System.out.println(square);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle1(1);//ép kiểu ngậm định
        shapes[1] = new Rectangle(1, 2);
        shapes[2] = new Square(2);
        double random;
        for (Shape shape2 : shapes) {
            random = Math.random() * 100;
            System.out.println(shape2);
            if (shape2 instanceof Rectangle) {
                ((Rectangle) shape2).resize(random); //ép kiểu tường minh

            } else if (shape2 instanceof Circle1) {
                ((Circle1) shape2).resize(random);
            } else {
                ((Square) shape2).resize(random);
            }
            System.out.println(shape2);


        }
    }
}
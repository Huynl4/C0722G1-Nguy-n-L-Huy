package ss7_abstractc_class_interface.exercise.Interface_resizeable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("red",true,5.3);
        System.out.println(square);
    }
}

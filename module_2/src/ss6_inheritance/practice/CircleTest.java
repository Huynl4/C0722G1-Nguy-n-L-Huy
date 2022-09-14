package ss6_inheritance.practice;

public class CircleTest {
    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        System.out.println(circle);
        circle= new Circle1(3.5);
        System.out.println(circle);
        circle = new Circle1("red",true,3);
        System.out.println(circle);
    }
}

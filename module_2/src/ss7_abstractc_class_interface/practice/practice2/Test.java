package ss7_abstractc_class_interface.practice.practice2;

import ss6_inheritance.exercise.circleandcylinder.Circle;
import ss6_inheritance.practice.Circle1;

import java.util.Arrays;
import java.util.Comparator;

class CircleComparatorTest {
    public static void main(String[] args) {
        Circle1[] circles = new Circle1[3];
        circles[0] = new Circle1(3.6);
        circles[1] = new Circle1();
        circles[2] = new Circle1("indigo", false, 3.5);

        System.out.println("Pre-sorted:");
        for (Circle1 circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle1 circle : circles) {
            System.out.println(circle);
        }
    }
}

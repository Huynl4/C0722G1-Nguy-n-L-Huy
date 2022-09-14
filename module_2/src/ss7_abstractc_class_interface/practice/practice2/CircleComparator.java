package ss7_abstractc_class_interface.practice.practice2;

import ss6_inheritance.practice.Circle1;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle1> {

    @Override
    public int compare(Circle1 c1, Circle1 c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
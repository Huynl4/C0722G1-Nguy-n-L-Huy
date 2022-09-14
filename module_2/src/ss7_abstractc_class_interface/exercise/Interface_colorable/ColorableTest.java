package ss7_abstractc_class_interface.exercise.Interface_colorable;

import ss6_inheritance.exercise.circleandcylinder.Circle;
import ss7_abstractc_class_interface.exercise.Interface_resizeable.Circle1;

import java.util.Arrays;

public class ColorableTest {
    public static void main(String[] args) {

        Shape[] shapesList = new Shape[5];
        shapesList[0] = new Square("red", true, 1);
        shapesList[1] = new Square("blue", true, 2);
        shapesList[2] = new Square("yellow", false, 3);
        shapesList[3] = new Rectangle(2,3);
        shapesList[4] = new Circle2(2);

        for (int i = 0; i < shapesList.length; i++) {
            System.out.println(shapesList[i].getArea());
            if (shapesList[i] instanceof Square) {
                ((Colorable)shapesList[i]).howToColor();
            }
        }
        System.out.println();
    }
}

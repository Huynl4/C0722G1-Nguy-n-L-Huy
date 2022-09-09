package ss4_class_and_object_in_java.exercise.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //khởi tạo khai báo đối tượng
        QuadraticEquation quadraticEquation = new QuadraticEquation();

        System.out.print("Input a: ");
        double a = Double.parseDouble(scanner.nextLine());
        quadraticEquation.setA(a);
        System.out.print("Input b: ");
        double b = Double.parseDouble(scanner.nextLine());
        quadraticEquation.setB(b);
        System.out.print("Input c: ");
        double c = Double.parseDouble(scanner.nextLine());
        quadraticEquation.setC(c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The equation has two roots");
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one roots");
            System.out.println(quadraticEquation.getRoot1());
        } else {
            System.out.println("the equation has no root");
        }
    }
}

package ss15_exception_handling_and_debug.exercise.exercise1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegalTriangeException {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        int z;


        while (true) {
            try {
                System.out.println("Nhập cạnh x: ");
                x = Integer.parseInt(scanner.nextLine());
                check(x);
                break;
            } catch (IllegalTriangeException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            try {
                System.out.println("Nhập cạnh y: ");
                y = Integer.parseInt(scanner.nextLine());
                check(y);
                break;

            } catch (IllegalTriangeException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            try {
                System.out.println("Nhập cạnh z: ");
                z = Integer.parseInt(scanner.nextLine());
                check(z);
                check(x, y, z);
                break;
            } catch (IllegalTriangeException e) {
                e.printStackTrace();
            }
        }
    }

    public static void check(int side) throws IllegalTriangeException {
        if (side <= 0) {
            throw new IllegalTriangeException("Nhập sai, nhập lại!");
        }
    }

    public static void check(int x, int y, int z) throws IllegalTriangeException {
        if (((x + y) < z) || ((x + z) < y) || ((z + y) < x)) {
            throw new IllegalTriangeException("Nhập sai nữa, nhập lại đi..");
        }
    }
}

package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;
//tính tổng các số ở 1 cột xác định
public class SumNumbersInASpecifiedColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hàng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cột: ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử mảng con: " + i + "vị tri" + (j));
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.print("Nhập cột cần tính tổng: ");
        int col1 = Integer.parseInt(scanner.nextLine());
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i][col1];
        }
        System.out.println("tổng của cột: " + total);
    }
}

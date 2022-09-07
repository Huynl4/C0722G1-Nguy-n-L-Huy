package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;
//xóa phần tử trong mảng
public class RemoveElementFromArray {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int A[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(A));
        System.out.println("nhập số nguyên x: ");
        int x = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (A[i] != x) {
                A[c] = A[i];
                c++;
            }
        }
        n = c;
        System.out.println("mảng sau khi xóa phần tử x: " + x);
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}


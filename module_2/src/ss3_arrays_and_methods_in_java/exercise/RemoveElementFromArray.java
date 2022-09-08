package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

//xóa phần tử trong mảng
public class RemoveElementFromArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        size = Integer.parseInt(scanner.nextLine());

        // nhập các giá trị cho phần tử của mảng.
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ: " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        // in ra mảng đã nhập
//        System.out.print("mảng đã nhập: ");
        System.out.println(Arrays.toString(array));
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + " ");
//        }

        // nhap vao phan tu can xoa
        System.out.print("\nNhập vào phần tử cần xóa: ");
        int N = Integer.parseInt(scanner.nextLine());

        for (int j = 0; j < array.length; j++) {
            if (N == array[j]) {
                for (int k = j; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


//
//
//
//
//
//        int n;
//        int c;
//        int i;
//        Scanner scanner = new Scanner(System.in);
//        do {
//        System.out.println("Nhập vào số phần tử của mảng: ");
//        n = scanner.nextInt();
//        } while (n <= 0);
//        int arr[] = new int[n];
//        System.out.println("Nhập các phần tử cho mảng: ");
//        for (i = 0; i < n; i++) {
//        System.out.println("Nhập phần tử thứ " + i + ": ");
//        arr[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("nhập số nguyên x: ");
//        int x = scanner.nextInt();
//        for (c = 0, i = 0; i < n; i++) {
//        if (arr[i] != x) {
//        arr[c] = arr[i];
//        c++;
//        }
//        }
//        n = c;
//        System.out.println("mảng sau khi xóa phần tử x: " + x);
//        for (i = 0; i < n; i++) {
////            System.out.print(arr[i] + "\t");
//        }
//        System.out.println(Arrays.toString(arr));
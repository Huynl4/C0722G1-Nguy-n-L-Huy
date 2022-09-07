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
        int arr[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhập số nguyên x: ");
        int x = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (arr[i] != x) {
                arr[c] = arr[i];
                c++;
            }
        }
        n = c;
        System.out.println("mảng sau khi xóa phần tử x: " + x);
        for (i = 0; i < n; i++) {
//            System.out.print(arr[i] + "\t");
        }
        System.out.println(Arrays.toString(arr));
    }
}


//
//        Scanner scanner = new Scanner(System.in);
//        int[] array;
//        int n;
//        do {
//        System.out.println("nhập vào số lượng phần tử của mảng: ");
//        n = Integer.parseInt(scanner.nextLine());
//        if (n < 0) {
//        System.out.println("bạn nhập sai , xin hãy nhập lại");
//        }
//        } while (n < 0);
//        array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//        System.out.println("nhập phần tử thứ: " + i);
//        array[i] = Integer.parseInt(scanner.nextLine());
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.print("nhập số cần kiểm tra: ");
//        int number = scanner.nextInt();
//        for (int i = 0; i < array.length; i++) {
//        if (array[i] == (number)) {
//        for (int j = i; j < array.length - 1; j++) {
//        array[j] = array[j + 1];
//        }
//        System.out.println(Arrays.toString(array));
//        }


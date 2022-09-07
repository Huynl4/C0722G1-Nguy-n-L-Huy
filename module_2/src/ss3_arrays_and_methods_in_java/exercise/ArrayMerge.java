package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

//gộp mảng
public class ArrayMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr = new int[10];
        System.out.println("Nhập các phần tử mảng 1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            int num = Integer.parseInt(scanner.nextLine());
            arr1[i] = num;
            arr[i] = arr1[i];
        }
        System.out.println("Mảng 1: " + Arrays.toString(arr1));
        System.out.println("Nhập các phần tử mảng 2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            int num1 = Integer.parseInt(scanner.nextLine());
            arr2[i] = num1;
            arr[i] = arr2[i];
        }
        System.out.println("Mảng 2: " + Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[i + arr1.length] = arr2[i];
        }
        System.out.println("Mảng gộp: ");
        System.out.println(Arrays.toString(arr));
    }
}

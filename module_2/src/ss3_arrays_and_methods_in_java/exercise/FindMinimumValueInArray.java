package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;
//tìm giá trị nhỏ nhất trong mảng
public class FindMinimumValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cảu mảng: ");
        int num = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[num];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < num; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng ban đầu: ");
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất: " + min);
    }
}

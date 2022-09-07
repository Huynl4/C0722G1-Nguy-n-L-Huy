package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

//thêm phần tử vào mảng
public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int num = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[num];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < num; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập số chèn vào: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();
        if (index < 0 || index > arr.length - 1) {
            System.out.println("Không thể chèn phần tử vào mảng: ");
        } else {
//            int i = arr.length - 1;
//            while (i > index) {
//                arr[i] = arr[i - 1];
//                i--;
//            }
//            arr[index] = num1;

            for (int j = arr.length - 1; j > index; j--) {
                arr[j] = arr[j - 1];
            }
            arr[index] = num1;
        }
        System.out.println("kết quả sau khi chèn: ");
        System.out.println(Arrays.toString(arr));
    }
}



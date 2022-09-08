package ss3_arrays_and_methods_in_java.exercise;

import java.util.Scanner;

public class CountOccurrencesOfACharacterInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        int count = 0;
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        string = scanner.nextLine();
        System.out.println("Nhập kí tự cần kiểm tra: ");
        char character = scanner.nextLine().charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự: " + count);
    }
}

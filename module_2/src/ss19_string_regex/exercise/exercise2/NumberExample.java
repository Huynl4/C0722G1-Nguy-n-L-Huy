package ss19_string_regex.exercise.exercise2;

import java.util.Scanner;

public class NumberExample {
    public static void main(String[] args) {
        System.out.println("Nhập vào số điện thoại: ");
        Scanner scanner = new Scanner(System.in);
        String number = String.valueOf(scanner.nextLine());
        if (number.matches("^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]")) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("không hợp lệ.");
        }
    }
}

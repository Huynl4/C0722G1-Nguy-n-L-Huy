package ss1_introduction_to_java.exercise;

import java.util.Scanner;
//chuyển đổi tiền tệ
public class MoneyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double convert = usd * 23000;
        System.out.println("số tiền sau khi đổi: " + convert);
    }
}

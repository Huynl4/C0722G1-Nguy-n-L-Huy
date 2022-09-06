package ss2_loop_in_java.practice;

import java.util.Scanner;

public class LoanInterestApp {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gởi: ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng gởi: ");
        month = input.nextInt();
        System.out.println("Nhập lãi xuất: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Tổng lãi nhận được: " + totalInterest);
    }
}

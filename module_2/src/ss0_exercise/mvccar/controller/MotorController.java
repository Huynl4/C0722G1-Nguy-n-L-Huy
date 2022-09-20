package ss0_exercise.mvccar.controller;

import ss0_exercise.mvccar.service.impl_motor.IMotorService;
import ss0_exercise.mvccar.service.impl_motor.MotorService;

import java.util.Scanner;

public class MotorController {
    private static IMotorService iMotorService = new MotorService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuMotor() {
        while (true) {
            System.out.println("Quản lý phương tiện giao thông- xe máy");
            System.out.println("1. Thêm xe máy.");
            System.out.println("2. Tìm kiếm xe máy.");
            System.out.println("3. Hiển thị xe máy.");
            System.out.println("4. Xóa xe máy");
            System.out.println("5. Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iMotorService.addMotor();
                    break;
                case 2:
                    iMotorService.findMotor();
                    break;
                case 3:
                    iMotorService.displayMotor();
                    break;
                case 4:
                    iMotorService.removeMotor();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Bạn nhập sai! Vui lòng nhập lại.");
            }
        }
    }
}

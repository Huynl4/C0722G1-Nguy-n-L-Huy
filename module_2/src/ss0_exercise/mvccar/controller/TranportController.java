package ss0_exercise.mvccar.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class TranportController {
    private static Scanner scanner = new Scanner(System.in);

    public static void MenuTranport() {
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("1. xe tải.");
            System.out.println("2. xe con.");
            System.out.println("3. xe máy.");
            System.out.println("4. Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    TruckController.MenuTruck();
                    break;
                case 2:
                    CarController.MeNuCar();
                    break;
                case 3:
                    MotorController.MenuMotor();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập sai quá nhiều, Nhập lại nào....");
            }
        }
    }
}

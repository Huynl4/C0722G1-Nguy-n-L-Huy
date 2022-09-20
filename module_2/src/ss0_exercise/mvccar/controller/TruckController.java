package ss0_exercise.mvccar.controller;

import ss0_exercise.mvccar.service.impl_truck.ITruckService;
import ss0_exercise.mvccar.service.impl_truck.TruckService;

import java.util.Scanner;

public class TruckController {
    private static ITruckService iTruckService = new TruckService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuTruck() {
        while (true) {
            System.out.println("Quản lý phương tiện giao thông- Xe tải.");
            System.out.println("1. Thêm xe tải.");
            System.out.println("2. Tìm kiếm xe tải.");
            System.out.println("3. Hiển thị xe tải.");
            System.out.println("4. Xóa xe tải.");
            System.out.println("5. Thoát .");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTruckService.addTruck();
                    break;
                case 2:
                    iTruckService.findTruck();
                    break;
                case 3:
                    iTruckService.displayTruck();
                    break;
                case 4:
                    iTruckService.removeTruck();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Bạn đã nhập sai!Vui lòng nhập đúng!");
            }
        }
    }
}

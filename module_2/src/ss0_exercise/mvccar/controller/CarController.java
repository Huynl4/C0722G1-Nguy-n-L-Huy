package ss0_exercise.mvccar.controller;

import ss0_exercise.mvccar.service.impl_car.CarService;
import ss0_exercise.mvccar.service.impl_car.ICarService;
import ss0_exercise.mvccar.service.impl_truck.ITruckService;
import ss0_exercise.mvccar.service.impl_truck.TruckService;

import java.util.Scanner;

public class CarController {
    private static ICarService iCarService = new CarService();
    private static Scanner scanner = new Scanner(System.in);

    public static void MeNuCar() {
        while (true) {
            System.out.println("Quản lý phương tiện giao thông- xe oto");
            System.out.println("1. Thêm oto.");
            System.out.println("2. Tìm kiếm oto.");
            System.out.println("3. Hiển thị oto.");
            System.out.println("4. Xóa oto.");
            System.out.println("5. Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                   iCarService.addCar();
                    break;
                case 2:
                    iCarService.findCar();
                    break;
                case 3:
                    iCarService.displayCar();
                    break;
                case 4:
                    iCarService.removeCar();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Bạn nhập sai! Vui lòng nhập lại.");
            }
        }
    }
}

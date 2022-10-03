package case_study.controller;

import case_study.service.impl_facility.FacilityService;
import case_study.service.impl_facility.IFacilityService;

import java.util.Scanner;

public class FacilityManagementController {
    private static Scanner scanner = new Scanner(System.in);
    private static IFacilityService iFacilityService = new FacilityService();

    public static void menuFacilityManagement() {
        while (true) {
            System.out.println("Welcome to Facility Management- Quản lí cơ sở");
            System.out.println("1. Display list facility- Hiển thị danh sách cơ sỏ");
            System.out.println("2. Add new facility- Thêm mới cơ sở");
            System.out.println("3. Display list facility maintenance- Hiển thị danh sách bảo trì cơ sở");
            System.out.println("4. Return main menu- Quay lại menu chính");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iFacilityService.displayFacility();
                    break;
                case 2:
                    iFacilityService.addFacility();
                    break;
                case 3:
                    iFacilityService.displayFacilityMaintenance();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Không có lựa chọn này, please nhập lại");
            }
        }
    }
}

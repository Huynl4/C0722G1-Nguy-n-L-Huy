package case_study.controller;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuFurama() throws Exception {
        while (true) {
            System.out.println("Chào mừng đến với khu nghĩ dưỡng FURAMA, mời bạn nhập lựa chọn: ");
            System.out.println("1. Employee Management-Quản lý nhân viên");
            System.out.println("2. Customer Management-Quản lý khách hàng");
            System.out.println("3. Facility Management-Quản lý cơ sở vật chất");
            System.out.println("4. Booking Management-Quản lý đặt phòng");
            System.out.println("5. Promotion Management-Quản lý khuyến mãi");
            System.out.println("6. Exit-Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    EmployyeeManagementController.menuEmployeeManagement();
                    break;
                case 2:
                    CustomerManagementController.menuCustomerManagement();
                    break;
                case 3:
                    FacilityManagementController.menuFacilityManagement();
                    break;
                case 4:
                    BookingManagementController.menuBookingManagement();
                    break;
                case 5:
                    PromotionManagementController.menuPromotionManagement();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này, vui lòng nhập lại.Please!!");
            }
        }
    }
}

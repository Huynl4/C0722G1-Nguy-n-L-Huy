package case_study.controller;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuFurama() throws IOException {
        while (true) {
            System.out.println("Chào mừng đến với khu nghĩ dưỡng FURAMA, mời bạn nhập lựa chọn: ");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
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

package case_study.controller;

import case_study.service.impl_promotion.IPromotionService;
import case_study.service.impl_promotion.PromotionService;

import java.util.Scanner;

public class PromotionManagementController {
    private static Scanner scanner = new Scanner(System.in);
    private static IPromotionService iPromotionService = new PromotionService();

    public static void menuPromotionManagement() {
        while (true) {
            System.out.println("Welcome to Promotion- Quản lý khuyến mãi");
            System.out.println("1. Display list customer use service- Hiển thị danh sách khách hàng sử dụng dịch vụ ");
            System.out.println("2. Display list customer get voucher- Hiển thị danh sách khách hàng nhận được voucher");
            System.out.println("3. Return main menu- Quay lại menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iPromotionService.displayCustomerService();
                    break;
                case 2:
                    iPromotionService.displayCustomerVoucher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Không có lựa chọn này, please nhập lại");
            }
        }
    }
}

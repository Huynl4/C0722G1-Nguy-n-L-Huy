package case_study.controller;

import case_study.service.impl_customer.CustomerService;
import case_study.service.impl_customer.ICustomerService;

import java.io.IOException;
import java.util.Scanner;

public class CustomerManagementController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICustomerService iCustomerService = new CustomerService();

    public static void menuCustomerManagement() throws IOException {
        while (true) {
            System.out.println("Welcome to Customer Management- Quản lí khách hàng");
            System.out.println("1. Display lis customer- Hiển thị danh sách khách hàng");
            System.out.println("2. Add new customer- Thêm mới khách hàng");
            System.out.println("3. Edit customer- Chỉnh sửa khách hàng");
            System.out.println("4. Return main menu- Quay lại menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iCustomerService.displayCustomer();
                    break;
                case 2:
                    iCustomerService.addCustomer();
                    break;
                case 3:
                    iCustomerService.editCustomer();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Không có lựa chọn này, please nhập lại!");
            }
        }
    }
}

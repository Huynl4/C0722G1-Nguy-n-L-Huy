package case_study.controller;

import case_study.service.impl_employee.EmployeeService;
import case_study.service.impl_employee.IEmployeeService;

import java.io.IOException;
import java.util.Scanner;

public class EmployyeeManagementController {
    private static Scanner scanner = new Scanner(System.in);
      private static IEmployeeService iEmployeeService =new EmployeeService();

    public static void menuEmployeeManagement() throws IOException {
        while (true) {
            System.out.println("Welcome to Employee Mangament- Quản lí nhân viên: ");
            System.out.println("1. Display list employees- Hiển thị danh sách nhân viên");
            System.out.println("2. Add new employee- Thêm mới nhân viên");
            System.out.println("3. Edit employee- CHỉnh sửa nhân viên");
            System.out.println("4. Return main menu- Quay lại menu chính");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iEmployeeService.displayEmployee();
                    break;
                case 2:
                    iEmployeeService.addEmployee();
                    break;
                case 3:
                    iEmployeeService.editEmployee();
                    break;
                case 4:
                   return;
                default:
                    System.out.println("Không có lựa chọn này, please nhập lại!");
            }
        }
    }
}

package case_study.controller;

import case_study.service.impl_booking.BookingService;
import case_study.service.impl_booking.IBookingService;

import java.util.Scanner;

public class BookingManagementController {
    private static Scanner scanner = new Scanner(System.in);
    private static IBookingService iBookingService = new BookingService();

    public static void menuBookingManagement() {
        while (true) {
            System.out.println("Welcome to Booking Management- Quản lí đặt phòng");
            System.out.println("1. Add new booking- Thêm mới phòng");
            System.out.println("2. Display list constracts- Hiển thị danh sách đặt phòng");
            System.out.println("3. Create new constracts- Tạo ra hợp đồng mới");
            System.out.println("4. Display list constracts- Hiển thị danh sách hợp đồng");
            System.out.println("5. Edit constracts- Chỉnh sửa hợp đồng");
            System.out.println("6. Return main menu- Quay lại menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iBookingService.addBooking();
                    break;
                case 2:
                    iBookingService.displayBooking();
                    break;
                case 3:
                    iBookingService.createConstract();
                    break;
                case 4:
                    iBookingService.displayConstract();
                    break;
                case 5:
                    iBookingService.editConstract();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Không có lựa chọn này, please nhập lại!");
            }
        }
    }
}

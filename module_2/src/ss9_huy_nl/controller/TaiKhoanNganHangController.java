package ss9_huy_nl.controller;

import java.io.IOException;
import java.util.Scanner;

public class TaiKhoanNganHangController {
    private static Scanner scanner = new Scanner(System.in);

    public static void danhSachTaiKhoanNganHang() throws IOException {
        while (true) {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG--");
            System.out.println("--Vui lòng chọn chức năng:--");
            System.out.println("1. Tài Khoản Tiết Kiệm ");
            System.out.println("2. Tài KHoản Thanh Toán");
            System.out.println("3. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    TaiKhoanTietKiemController.danhSachTaiKhoanTietKiem();
                    break;
                case 2:
                    TaiKhoanThanhToanController.danhSachTaiKhoanThanhToan();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Nhập sai lựa chọn, nhập lại..");
            }
        }
    }
}

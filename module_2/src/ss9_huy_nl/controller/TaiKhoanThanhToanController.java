package ss9_huy_nl.controller;

import ss9_huy_nl.service.ITaiKhoanThanhToanService;
import ss9_huy_nl.service.TaiKhoanThanhToanService;

import java.util.Scanner;

public class TaiKhoanThanhToanController {
    static ITaiKhoanThanhToanService taiKhoanThanhToanService = new TaiKhoanThanhToanService();
    private static Scanner scanner = new Scanner(System.in);

    public static void danhSachTaiKhoanThanhToan() {
        while (true) {
            System.out.println("Quản Lý tài Khoản Thanh Toán");
            System.out.println("Chọn chức năng theo số");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các tài khoản ngân hàng thanh toán");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    taiKhoanThanhToanService.themTaiKhoanThanhToan();
                    break;
                case 2:
                    taiKhoanThanhToanService.xoaTaiKhoanThanhToan();
                    break;
                case 3:
                    taiKhoanThanhToanService.hienThiTaiKhoanThanhToan();
                    break;
                case 4:
                    taiKhoanThanhToanService.timKiemTaiKhoanThanhToan();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Nhập sai lựa chọn, mời nhập lại");
            }
        }
    }
}

package ss9_huy_nl.controller;

import ss16_io_text_file.exercise.exercise3.service.impl_student.IStudentService;
import ss16_io_text_file.exercise.exercise3.service.impl_student.StudentService;
import ss9_huy_nl.service.ITaiKhoanTietKiemService;
import ss9_huy_nl.service.TaiKhoanTietKiemService;

import java.io.IOException;
import java.util.Scanner;

public class TaiKhoanTietKiemController {
    static ITaiKhoanTietKiemService taiKhoanTietKiemService = new TaiKhoanTietKiemService();
    private static Scanner scanner = new Scanner(System.in);

    public static void danhSachTaiKhoanTietKiem() throws IOException {

        while (true) {
            System.out.println("Quản Lý tài Khoản Tiết Kiệm");
            System.out.println("Chọn chức năng theo số:");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các tài khoản ngân hàng tiết kiệm");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    taiKhoanTietKiemService.themTaiKhoanTietKiem();
                    break;
                case 2:
                    taiKhoanTietKiemService.xoaTaiKhoanTietKiem();
                    break;
                case 3:
                    taiKhoanTietKiemService.hienThiTaiKhoanTietKiem();
                    break;
                case 4:
                    taiKhoanTietKiemService.timKiemTaiKhoanTietKiem();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập sai, hay nhập lại..");

            }
        }
    }
}

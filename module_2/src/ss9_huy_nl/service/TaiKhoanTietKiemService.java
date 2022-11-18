package ss9_huy_nl.service;

import ss16_io_text_file.exercise.exercise3.model.Teacher;
import ss9_huy_nl.model.TaiKhoanTietKiem;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemService implements ITaiKhoanTietKiemService {
    static Scanner scanner = new Scanner(System.in);
    static List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();

    @Override
    public void themTaiKhoanTietKiem() throws IOException {
        taiKhoanTietKiemList = readTaiKhoanTietKiem();
        TaiKhoanTietKiem taiKhoanTietKiem = this.thongTinTaiKhoanTietKiem();
        taiKhoanTietKiemList.add(taiKhoanTietKiem);
        System.out.println("thêm mới thành công");
        writeTaiKhoanTietKiem();
    }

    @Override
    public void xoaTaiKhoanTietKiem() throws IOException {
        taiKhoanTietKiemList = readTaiKhoanTietKiem();
        System.out.println("Nhập mã tài khoản ngân hàng cần xóa");
        String maTaiKhoan = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < taiKhoanTietKiemList.size(); i++) {
            if (taiKhoanTietKiemList.get(i).getMaTaiKhoan().equals(maTaiKhoan)) {
                System.out.println("Bạn muốn xóa mã ngân hàng này không ? Nhập Y: yes, N: no ");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    taiKhoanTietKiemList.remove(i);
                    System.out.println("Xóa thành công!");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy mã ngân hàng cần xóa!");
        }
        writeTaiKhoanTietKiem();
    }

    @Override
    public void hienThiTaiKhoanTietKiem() {
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
            System.out.println(taiKhoanTietKiem);
        }
    }

    @Override
    public void timKiemTaiKhoanTietKiem() throws IOException {
        taiKhoanTietKiemList = readTaiKhoanTietKiem();
        System.out.println("Nhập mã ngân hàng muốn tìm kiếm");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
            if (taiKhoanTietKiem.getMaTaiKhoan().contains(str)) {
                System.out.println(taiKhoanTietKiem);
            }
        }
    }

    public TaiKhoanTietKiem thongTinTaiKhoanTietKiem() {
        System.out.println("Mời nhập ID tài khoản");
        int idTaiKhoan = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập mã tài khoản");
        String maTaiKhoan = scanner.nextLine();
        System.out.println("Mời nhập tên chủ tài khoản");
        String tenChuTaiKhoan = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản");
        LocalDate ngayTaoTaiKhoan = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhập số tiền gởi tiết kiệm");
        int soTienGoiTietKiem = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày gởi tiết kiệm");
        LocalDate ngayGoiTietKiem = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhập lãi xuất");
        int laiXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kì hạn");
        int kiHan = Integer.parseInt(scanner.nextLine());
        return new TaiKhoanTietKiem(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan, soTienGoiTietKiem, ngayGoiTietKiem, laiXuat, kiHan);

    }

    private List<TaiKhoanTietKiem> readTaiKhoanTietKiem() throws IOException {
        File file = new File("src\\ss9_huy_nl\\data\\bank_accounts.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
        String[] info;
        TaiKhoanTietKiem taiKhoanTietKiem;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            taiKhoanTietKiem = new TaiKhoanTietKiem(Integer.parseInt(info[0]), info[1], info[2], LocalDate.parse(info[3], DateTimeFormatter.ofPattern("dd/MM/yyyy")), Integer.parseInt(info[4]), LocalDate.parse(info[5], DateTimeFormatter.ofPattern("dd/MM/yyyy")), Integer.parseInt(info[6]), Integer.parseInt(info[7]));
            taiKhoanTietKiemList.add(taiKhoanTietKiem);
        }
        bufferedReader.close();
        return taiKhoanTietKiemList;
    }

    public void writeTaiKhoanTietKiem() throws IOException {
        File file1 = new File("src\\ss9_huy_nl\\data\\bank_accounts.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
        for (TaiKhoanTietKiem t : taiKhoanTietKiemList) {
            bufferedWriter.write(t.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}

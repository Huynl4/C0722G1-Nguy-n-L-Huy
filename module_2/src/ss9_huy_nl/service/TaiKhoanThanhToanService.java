package ss9_huy_nl.service;

import ss9_huy_nl.model.TaiKhoanThanhToan;
import ss9_huy_nl.model.TaiKhoanTietKiem;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanService  implements  ITaiKhoanThanhToanService{
    static Scanner scanner = new Scanner(System.in);
    static List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
    @Override
    public void themTaiKhoanThanhToan() {

    }

    @Override
    public void xoaTaiKhoanThanhToan() {

    }

    @Override
    public void hienThiTaiKhoanThanhToan() {

    }

    @Override
    public void timKiemTaiKhoanThanhToan() {

    }
//    private List<TaiKhoanThanhToan> readTaiKhoanThanhToan() throws IOException {
//        File file = new File("src\\ss9_huy_nl\\data\\bank_accounts.csv");
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line;
//        List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
//        String[] info;
//        TaiKhoanThanhToan taiKhoanThanhToan;
//        while ((line = bufferedReader.readLine()) != null) {
//            info = line.split(",");
//            taiKhoanThanhToan = new TaiKhoanThanhToan(Integer.parseInt(info[0]),Integer.parseInt(info[1]),);
//            taiKhoanThanhToanList.add(taiKhoanThanhToan);
//        }
//        bufferedReader.close();
//        return taiKhoanThanhToanList;
//    }
//
//    public void writeTaiKhoanThanhToan() throws IOException {
//        File file1 = new File("src\\ss9_huy_nl\\data\\bank_accounts.csv");
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
//        for (TaiKhoanThanhToan t : taiKhoanThanhToanList) {
//            bufferedWriter.write(t.getInfo());
//            bufferedWriter.newLine();
//        }
//        bufferedWriter.close();
//    }
}

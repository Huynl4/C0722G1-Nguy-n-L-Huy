package ss9_huy_nl.service;

import java.io.IOException;

public interface ITaiKhoanTietKiemService  {
    void themTaiKhoanTietKiem() throws IOException;

    void xoaTaiKhoanTietKiem() throws IOException;

    void hienThiTaiKhoanTietKiem();

    void timKiemTaiKhoanTietKiem() throws IOException;
}

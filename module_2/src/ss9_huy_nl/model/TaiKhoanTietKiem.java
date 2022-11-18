package ss9_huy_nl.model;

import java.time.LocalDate;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
    private int soTienGoiTietKiem;
    private LocalDate ngayGoiTietKiem;
    private int laiXuat;
    private int kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(int soTienGoiTietKiem, LocalDate ngayGoiTietKiem, int laiXuat, int kiHan) {
        this.soTienGoiTietKiem = soTienGoiTietKiem;
        this.ngayGoiTietKiem = ngayGoiTietKiem;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public TaiKhoanTietKiem(int idTaiKhoan, String maTaiKhoan, String tenChuTaiKhoan, LocalDate ngayTaoTaiKhoan, int soTienGoiTietKiem, LocalDate ngayGoiTietKiem, int laiXuat, int kiHan) {

    }

    public int getSoTienGoiTietKiem() {
        return soTienGoiTietKiem;
    }

    public void setSoTienGoiTietKiem(int soTienGoiTietKiem) {
        this.soTienGoiTietKiem = soTienGoiTietKiem;
    }

    public LocalDate getNgayGoiTietKiem() {
        return ngayGoiTietKiem;
    }

    public void setNgayGoiTietKiem(LocalDate ngayGoiTietKiem) {
        this.ngayGoiTietKiem = ngayGoiTietKiem;
    }

    public int getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(int laiXuat) {
        this.laiXuat = laiXuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" +
                "soTienGoiTietKiem=" + soTienGoiTietKiem +
                ", ngayGoiTietKiem=" + ngayGoiTietKiem +
                ", laiXuat=" + laiXuat +
                ", kiHan=" + kiHan + super.toString() +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", this.getIdTaiKhoan(), this.getMaTaiKhoan(), this.getTenChutaiKhoan(), this.getNgayTaoTaiKhoan(), this.getSoTienGoiTietKiem(), this.getNgayGoiTietKiem(), this.getLaiXuat(), this.getKiHan());
    }

}

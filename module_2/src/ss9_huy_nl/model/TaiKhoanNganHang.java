package ss9_huy_nl.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class TaiKhoanNganHang {
    private int idTaiKhoan;
    private String maTaiKhoan;
    private String tenChutaiKhoan;
    private LocalDate ngayTaoTaiKhoan;

    public TaiKhoanNganHang() {
    }

    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenChutaiKhoan() {
        return tenChutaiKhoan;
    }

    public void setTenChutaiKhoan(String tenChutaiKhoan) {
        this.tenChutaiKhoan = tenChutaiKhoan;
    }

    public LocalDate getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(LocalDate ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoanNganHang{" +
                "idTaiKhoan=" + idTaiKhoan +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", tenChutaiKhoan='" + tenChutaiKhoan + '\'' +
               ", ngayTaoTaiKhoan=" + ngayTaoTaiKhoan.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                '}';
    }

    public abstract String getInfo();

}

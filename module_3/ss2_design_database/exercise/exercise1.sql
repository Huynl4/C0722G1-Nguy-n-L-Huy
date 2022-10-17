CREATE DATABASE tranfer_erd_to_relationship;
USE tranfer_erd_to_relationship;
CREATE TABLE phieu_xuat (
    so_phieu_xuat INT PRIMARY KEY AUTO_INCREMENT,
    ngay_xuat DATETIME
);
CREATE TABLE vat_tu (
    ma_vat_tu VARCHAR(20) PRIMARY KEY,
    ten_vat_tu VARCHAR(20)
);
CREATE TABLE phieu_nhap (
    so_phieu_nhap INT PRIMARY KEY AUTO_INCREMENT,
    ngay_nhap DATETIME
);
CREATE TABLE nha_cung_cap (
    ma_nha_cung_cap VARCHAR(20) PRIMARY KEY,
    ten_nha_cung_cap VARCHAR(20),
    dia_chi VARCHAR(20),
    so_dien_thoai VARCHAR(20)
);
CREATE TABLE don_dat_hang (
    so_don_hang VARCHAR(20) PRIMARY KEY,
    ngay_dat_hang DATETIME,
    ma_nha_cung_cap VARCHAR(20),
    FOREIGN KEY(ma_nha_cung_cap) REFERENCES nha_cung_cap(ma_nha_cung_cap)
);
CREATE TABLE chi_tiet_phieu_xuat (
    so_phieu_xuat INT,
    ma_vat_tu VARCHAR(20),
    don_gia_xuat VARCHAR(20),
    so_luong_xuat INT,
    PRIMARY KEY (so_phieu_xuat , ma_vat_tu),
    FOREIGN KEY (so_phieu_xuat) REFERENCES phieu_xuat (so_phieu_xuat),
    FOREIGN KEY (ma_vat_tu) REFERENCES vat_tu (ma_vat_tu)
);

CREATE TABLE chi_tiet_phieu_nhap (
    don_gia_nhap INT,
    so_luong_nhap INT,
    ma_vat_tu VARCHAR(20),
    so_phieu_nhap INT,
    PRIMARY KEY (ma_vat_tu , so_phieu_nhap),
    FOREIGN KEY (ma_vat_tu) REFERENCES vat_tu (ma_vat_tu),
    FOREIGN KEY (so_phieu_nhap)
        REFERENCES phieu_nhap (so_phieu_nhap)
);

CREATE TABLE chi_tiet_don_dat_hang (
    ma_vat_tu VARCHAR(20),
    so_don_hang VARCHAR(20),
    PRIMARY KEY (ma_vat_tu , so_don_hang),
    FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu),
    FOREIGN KEY (so_don_hang)
        REFERENCES don_dat_hang (so_don_hang)
);

CREATE TABLE so_dien_thoai (
    so_dien_thoai VARCHAR(20),
    ma_nha_cung_cap VARCHAR(20),
    FOREIGN KEY (ma_nha_cung_cap)
        REFERENCES nha_cung_cap (ma_nha_cung_cap)
);
						
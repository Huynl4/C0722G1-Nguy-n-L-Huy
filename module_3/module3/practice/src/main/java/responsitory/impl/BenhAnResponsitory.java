package responsitory.impl;

import model.BenhAn;
import responsitory.BaseResponsitory;
import responsitory.IBenhAnResponsitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhAnResponsitory implements IBenhAnResponsitory {
    private final String SELECT_ALL_BENH_AN = "select * from benh_an;";

    @Override
    public List<BenhAn> showList() {
        Connection connection = BaseResponsitory.getConnect();
        List<BenhAn> benhAnList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_BENH_AN);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maBenhAn = rs.getString("ma_benh_an");
                String maBenhNhan = rs.getString("ma_benh_nhan");
                String tenBenhNhan = rs.getString("ten_benh_nhan");
                String ngayNhapVien = rs.getString("ngay_nhap_vien");
                String ngayRaVien = rs.getString("ngay_ra_vien");
                String liDoNhapVien = rs.getString("li_do_nhap_vien");
                BenhAn benhAn = new BenhAn(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, liDoNhapVien);
                benhAnList.add(benhAn);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return benhAnList;
    }
}

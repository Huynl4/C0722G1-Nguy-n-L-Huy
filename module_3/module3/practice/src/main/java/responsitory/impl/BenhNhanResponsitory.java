package responsitory.impl;

import model.BenhNhan;
import responsitory.BaseResponsitory;
import responsitory.IBenhNhanResponsitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanResponsitory implements IBenhNhanResponsitory {
    private final String SELECT_ALL_BENH_NHAN = "SELECT * FROM benh_nhan;";

    @Override
    public List<BenhNhan> showList() {
        Connection connection = BaseResponsitory.getConnect();
        List<BenhNhan> benhNhanList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_BENH_NHAN);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maBenhNhan = rs.getString("ma_benh_nhan");
                String tenBenhNhan = rs.getString("ten_benh_nhan");
                BenhNhan benhNhan = new BenhNhan(maBenhNhan, tenBenhNhan);
                benhNhanList.add(benhNhan);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return benhNhanList;
    }
}

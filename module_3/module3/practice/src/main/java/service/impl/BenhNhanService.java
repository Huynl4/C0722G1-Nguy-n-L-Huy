package service.impl;

import model.BenhNhan;
import responsitory.IBenhNhanResponsitory;
import responsitory.impl.BenhNhanResponsitory;
import service.IBenhNhanService;

import java.util.List;

public class BenhNhanService implements IBenhNhanService {
    private IBenhNhanResponsitory benhNhanResponsitory = new BenhNhanResponsitory();

    @Override
    public List<BenhNhan> showList() {
        return benhNhanResponsitory.showList();
    }
}

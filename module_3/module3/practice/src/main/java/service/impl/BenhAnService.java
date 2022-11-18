package service.impl;

import model.BenhAn;
import responsitory.IBenhAnResponsitory;
import responsitory.impl.BenhAnResponsitory;
import service.IBenhAnService;

import java.util.List;

public class BenhAnService implements IBenhAnService {
    private IBenhAnResponsitory benhAnResponsitory = new BenhAnResponsitory();

    @Override
    public List<BenhAn> showList() {
        return benhAnResponsitory.showList();
    }
}

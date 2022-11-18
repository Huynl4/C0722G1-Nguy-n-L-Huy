package service.impl;

import model.CustomerType;
import responsitory.ICustomerTypeResponsitory;
import responsitory.impl.CustomerTypeResponsitory;
import service.ICustomerTypeService;

import java.util.List;

public class CustomerTypeService implements ICustomerTypeService {
    private ICustomerTypeResponsitory customerTypeResponsitory = new CustomerTypeResponsitory();

    @Override
    public List<CustomerType> showList() {
        return customerTypeResponsitory.showList();
    }
}

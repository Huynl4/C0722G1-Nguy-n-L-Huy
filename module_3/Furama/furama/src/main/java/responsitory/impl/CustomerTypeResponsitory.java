package responsitory.impl;

import model.CustomerType;
import responsitory.BaseResponsitory;
import responsitory.ICustomerTypeResponsitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeResponsitory implements ICustomerTypeResponsitory {
    private final String SELECT_ALL_CUSTOMER_TYPE = "SELECT * FROM customer_type;";


    @Override
    public List<CustomerType> showList() {
        Connection connection = BaseResponsitory.getConnectDB();
        List<CustomerType> customerTypeList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int typeId = rs.getInt("id");
                String typeName = rs.getString("name");
                CustomerType customerType = new CustomerType(typeId, typeName);
                customerTypeList.add(customerType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerTypeList;
    }
}

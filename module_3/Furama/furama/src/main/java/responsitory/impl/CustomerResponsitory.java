package responsitory.impl;

import model.Customer;
import responsitory.BaseResponsitory;
import responsitory.ICustomerResponsitory;
import service.ICustomerService;
import service.impl.CustomerService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerResponsitory implements ICustomerResponsitory {

    private final String SELECT_ALL_CUSTOMER = " SELECT * from customer where `name` like ? and address like ? and phone_number like ? ;";
    private final String INSERT_CUSTOMER = "insert into customer values(?,?,?,?,?,?,?,?,?);";
    private static final String UPDATE_CUSTOMER = "update customer set customer_type_id = ? , `name`= ?, date_of_birth = ?,gender=?,id_card = ?,phone_number = ?,email= ?,address=? where id = ?;";
    private final String FIND_BY_ID = " SELECT * from customer where id =?;";
    private final String DELETE_BY_ID = "DELETE FROM customer WHERE id = ?;";

    @Override
    public List<Customer> showList(String nameSearch, String addressSearch, String phoneSearch) {
        Connection connection = BaseResponsitory.getConnectDB();
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ps.setString(1, "%" + nameSearch + "%");
            ps.setString(2, "%" + addressSearch + "%");
            ps.setString(3, "%" + phoneSearch + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int customer_type_id = rs.getInt("customer_type_id");
                String name = rs.getString("name");
                boolean gender = rs.getBoolean("gender");
                String date_of_birth = rs.getString("date_of_birth");
                String id_card = rs.getString("id_card");
                String phone_number = rs.getString("phone_number");
                String email = rs.getString("email");
                String address = rs.getString("address");
                Customer customer = new Customer(id, customer_type_id, name, date_of_birth, gender, id_card, phone_number, email, address);
                customerList.add(customer);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean add(Customer customer) {
        Connection connection = BaseResponsitory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_CUSTOMER);
            ps.setInt(1, customer.getId());
            ps.setInt(2, customer.getCustomerTypeId());
            ps.setString(3, customer.getName());
            ps.setDate(4, Date.valueOf(customer.getDateOfBirth()));
            ps.setBoolean(5, customer.getGender());
            ps.setString(6, customer.getIdCard());
            ps.setString(7, customer.getPhoneNumber());
            ps.setString(8, customer.getEmail());
            ps.setString(9, customer.getAddress());
            return ps.executeUpdate() > 0;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean edit(Customer customer) {
        Connection connection = BaseResponsitory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(UPDATE_CUSTOMER);
            ps.setInt(1, customer.getCustomerTypeId());
            ps.setString(2, customer.getName());
            ps.setDate(3, Date.valueOf(customer.getDateOfBirth()));
            ps.setBoolean(4, customer.getGender());
            ps.setString(5, customer.getIdCard());
            ps.setString(6, customer.getPhoneNumber());
            ps.setString(7, customer.getEmail());
            ps.setString(8, customer.getAddress());
            ps.setInt(9, customer.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        Connection connection = BaseResponsitory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int customer_type_id = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("name");
                String date_of_birth = resultSet.getString("date_of_birth");
                boolean gender = resultSet.getBoolean("gender");
                String id_card = resultSet.getString("id_card");
                String phone_number = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                customer = new Customer(id, customer_type_id, name, date_of_birth, gender, id_card, phone_number, email, address);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public boolean delete(int id) {
        Connection connection = BaseResponsitory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(DELETE_BY_ID);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }
}

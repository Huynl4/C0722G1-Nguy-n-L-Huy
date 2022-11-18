package responsitory;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerResponsitory implements ICustomerResponsitory {
    private String jdbcURL = "jdbc:mysql://localhost:3306/furama_study?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "huynl";
    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer (customer_type_id, name, date_of_birth,gender,id_card,phone_number,email,address) VALUES (?, ?, ?,?,?,?,?,?);";
    private static final String SELECT_ALL_CUSTOMER = "SELECT*FROM customer where name like ?; ";

//    public void insertCustomer(Customer customer) {
//        Connection connection = BaseRepository.getConnectDB();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL);
//            preparedStatement.setInt(1, customer.getCustomerTypeId());
//            preparedStatement.setString(2, customer.getName());
//            preparedStatement.setString(3, customer.getDateOfBirth());
//            preparedStatement.setString(4, customer.getGender());
//            preparedStatement.setString(5, customer.getIdCard());
//            preparedStatement.setString(6, customer.getPhoneNumber());
//            preparedStatement.setString(7, customer.getEmail());
//            preparedStatement.setString(7, customer.getAddress());
//            System.out.println(preparedStatement);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.getStackTrace();
//        }
//    }


    @Override
    public boolean add(Customer customer) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_CUSTOMER_SQL);
            ps.setInt(1, customer.getCustomerTypeId());
            ps.setString(2, customer.getName());
            ps.setString(3, customer.getDateOfBirth());
            ps.setString(4, customer.getGender());
            ps.setString(5, customer.getIdCard());
            ps.setString(6, customer.getPhoneNumber());
            ps.setString(7, customer.getEmail());
            ps.setString(8, customer.getAddress());
            return ps.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean edit(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Customer> findAll(String search) {
        List<Customer> customers = new ArrayList<>();
        try (Connection connection = BaseRepository.getConnectDB();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
        ) {
            preparedStatement.setString(1, "%" + search + "");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int customerTypeId = rs.getInt("customer_type_id");
                String name = rs.getString("name");
                String dateOfBirth = rs.getString("date_of_birth");
                String gender = rs.getString("gender");
                String idCard = rs.getString("id_card");
                String phoneNumber = rs.getString("phone_number");
                String email = rs.getString("email");
                String address = rs.getString("address");
                customers.add(new Customer(id, customerTypeId, name, dateOfBirth, gender, idCard, phoneNumber, email, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public List<Customer> displayAfterDelete() {
        return null;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public Customer searchCustomer(int id) {
        return null;
    }
}

package case_study.service.impl_customer;

import case_study.model.model_person.Customer;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    public static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    @Override
    public void displayCustomer() {
        try {
            customerList = readFileCustomer();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void addCustomer() {
        try {
            customerList = readFileCustomer();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Customer customer = addCustomerr();
        customerList.add(customer);
        System.out.println("thêm mới thành công");
        try {
            writeFileCustomer(customerList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editCustomer() throws IOException {
        customerList = readFileCustomer();
        System.out.println("Nhập id cần sửa chữa;");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                System.out.println("Bạn có muốn sữa chữa  nhân viên hay không? y= Yes , n = No");
                String choice = scanner.nextLine();
                if (choice.equals("y")) {
                    customerList.set(i, addCustomerr());
                    System.out.println("đã sửa chữa thành công");
                    check = true;
                } else if (choice.equals("n")) {
                    return;
                }
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy nhân viên");
        }
        writeFileCustomer(customerList);
    }

    public static Customer addCustomerr() {
        System.out.println("Nhập id khách hàng");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập giới tính khách hàng");
        String gender = scanner.nextLine();
        System.out.println("Nhập CMND khách hàng");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại khách hàng");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email khách hàng");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng");
        String typeOfGuest = scanner.nextLine();
        System.out.println("Nhập địa chỉ khách hàng");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, idCard, numberPhone, email, typeOfGuest, address);
        return customer;
    }

    public static List<Customer> readFileCustomer() throws IOException {
        File file = new File("src\\case_study\\data\\file_customer.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Customer> customerList = new ArrayList<>();
        String[] info;
        Customer customer;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            customer = new Customer(Integer.parseInt(info[0]), info[1], LocalDate.parse(info[2]), info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]), info[6], info[7], info[8]);
            customerList.add(customer);
        }
        bufferedReader.close();
        return customerList;
    }

    public void writeFileCustomer(List<Customer> customerList) throws IOException {
        File file = new File("src\\case_study\\data\\file_customer.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer : customerList) {
            bufferedWriter.write(getInfo(customer));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public String getInfo(Customer customer) {
        return customer.getId() + "," + customer.getName() + "," + customer.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "," + customer.getGender() + "," + customer.getIdCard() + "," + customer.getNumberPhone() + "," + customer.getEmail() + "," + customer.getTypeOfGuest() + "," + customer.getAddress();
    }
}

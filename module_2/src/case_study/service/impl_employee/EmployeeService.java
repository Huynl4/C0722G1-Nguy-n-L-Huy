package case_study.service.impl_employee;

import case_study.model.model_person.Employee;
import case_study.model.model_person.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void displayEmployee() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee() {
        Employee employee = addToEmployee();
        employeeList.add(employee);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void editEmployee() {
        System.out.println("Nhập id cần sửa chữa;");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                System.out.println("Bạn có muốn sữa chữa  nhân viên hay không? y= Yes , n = No");
                String choice = scanner.nextLine();
                if (choice.equals("y")) {
                    employeeList.set(i, addToEmployee());
                    System.out.println("đã sửa chữa thành công");
                }
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy nhân viên");
        }
    }

    public static Employee addToEmployee() {
        System.out.println("Nhập id nhân viên");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh nhân viên");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.println("Nhập giới tính nhân viên");
        String gender = scanner.nextLine();
        System.out.println("Nhập mã nhân viên");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email nhân viên");
        String email = scanner.nextLine();
        System.out.println("Nhập trình độ nhân viên");
        String lever = scanner.nextLine();
        System.out.println("Nhâp vị trí nhân viên");
        String position = scanner.nextLine();
        System.out.println("Nhập lương nhân viên");
        double wage = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(id, name, dateOfBirth, gender, idCard, numberPhone, email, lever, position, wage);
        return employee;
    }
//    public static void test(){
//        Employee employee = new Employee(1,"HUY",,"Nam",07,34,"@mail","CĐ","CEO",10);
//    }
}
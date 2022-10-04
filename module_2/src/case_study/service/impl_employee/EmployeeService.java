package case_study.service.impl_employee;

import case_study.controller.EmployyeeManagementController;
import case_study.model.model_person.Employee;
import case_study.model.model_person.Person;
import ss16_io_text_file.exercise.exercise3.model.Student;
import ss16_io_text_file.practice.practice1.ReadFileExample;

import java.io.*;
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
    public void displayEmployee() throws IOException {
        employeeList = readFile();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee() throws IOException {
        employeeList = readFile();
        Employee employee = addToEmployee();
        employeeList.add(employee);
        System.out.println("Thêm mới thành công");
        writeFile(employeeList);
    }

    @Override
    public void editEmployee() throws IOException {
        employeeList = readFile();
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
                    check = true;
                } else if (choice.equals("n")) {
                    return;
                }
            }
        }
        if (!check) {
            System.out.println("không thấy");
        }
        writeFile(employeeList);
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
        System.out.println("Nhập CMND nhân viên");
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

    public static List<Employee> readFile() throws IOException {
        File file = new File("src\\case_study\\data\\file_employee.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Employee> employeeList = new ArrayList<>();
        String[] info;
        Employee employee;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            employee = new Employee(Integer.parseInt(info[0]), info[1], LocalDate.parse(info[2], formatter), info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]), info[6], info[7], info[8], Double.parseDouble(info[9]));
            employeeList.add(employee);
        }
        bufferedReader.close();
        return employeeList;
    }

    public void writeFile(List<Employee> employeeList) throws IOException {
        File file = new File("src\\case_study\\data\\file_employee.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Employee employee : employeeList) {
            bufferedWriter.write(getInfo(employee));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public String getInfo(Employee employee) {
        return employee.getId() + "," + employee.getName() + "," + employee.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "," + employee.getGender() + "," + employee.getIdCard() + "," + employee.getNumberPhone() + "," + employee.getEmail() + "," + employee.getLever() + "," + employee.getPosition() + "," + employee.getWage();
    }

}
package ss16_io_text_file.exercise.exercise3.service.impl_student;

import ss16_io_text_file.exercise.exercise3.model.Student;
import ss16_io_text_file.exercise.exercise3.utils.exception.PersonException;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> studentList = new ArrayList<>();


    @Override
    public void addStudent() {
        studentList = readStudent();

        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công");
        writeStudent(studentList);
    }


    @Override
    public void displayAllStudent() {
        studentList = readStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        studentList = readStudent();
        System.out.println("Nhập mã học sinh cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
                System.out.println("Bạn muốn xóa học sinh này không ? Nhập Y: yes, N: no ");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("Xóa thành công!");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy học sinh cần xóa!");
        }
        writeStudent(studentList);
    }

    @Override
    public void searchStudent() {
        studentList = readStudent();
        System.out.println("Nhập tên cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getName().contains(str)) {
                System.out.println(student);
            }
        }
    }

    @Override
    public void sortStudent() {
        System.out.println("Nhâp tên cần sắp xếp: ");
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = studentList.size() - 1; j > i; j--) {
                if (studentList.get(j).getName().compareTo(studentList.get(j - 1).getName()) > 0) {
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j - 1));
                    studentList.set(j - 1, temp);
                } else if (studentList.get(j).getName().compareTo(studentList.get(j - 1).getName()) == 0) {
                    System.out.println("ok");
                    if (studentList.get(j).getCode().compareTo(studentList.get(j - 1).getCode()) > 0) {
                        System.out.println("ok");
                        Student temp1 = studentList.get(j);
                        studentList.set(j, studentList.get(j - 1));
                        studentList.set(j - 1, temp1);
                    }
                }
            }
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }


    public Student infoStudent() {
        String code;
        while (true) {
            try {
                System.out.println("Mời nhập mã học sinh: ");
                code = scanner.nextLine();
                PersonException.codeCheck(code);
                if (PersonException.isCheckDuplicetedId(code, studentList)) {
                    System.out.println("Id trùng lặp, nhập lại");
                } else {
                    break;
                }
            } catch (PersonException e) {
                System.out.println(e.getMessage());
            }
        }
        String name;
        while (true) {
            try {
                System.out.println("Mời nhập tên học sinh: ");
                name = scanner.nextLine();
                PersonException.nameCheck(name);
                break;
            } catch (PersonException e) {
                System.out.println(e.getMessage());
            }
        }
        String gender;
        while (true) {
            try {
                System.out.println("Mời nhập giới tính học sinh: ");
                gender = scanner.nextLine();
                if (gender.equals("Nam")) {
                    gender = "Nam";
                } else if (gender.equals("Nữ")) {
                    gender = "Nữ";
                } else {
                    gender = "Phi giới tính";
                }
                PersonException.genderCheck(gender);
                break;
            } catch (PersonException e) {
                System.out.println("Nhập sai định dạng, nhập lại");
            }
        }
        LocalDate dateOfBirth;
        while (true) {
            try {
                System.out.println("Nhập ngày tháng năm: ");
                dateOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                PersonException.dateCheck(dateOfBirth);
                break;
            } catch (PersonException e) {
                System.out.println("Nhập sai");
            }
        }

        System.out.println("Mời bạn nhập ten lớp: ");
        String nameClass = scanner.nextLine();
        System.out.println("Mời bạn nhập điểm học sinh: ");
        double score = Double.parseDouble(scanner.nextLine());
        return new Student(code, name, gender, dateOfBirth, nameClass, score);
    }

    private List<Student> readStudent() {
        List<Student> studentList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            File file = new File("src\\ss16_io_text_file\\exercise\\exercise3\\data\\fileReadStudent.csv");
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] info;
            Student student1;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                student1 = new Student(info[0], info[1], info[2], LocalDate.parse(info[3], DateTimeFormatter.ofPattern("dd/MM/yyyy")), info[4], Double.parseDouble(info[5]));
                studentList.add(student1);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public void writeStudent(List<Student> studentList) {
        BufferedWriter bufferedWriter = null;
        try {
            File file1 = new File("src\\ss16_io_text_file\\exercise\\exercise3\\data\\fileReadStudent.csv");
            bufferedWriter = new BufferedWriter(new FileWriter(file1));
            for (Student s : studentList) {
                bufferedWriter.write(s.getInfo());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

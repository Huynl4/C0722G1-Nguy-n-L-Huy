package ss16_io_text_file.exercise.exercise3.service.impl_student;

import ss16_io_text_file.exercise.exercise3.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent() throws IOException {
        studentList= getAllStudent();
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công");
        writeStudent();
    }

    public void writeStudent() throws IOException {
        File file1 = new File("src\\ss16_io_text_file\\exercise\\exercise3\\data\\fileReadStudent.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
        for (Student s : studentList) {
            bufferedWriter.write(s.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    @Override
    public void displayAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
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
    }

    @Override
    public void searchStudent() {
        System.out.println("Nhập tên cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(str)) {
                System.out.println(studentList.get(i));
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
        System.out.println("Mời nhập mã học sinh: ");
        String code = scanner.nextLine();
        System.out.println("Mời nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập giới tính học sinh: ");
        String tempGender = scanner.nextLine();
        String gender;
        if (tempGender.equals("Nam")) {
            gender = "Nam";
        } else if (tempGender.equals("Nữ")) {
            gender = "Nữ";
        } else {
            gender = "Phi giới tính";
        }
        System.out.println("Mời bạn nhập ten lớp: ");
        String nameClass = scanner.nextLine();
        System.out.println("Mời bạn nhập điểm học sinh: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(code, name, gender, nameClass, score);
        return student;
    }

    private List<Student> getAllStudent() throws IOException {
        File file = new File("src\\ss16_io_text_file\\exercise\\exercise3\\data\\fileReadStudent.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Student> studentList = new ArrayList<>();
        String[] info;
        Student student1;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            student1 = new Student(info[0], info[1], info[2], info[3], Double.parseDouble(info[4]));
            studentList.add(student1);
        }
        bufferedReader.close();
        return studentList;
    }

//    public void writeStudent(List<Student> studentList1) throws IOException {
//        File file1 = new File("src\\ss16_io_text_file\\exercise\\exercise3\\mvc\\data\\fileReadStudent.csv");
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
//        for (Student s : studentList1) {
//            bufferedWriter.write(s.getInfo());
//            bufferedWriter.newLine();
//        }
//        bufferedWriter.close();
//    }

}

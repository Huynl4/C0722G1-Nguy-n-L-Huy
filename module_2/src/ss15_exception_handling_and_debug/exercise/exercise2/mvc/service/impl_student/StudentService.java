package ss15_exception_handling_and_debug.exercise.exercise2.mvc.service.impl_student;

import ss15_exception_handling_and_debug.exercise.exercise2.mvc.model.Student;
import ss15_exception_handling_and_debug.exercise.exercise2.mvc.service.until.CodeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent() throws CodeException {
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void addFakeData() {
        studentList.add(new Student("1", "c", "nam", "12", 10));
        studentList.add(new Student("2", "b", "nam", "12", 10));
        studentList.add(new Student("3", "d", "nam", "12", 10));
        studentList.add(new Student("4", "f", "nam", "12", 10));
        studentList.add(new Student("5", "h", "nam", "12", 10));
        studentList.add(new Student("6", "h", "nam", "12", 10));
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

    public Student infoStudent() throws CodeException {
        String code;
        while (true) {
            try {
                System.out.print("Mời bạn nhập mã học sinh: ");
                code = scanner.nextLine();
                if(!code.matches("[a-zA-Z0-9]{3,6}"))
                    throw new CodeException("Nhập sai");
                break;
            } catch (Exception e) {
                System.out.println("Bạn nhập sai r, mời nhập lại");
                e.getStackTrace();
            }
        }
        String name;
        while (true){
            try {
                System.out.print("Mời bạn nhập tên học sinh: ");
                name = scanner.nextLine();
                if(!code.matches("[a-zA-Z0-9]{3,6}"))
                    throw new CodeException("Nhập sai");
                break;
            }catch (Exception e){
                System.out.println("Bạn nhập sai r , mời nhập lại");
                e.getStackTrace();
            }
        }
        System.out.print("Mời bạn nhập giới tính học sinh: ");
        String tempGender = scanner.nextLine();
        Boolean gender = null;
        if (tempGender.equals("Nam")) {
            gender = true;
        } else if (tempGender.equals("Nữ")) {
            gender = false;
        }
        if (tempGender.equals("") || tempGender.equals("LGBT")) {
            gender = true;
            System.out.println("Gioi tinh 3");
        }
        String nameClass;
        while (true){
            try {
                System.out.print("Mời bạn nhập tên lớp: ");
                nameClass = scanner.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Mời nhập lại");
                e.getStackTrace();
            }
        }
        double score;
        while (true){
            try {
                System.out.print("Mời bạn nhập điểm của học sinh: ");
                score = Double.parseDouble(scanner.nextLine());
                if (score>9.9 || score<0){
                    throw new CodeException("Đã nhập sai");
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("sai định dạng , nhập lại!");
                e.getStackTrace();
            }
        }
        Student student = new Student(code, name, tempGender, nameClass, score);
        return student;
    }
}

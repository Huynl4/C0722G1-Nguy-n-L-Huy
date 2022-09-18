package ss0_exercise.mvc.service.impl_teacher;

import ss0_exercise.mvc.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công. ");
    }

    @Override
    public void displayTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhập mã giáo viên cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getCode().equals(code)) {
                System.out.println("Bạn muốn xóa giáo viên này không ? Nhập Y: yes, N: no ");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    teacherList.remove(i);
                    System.out.println("Xóa thành công!");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy giáo viên cần xóa!");
        }

    }

    public Teacher infoTeacher() {
        System.out.println("Mời nhập mã giáo viên: ");
        String code = scanner.nextLine();
        System.out.println("Mời nhập tên giáo viên: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập giới tính giáo viên: ");
        String tempGender = scanner.nextLine();
        String gender;
        if (tempGender.equals("Nam")) {
            gender = "Nam";
        } else if (tempGender.equals("Nữ")) {
            gender = "Nữ";
        } else {
            gender = "Phi giới tính";
        }

        System.out.println("Mời bạn nhập chuyên môn Giáo viên: ");
        String technique = scanner.nextLine();
        Teacher teacher = new Teacher(code, name, gender, technique);
        return teacher;
    }
}


package ss16_io_text_file.exercise.exercise3.controler;

import ss16_io_text_file.exercise.exercise3.utils.exception.PersonException;

import java.io.IOException;
import java.util.Scanner;

public class PersonController {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuPerson() throws IOException, PersonException {
        while (true) {
            System.out.println("Chào mừng bạn đến với chương trình quản lý Codegym");
            System.out.println("1. Học sinh");
            System.out.println("2. Giáo viên");
            System.out.println("3.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    StudentController.menuStudent();
                    break;
                case 2:
                    TeacherController.menuTeacher();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn nhập sai. Vui lòng nhập lại!");
            }
        }
    }
}

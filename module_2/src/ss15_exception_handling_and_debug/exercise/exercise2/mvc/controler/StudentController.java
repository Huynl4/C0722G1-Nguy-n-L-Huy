package ss15_exception_handling_and_debug.exercise.exercise2.mvc.controler;

import ss15_exception_handling_and_debug.exercise.exercise2.mvc.service.impl_student.IStudentService;
import ss15_exception_handling_and_debug.exercise.exercise2.mvc.service.impl_student.StudentService;
import ss15_exception_handling_and_debug.exercise.exercise2.mvc.service.until.CodeException;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuStudent() throws CodeException {
        while (true) {
            System.out.println("----------------------------------------------------");
            System.out.println("Chào mừng bạn đến với chương trình quản lý CodyGym. ");
            System.out.println("1. Thêm mới học sinh.");
            System.out.println("2. Hiển thị danh sách học sinh. ");
            System.out.println("3. Xóa học sinh. ");
            System.out.println("4. Quay lại Menu. ");
            System.out.println("5. Tìm kiếm. ");
            System.out.println("6. Sắp xếp");
            System.out.println("7. Thoát. ");
            System.out.println("8. Thêm data ảo. ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.displayAllStudent();
                    break;
                case 3:
                    iStudentService.removeStudent();
                    break;
                case 4:
                    PersonController.menuPerson();
                    break;
                case 5:
                    iStudentService.searchStudent();
                    break;
                case 6:
                    iStudentService.sortStudent();
                    break;
                case 7:
                    System.exit(0);
                case 8:
                    iStudentService.addFakeData();
                    break;
                default:
                    System.out.println("Bạn đã nhập sai!Vui lòng nhập đúng!");
                    return;
            }
        }
    }
}

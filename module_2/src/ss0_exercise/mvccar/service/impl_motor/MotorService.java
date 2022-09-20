package ss0_exercise.mvccar.service.impl_motor;

import ss0_exercise.mvccar.model.Car;
import ss0_exercise.mvccar.model.Motor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorService implements IMotorService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Motor> motorList = new ArrayList<>();

    public Motor infoMotor() {
        System.out.println("Nhập biển kiểm soát.");
        String seaofControl = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất.");
        String manufacturerName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất.");
        String manufacturerYear = scanner.nextLine();
        System.out.println("NHập chủ sở hữu.");
        String owners = scanner.nextLine();
        System.out.println("Nhập công suất.");
        String wattage = scanner.nextLine();
        Motor motor = new Motor(seaofControl, manufacturerName, manufacturerYear, owners, wattage);
        return motor;


    }

    @Override
    public void addMotor() {
        Motor motor = this.infoMotor();
        motorList.add(motor);
        System.out.println("Thêm mới thành công.");
    }

    @Override
    public void findMotor() {
        System.out.println("Tìm kiếm biển số xe");
        int type = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < motorList.size(); i++) {
            if (motorList.get(i).getSea​​of​​Control().equals(type)) {
                System.out.println(type);
            }
        }
    }

    @Override
    public void displayMotor() {
        for (Motor motor : motorList) {
            System.out.println(motor);
        }

    }

    @Override
    public void removeMotor() {
        System.out.println("Nhập biển kiểm soát xe cần xóa...");
        String seaofControl = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < motorList.size(); i++) {
            if (motorList.get(i).getSea​​of​​Control().equals(seaofControl)) {
                System.out.println("Bạn muốn xóa loại xe này không? Nhập Y : yes, N : no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    motorList.remove(i);
                    System.out.println("Xóa thành công!");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy loại xe cẫn xóa..");
        }
    }
}

package ss0_exercise.mvccar.service.impl_car;

import ss0_exercise.mvccar.model.Car;
import ss0_exercise.mvccar.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Car> carList = new ArrayList<>();

    public Car infoCar() {
        System.out.println("Nhập biển kiểm soát.");
        String seaofControl = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất.");
        String manufacturerName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất.");
        String manufacturerYear = scanner.nextLine();
        System.out.println("NHập chủ sở hữu.");
        String owners = scanner.nextLine();
        System.out.println("Nhập kiểu xe.");
        String type = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi.");
        String seat = scanner.nextLine();
        Car car = new Car(seaofControl, manufacturerName, manufacturerYear, owners, type, seat);
        return car;


    }

    @Override
    public void addCar() {
        Car car = this.infoCar();
        carList.add(car);
        System.out.println("Thêm mới thành công.");
    }

    @Override
    public void findCar() {
        System.out.println("Tìm kiếm biển số xe");
        int type1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getSea​​of​​Control().equals(type1)) {
                System.out.println(type1);
            }
        }
    }

    @Override
    public void displayCar() {
        for (Car car : carList) {
            System.out.println(car);
        }

    }

    @Override
    public void removeCar() {
        System.out.println("Nhập biển kiểm soát xe cần xóa...");
        String seaofControl = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getSea​​of​​Control().equals(seaofControl)) {
                System.out.println("Bạn muốn xóa loại xe này không? Nhập Y : yes, N : no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    carList.remove(i);
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

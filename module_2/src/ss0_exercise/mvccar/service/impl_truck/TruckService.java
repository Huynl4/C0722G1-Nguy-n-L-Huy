package ss0_exercise.mvccar.service.impl_truck;

import ss0_exercise.mvc.model.Student;
import ss0_exercise.mvccar.model.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Truck> truckList = new ArrayList<>();

    public Truck infoTruck() {
        System.out.println("Nhập biển kiểm soát.");
        String seaofControl = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất.");
        String manuFacturer = scanner.nextLine();
        System.out.println("Nhập năm sản xuất.");
        String yearFacturer = scanner.nextLine();
        System.out.println("NHập chủ sở hữu.");
        String name = scanner.nextLine();
        System.out.println("Nhập tải trọng.");
        String weight = scanner.nextLine();
        Truck truck = new Truck(seaofControl, manuFacturer, yearFacturer, name, weight);
        return truck;


    }
    @Override
    public void addTruck() {
        Truck truck = this.infoTruck();
        truckList.add(truck);
        System.out.println("Thêm mới thành công.");
    }

    @Override
    public void findTruck() {
        System.out.println("Tìm kiếm biển số xe");
        String type = scanner.nextLine();
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getSea​​of​​Control().equals(type)) {
                System.out.println(truckList.get(i));
            }
        }
    }

    @Override
    public void displayTruck() {
        for (Truck truck : truckList) {
            System.out.println(truck);
        }

    }

    @Override
    public void removeTruck() {
        System.out.println("Nhập biển kiểm soát xe cần xóa...");
        String seaofControl = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getSea​​of​​Control().equals(seaofControl)) {
                System.out.println("Bạn muốn xóa loại xe này không? Nhập Y : yes, N : no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    truckList.remove(i);
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

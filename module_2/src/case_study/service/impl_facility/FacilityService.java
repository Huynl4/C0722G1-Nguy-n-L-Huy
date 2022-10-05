package case_study.service.impl_facility;

import case_study.model.model_facility.Facility;
import case_study.model.model_facility.House;
import case_study.model.model_facility.Room;
import case_study.model.model_facility.Villa;

import java.util.*;

public class FacilityService implements IFacilityService {
    public static LinkedHashMap<Facility, Integer> facilityLinkedHashMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Facility infoFacility() {
        System.out.println("Nhập tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        Double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập só lượng người thuê");
        String maxPeople = scanner.nextLine();
        System.out.println("Nhập kiểu  thuê");
        String retaltype = scanner.nextLine();
        Facility facility = new Facility(serviceName, area, price, maxPeople, retaltype);
        return facility;
    }

    public static Villa infoVilla() {
        System.out.println("Nhập tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        Double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập só lượng người thuê");
        String maxPeople = scanner.nextLine();
        System.out.println("Nhập kiểu  thuê");
        String retaltype = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        int areaSwim = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số tầng");
        int floorNumber = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceName, area, price, maxPeople, retaltype, roomStandard, areaSwim, floorNumber);
        return villa;
    }


    public static House infoHouse() {
        System.out.println("Nhập tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        Double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập só lượng người thuê");
        String maxPeople = scanner.nextLine();
        System.out.println("Nhập kiểu  thuê");
        String retaltype = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập số tầng");
        int floorNumber = Integer.parseInt(scanner.nextLine());
        House house = new House(serviceName, area, price, maxPeople, retaltype, roomStandard, floorNumber);
        return house;
    }

    public static Room infoRoom() {
        System.out.println("Nhập tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        Double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập só lượng người thuê");
        String maxPeople = scanner.nextLine();
        System.out.println("Nhập kiểu  thuê");
        String retaltype = scanner.nextLine();
        System.out.println("Nhập dịch vụ miễn phí đi kèm");
        String freeService = scanner.nextLine();
        Room room = new Room(serviceName, area, price, maxPeople, retaltype, freeService);
        return room;
    }


    @Override
    public void displayFacility() {
        for (Facility key: facilityLinkedHashMap
             ) {

        }
    }

    @Override
    public void addFacility() {

    }

    @Override
    public void displayFacilityMaintenance() {

    }

}

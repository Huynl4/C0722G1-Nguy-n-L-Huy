package case_study.service.impl_facility;

import case_study.model.model_facility.Facility;
import case_study.model.model_facility.House;
import case_study.model.model_facility.Room;
import case_study.model.model_facility.Villa;
import case_study.utils.FacilityException;

import java.io.*;
import java.util.*;

public class FacilityService implements IFacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
//    private static List<Facility> facilityList = new ArrayList<>();
//    private static List<Villa> villaList = new ArrayList<>();

    public static Facility infoFacility() throws Exception {
        String serviceCode;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ");
                serviceCode = scanner.nextLine();
                FacilityException.checkCode(serviceCode, "SVVL[0-9]{4}");
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }


        double area;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng");
                area = Double.parseDouble(scanner.nextLine());
                FacilityException.checkArea(area);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        int price;
        while (true) {
            try {
                System.out.println("Nhập chi phí thuê");
                price = Integer.parseInt(scanner.nextLine());
                FacilityException.checkPrice(price);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }


        int maxPeople;
        while (true) {
            try {
                System.out.println("Nhập só lượng người thuê");
                maxPeople = Integer.parseInt(scanner.nextLine());
                FacilityException.checkMaxPeople(maxPeople);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }


        String retaltype;
        while (true) {
            try {
                System.out.println("Nhập kiểu  thuê");
                retaltype = scanner.nextLine();
                FacilityException.checkVip(retaltype);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        Facility facility = new Facility(serviceCode, area, price, maxPeople, retaltype);
        return facility;
    }

    public static Villa infoVilla() throws Exception {
        String serviceCode;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ");
                serviceCode = scanner.nextLine();
                FacilityException.checkCode(serviceCode, "SVVL[0-9]{4}");
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        double area;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng");
                area = Double.parseDouble(scanner.nextLine());
                FacilityException.checkArea(area);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        int price = 1;
        while (true) {
            try {
                System.out.println("Nhập chi phí thuê");
                price = Integer.parseInt(scanner.nextLine());
                FacilityException.checkPrice(price);
                break;
            } catch (NumberFormatException | FacilityException n) {
                System.out.println(n.getMessage());
            }
        }

        int maxPeople;
        while (true) {
            try {
                System.out.println("Nhập só lượng người thuê");
                maxPeople = Integer.parseInt(scanner.nextLine());
                FacilityException.checkMaxPeople(maxPeople);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }
        String retaltype;
        while (true) {
            try {
                System.out.println("Nhập kiểu  thuê");
                retaltype = scanner.nextLine();
                FacilityException.checkVip(retaltype);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        String roomStandard;
        while (true) {
            try {
                System.out.println("Nhập tiêu chuẩn phòng");
                roomStandard = scanner.nextLine();
                FacilityException.checkVip(roomStandard);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        double areaSwim;
        while (true) {
            try {
                System.out.println("Nhập diện tích hồ bơi");
                areaSwim = Double.parseDouble(scanner.nextLine());
                FacilityException.checkAreaSwim(areaSwim);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }


        int floorNumber;
        while (true) {
            try {
                System.out.println("Nhập số tầng");
                floorNumber = Integer.parseInt(scanner.nextLine());
                FacilityException.checkFloorNumber(floorNumber);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        Villa villa = new Villa(serviceCode, area, price, maxPeople, retaltype, roomStandard, areaSwim, floorNumber);
        return villa;
    }


    public static House infoHouse() throws Exception {
        String serviceCode;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ");
                serviceCode = scanner.nextLine();
                FacilityException.checkHouse(serviceCode);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }
        double area;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng");
                area = Double.parseDouble(scanner.nextLine());
                FacilityException.checkArea(area);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }
        int price;
        while (true) {
            try {
                System.out.println("Nhập chi phí thuê");
                price = Integer.parseInt(scanner.nextLine());
                FacilityException.checkPrice(price);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }


        int maxPeople;
        while (true) {
            try {
                System.out.println("Nhập só lượng người thuê");
                maxPeople = Integer.parseInt(scanner.nextLine());
                FacilityException.checkMaxPeople(maxPeople);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }


        String retaltype;
        while (true) {
            try {
                System.out.println("Nhập kiểu  thuê");
                retaltype = scanner.nextLine();
                FacilityException.checkVip(retaltype);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }


        String roomStandard;
        while (true) {
            try {
                System.out.println("Nhập tiêu chuẩn phòng");
                roomStandard = scanner.nextLine();
                FacilityException.checkVip(roomStandard);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }


        int floorNumber;
        while (true) {
            try {
                System.out.println("Nhập số tầng");
                floorNumber = Integer.parseInt(scanner.nextLine());
                FacilityException.checkFloorNumber(floorNumber);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        House house = new House(serviceCode, area, price, maxPeople, retaltype, roomStandard, floorNumber);
        return house;
    }

    public static Room infoRoom() throws Exception {
        String serviceCode;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ");
                serviceCode = scanner.nextLine();
                FacilityException.checkRoom(serviceCode);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }
        double area;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng");
                area = Double.parseDouble(scanner.nextLine());
                FacilityException.checkArea(area);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }
        int price;
        while (true) {
            try {
                System.out.println("Nhập chi phí thuê");
                price = Integer.parseInt(scanner.nextLine());
                FacilityException.checkPrice(price);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }
        int maxPeople;
        while (true) {
            try {
                System.out.println("Nhập só lượng người thuê");
                maxPeople = Integer.parseInt(scanner.nextLine());
                FacilityException.checkMaxPeople(maxPeople);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }
        String retaltype;
        while (true) {
            try {
                System.out.println("Nhập kiểu  thuê");
                retaltype = scanner.nextLine();
                FacilityException.checkVip(retaltype);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Nhập dịch vụ miễn phí đi kèm");
        String freeService = scanner.nextLine();
        Room room = new Room(serviceCode, area, price, maxPeople, retaltype, freeService);
        return room;
    }


    @Override
    public void displayFacility() {
        for (Facility key : facilityIntegerMap.keySet()) {
            Integer value = facilityIntegerMap.get(key);
            System.out.println(key + "," + value);
        }
    }

    @Override
    public void displayFacilityMaintenance() {

    }


    @Override
    public void addVilla() throws Exception {
        facilityIntegerMap = readFileVilla();
        Villa villa = infoVilla();
        facilityIntegerMap.put(villa, 0);
        writeFileVilla(facilityIntegerMap);
        System.out.println("Thêm thành công");
    }

    @Override
    public void addHouse() throws Exception {
        facilityIntegerMap = readFileHouse();
        House house = infoHouse();
        facilityIntegerMap.put(house, 0);
        writeFileVilla(facilityIntegerMap);
        System.out.println("Thêm thành công");
    }

    @Override
    public void addRoom() throws Exception {
        facilityIntegerMap = readFileRoom();
        House house = infoHouse();
        facilityIntegerMap.put(house, 0);
        writeFileRoom(facilityIntegerMap);
        System.out.println("Thêm thành công");
    }

    public static Map<Facility, Integer> readFileVilla() throws IOException {
        File file = new File("src\\case_study\\data\\file_villa.csv");
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] info;
        Villa villa;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            villa = new Villa(info[0], Double.parseDouble(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4], info[5], Double.parseDouble(info[6]), Integer.parseInt(info[7]));
            facilityIntegerMap.put(villa, 0);
        }
        bufferedReader.close();
        return facilityIntegerMap;
    }

    public void writeFileVilla(Map<Facility, Integer> facilityIntegerMap) throws IOException {
        File file = new File("src\\case_study\\data\\file_villa.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Set<Facility> villaSet = facilityIntegerMap.keySet();
        for (Facility key : villaSet) {
            bufferedWriter.write(getInfo((Villa) key));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public String getInfo(Villa villa) {
        return villa.getServiceCode() + "," + villa.getArea() + "," + villa.getPrice() + "," + villa.getMaxPeople() + "," + villa.getRentaltype() + "," + villa.getRoomStandard() + "," + villa.getAreaSwim() + "," + villa.getFloorNumber();
    }


    public static Map<Facility, Integer> readFileHouse() throws IOException {
        File file = new File("src\\case_study\\data\\file_house.csv");
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] info;
        House house;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            house = new House(info[0], Double.parseDouble(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4], info[5], Integer.parseInt(info[6]));
            facilityIntegerMap.put(house, 0);
        }
        bufferedReader.close();
        return facilityIntegerMap;
    }

    public void writeFileHouse(Map<Facility, Integer> facilityIntegerMap) throws IOException {
        File file = new File("src\\case_study\\data\\file_house.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Set<Facility> houseSet = facilityIntegerMap.keySet();
        for (Facility key : houseSet) {
            bufferedWriter.write(getInfo((House) key));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public String getInfo(House house) {
        return house.getServiceCode() + "," + house.getArea() + "," + house.getPrice() + "," + house.getMaxPeople() + "," + house.getRentaltype() + "," + house.getRoomStandard() + "," + house.getFloorNumber();
    }


    public static Map<Facility, Integer> readFileRoom() throws IOException {
        File file = new File("src\\case_study\\data\\file_room.csv");
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] info;
        Room room;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            room = new Room(info[0], Double.parseDouble(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4], info[5]);
            facilityIntegerMap.put(room, 0);
        }
        bufferedReader.close();
        return facilityIntegerMap;
    }

    public void writeFileRoom(Map<Facility, Integer> roomList) throws IOException {
        File file = new File("src\\case_study\\data\\file_room.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Set<Facility> roomSet = facilityIntegerMap.keySet();
        for (Facility key : roomSet) {
            bufferedWriter.write(getInfo((Room) key));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public String getInfo(Room room) {
        return room.getServiceCode() + "," + room.getArea() + "," + room.getPrice() + "," + room.getMaxPeople() + "," + room.getRentaltype() + "," + room.getFreeService();
    }
}

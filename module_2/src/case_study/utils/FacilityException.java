package case_study.utils;

public class FacilityException extends Exception {
    public FacilityException(String message) {
        super(message);
    }

    public static void checkCode(String serviceCode, String regex) throws FacilityException {
        if (!serviceCode.matches(regex)) {
            throw new FacilityException("Nhập sai định dạng");
        }
    }

    public static void checkHouse(String serviceCode) throws FacilityException {
        if (!serviceCode.matches("[SVHO][0-9]{4}")) {
            throw new FacilityException("Nhập sai định dạng");
        }
    }

    public static void checkRoom(String serviceCode) throws FacilityException {
        if (!serviceCode.matches("[SVRO][0-9]{4}")) {
            throw new FacilityException("Nhập sai định dạng");
        }
    }

    public static void checkArea(double area) throws FacilityException {
        if (area < 30.0) {
            throw new FacilityException("Nhập sai định dạng");
        }
    }

    public static void checkAreaSwim(double areaSwim) throws FacilityException {
        if (areaSwim < 30.0) {
            throw new FacilityException("Nhập sai định dạng");
        }
    }

    public static void checkPrice(int price) throws FacilityException {
        if (price < 0) {
            throw new FacilityException("Nhập sai định dạng");
        }
    }

    public static void checkMaxPeople(Integer maxPeople) throws FacilityException {
        if (maxPeople < 0 || maxPeople > 20) {
            throw new FacilityException("Nhập sai định dạng, nhập lại");
        }
    }

    public static void checkFloorNumber(Integer floorNumber) throws FacilityException {
        if (floorNumber < 0) {
            throw new FacilityException("Nhập sai định dạng");
        }
    }

    public static void checkVip(String vip) throws Exception {
        if (!vip.matches("[A-Z]{3}")) {
            throw new FacilityException("Nhập sai định dạng, nhập lại");
        }
    }
}

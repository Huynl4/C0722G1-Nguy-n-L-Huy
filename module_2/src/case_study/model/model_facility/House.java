package case_study.model.model_facility;

public class House extends Facility {
    private String roomStandard;
    private int floorNumber;

    public House(String roomStandard, int floorNumber) {
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public House(String serviceCode, double area, int price, int maxPeople, String rentaltype, String roomStandard, int floorNumber) {
        super(serviceCode, area, price, maxPeople, rentaltype);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    @Override
    public String getRoomStandard() {
        return roomStandard;
    }

    @Override
    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floorNumber=" + floorNumber +
                '}'+ super.toString();
    }
}

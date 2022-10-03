package case_study.model.model_facility;

public class Villa extends Facility {
    private String roomStandard;
    private int areaSwim;
    private int floorNumber;

    public Villa(String rentaltype, int areaSwim, int floorNumber) {
        this.roomStandard = rentaltype;
        this.areaSwim = areaSwim;
        this.floorNumber = floorNumber;
    }

    public Villa(String servicename, double area, int price, String maxPeople, String rentaltype, String rentaltype1, int areaSwim, int floorNumber) {
        super(servicename, area, price, maxPeople, rentaltype);
        this.roomStandard = rentaltype1;
        this.areaSwim = areaSwim;
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

    public int getAreaSwim() {
        return areaSwim;
    }

    public void setAreaSwim(int areaSwim) {
        this.areaSwim = areaSwim;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "rentaltype='" + roomStandard + '\'' +
                ", areaSwim=" + areaSwim +
                ", floorNumber=" + floorNumber +
                '}' + super.toString();
    }
}

package case_study.model.model_facility;

public class Villa extends Facility {
    private String roomStandard;
    private double areaSwim;
    private int floorNumber;

    public Villa(String rentaltype, double areaSwim, int floorNumber) {
        this.roomStandard = rentaltype;
        this.areaSwim = areaSwim;
        this.floorNumber = floorNumber;
    }

    public Villa(String serviceCode, double area, int price, int maxPeople, String rentaltype, String rentaltype1, double areaSwim, int floorNumber) {
        super(serviceCode, area, price, maxPeople, rentaltype);
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

    public double getAreaSwim() {
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

package case_study.model.model_facility;

public class Facility {
    private String serviceCode;
    private double area;
    private int price;
    private int maxPeople;
    private String rentaltype;

    public Facility() {
    }

    public Facility(String serviceCode, double area, int price, int maxPeople, String rentaltype) {
        this.serviceCode = serviceCode;
        this.area = area;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentaltype = rentaltype;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServicename(String servicename) {
        this.serviceCode = serviceCode;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRoomStandard() {
        return rentaltype;
    }

    public void setRoomStandard(String roomStandard) {
        this.rentaltype = roomStandard;
    }

    public String getRentaltype() {
        return rentaltype;
    }

    public void setRentaltype(String rentaltype) {
        this.rentaltype = rentaltype;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "servicename='" + serviceCode + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxPeople='" + maxPeople + '\'' +
                ", rentaltype='" + rentaltype + '\'' +
                '}';
    }
}

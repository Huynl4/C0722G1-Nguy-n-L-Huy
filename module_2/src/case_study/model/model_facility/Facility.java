package case_study.model.model_facility;

public class Facility {
    private String servicename;
    private double area;
    private int price;
    private String maxPeople;
    private String rentaltype;

    public Facility() {
    }

    public Facility(String servicename, double area, int price, String maxPeople, String rentaltype) {
        this.servicename = servicename;
        this.area = area;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentaltype = rentaltype;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
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

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRoomStandard() {
        return rentaltype;
    }

    public void setRoomStandard(String roomStandard) {
        this.rentaltype = roomStandard;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "servicename='" + servicename + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxPeople='" + maxPeople + '\'' +
                ", rentaltype='" + rentaltype + '\'' +
                '}';
    }
}

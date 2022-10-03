package case_study.model.model_facility;

public class Room extends Facility {
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String servicename, double area, int price, String maxPeople, String rentaltype, String freeService) {
        super(servicename, area, price, maxPeople, rentaltype);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}' + super.toString();
    }
}

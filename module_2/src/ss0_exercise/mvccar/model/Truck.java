package ss0_exercise.mvccar.model;

public class Truck extends Tranport {
    private String tonnage;

    public Truck() {
    }

    public Truck(String tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(String sea​​of​​Control, String manufactureName, String manufactureYear, String owners, String tonnage) {
        super(sea​​of​​Control, manufactureName, manufactureYear, owners);
        this.tonnage = tonnage;
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tonnage='" + tonnage + '\'' +
                '}' + super.toString();
    }
}

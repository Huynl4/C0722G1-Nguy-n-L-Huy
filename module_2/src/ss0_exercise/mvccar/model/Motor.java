package ss0_exercise.mvccar.model;

public class Motor extends Tranport {
    private String wattage;

    public void Motor() {
    }

    public Motor(String wattage) {
        this.wattage = wattage;
    }

    public Motor(String sea​​of​​Control, String manufactureName, String manufactureYear, String owners, String wattage) {
        super(sea​​of​​Control, manufactureName, manufactureYear, owners);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "wattage='" + wattage + '\'' +
                '}' + super.toString();
    }
}

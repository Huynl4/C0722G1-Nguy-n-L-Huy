package ss0_exercise.mvccar.model;

public class Car extends Tranport {
    private String numberSeats;
    private String type;

    public void Car() {
    }

    public Car(String numberSeats, String type) {
        this.numberSeats = numberSeats;
        this.type = type;
    }

    public Car(String sea​​of​​Control, String manufactureName, String manufactureYear, String owners, String numberSeats, String type) {
        super(sea​​of​​Control, manufactureName, manufactureYear, owners);
        this.numberSeats = numberSeats;
        this.type = type;
    }

    public String getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(String numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberSeats='" + numberSeats + '\'' +
                ", type='" + type + '\'' +
                '}' + super.toString();
    }
}


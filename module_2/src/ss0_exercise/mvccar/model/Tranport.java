package ss0_exercise.mvccar.model;

public class Tranport {
    private String sea​​of​​Control ;
    private String manufactureName;
    private String manufactureYear;
    private String owners;

    public Tranport() {
    }

    public Tranport(String sea​​of​​Control, String manufactureName, String manufactureYear, String owners) {
        this.sea​​of​​Control = sea​​of​​Control;
        this.manufactureName = manufactureName;
        this.manufactureYear = manufactureYear;
        this.owners = owners;
    }

    public String getSea​​of​​Control() {
        return sea​​of​​Control;
    }

    public void setSea​​of​​Control(String sea​​of​​Control) {
        this.sea​​of​​Control = sea​​of​​Control;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    @Override
    public String toString() {
        return "Tranport{" +
                "sea​​of​​Control='" + sea​​of​​Control + '\'' +
                ", manufactureName='" + manufactureName + '\'' +
                ", manufactureYear='" + manufactureYear + '\'' +
                ", owners='" + owners + '\'' +
                '}';
    }
}

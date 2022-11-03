public class Customer {
    private String name;
    private String birthday;
    private String address;
    private String photor;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhotor() {
        return photor;
    }

    public void setPhotor(String photor) {
        this.photor = photor;
    }

    public Customer(String name, String birthday, String address, String photor) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.photor = photor;
    }
}

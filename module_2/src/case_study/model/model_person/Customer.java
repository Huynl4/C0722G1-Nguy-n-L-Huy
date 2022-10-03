package case_study.model.model_person;

import java.time.LocalDate;

public class Customer extends Person {
    private String typeOfGuest;
    private String Address ;


    public Customer(int id, String name, LocalDate dateOfBirth, String gender, int idCard, int numberPhone, String email, String typeOfGuest, String address) {
        super(id, name, dateOfBirth, gender, idCard, numberPhone, email);
        this.typeOfGuest = typeOfGuest;
        Address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}

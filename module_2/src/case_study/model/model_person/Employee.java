package case_study.model.model_person;

import java.time.LocalDate;

public class Employee extends Person {
    private String lever;
    private String position;
    private double wage;

    public Employee(int id, String name, LocalDate dateOfBirth, String gender, int idCard, int numberPhone, String email, String lever, String position, double wage) {
        super(id, name, dateOfBirth, gender, idCard, numberPhone, email);
        this.lever = lever;
        this.position = position;
        this.wage = wage;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                ", lever='" + lever + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }
}

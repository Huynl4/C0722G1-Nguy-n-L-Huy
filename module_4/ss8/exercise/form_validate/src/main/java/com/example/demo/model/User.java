package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Tên không được để trống")
    @Size(min = 5, max = 45)
    private String firstName;

    @NotEmpty(message = "Tên không được để trống")
    @Size(min = 5, max = 45)
    private String lastName;

    @Pattern(regexp = "^[0][0-9]{9}$")
    private String phoneNumber;

    @Min(18)
    private int age;

    @Pattern(regexp = "^[a-zA-Z0-9]+@gmail.com$")
    private String email;

    public User() {
    }

    public User(@NotEmpty(message = "Tên không được để trống") @Size(min = 5, max = 45) String firstName, String lastName, @Pattern(regexp = "^[0][0-9]{9}$") String phoneNumber, @Min(18) int age, @Pattern(regexp = "^[a-zA-Z0-9]+@gmail.com$") String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

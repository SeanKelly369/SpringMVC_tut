package com.demo.pojo;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "Username cannot be blank")
    private String username;

    @Size(min = 6, max = 20, message="Password must be between 6 and 20 characters in size")
    private String password;
    private String gender;
    private String vehicle;
    private String country;
    private String image;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

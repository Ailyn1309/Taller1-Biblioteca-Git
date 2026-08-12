package com.mycompany;

public class Customer extends Person{
    private String address;
    private String registrationDate;
    private boolean active;

    public Customer(String email, String id, String lastName, String name, String phoneNumber, boolean active, String address, String registrationDate) {
        super(email, id, lastName, name, phoneNumber);
        this.active = active;
        this.address = address;
        this.registrationDate = registrationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }
}

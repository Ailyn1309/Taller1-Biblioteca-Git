package com.mycompany;

public class Customer extends Person{
   private String email;

    public Customer(String id, String name, String phoneNumber, String email) {
        super(id, name, phoneNumber);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString()+"Customer{" +
                "email='" + email + '\'' +
                '}';
    }
}

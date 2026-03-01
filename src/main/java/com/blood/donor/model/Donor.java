package com.blood.donor.model;

public class Donor {
    private String name;
    private String blood;
    private String city;
    private String phone;

    // Constructors
    public Donor() {}
    public Donor(String name, String blood, String city, String phone) {
        this.name = name;
        this.blood = blood;
        this.city = city;
        this.phone = phone;
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBlood() { return blood; }
    public void setBlood(String blood) { this.blood = blood; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
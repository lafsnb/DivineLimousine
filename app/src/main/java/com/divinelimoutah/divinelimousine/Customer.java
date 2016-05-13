package com.divinelimoutah.divinelimousine;


public class Customer {

    private String firstName;
    private String lastName;
    private int mainPhone;
    private int altPhone;
    private String street;
    private String city;
    private String state;
    private int zip;
    private boolean active = true;
    private String billTo;
    private String email;

    public Customer(String firstName, String lastName, int mainPhone,
                    int altPhone, String street, String city, String state,
                    int zip, String billTo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mainPhone = mainPhone;
        this.altPhone = altPhone;
        this.billTo = billTo;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;

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

    public int getMainPhone() {
        return mainPhone;
    }

    public void setMainPhone(int mainPhone) {
        this.mainPhone = mainPhone;
    }

    public int getAltPhone() {
        return altPhone;
    }

    public void setAltPhone(int altPhone) {
        this.altPhone = altPhone;
    }

    public String getBillTo() {
        return billTo;
    }

    public void setBillTo(String billTo) {
        this.billTo = billTo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getActive() {
        return this.active;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }



}
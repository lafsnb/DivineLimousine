package com.divinelimoutah.divinelimousine;

public class Reservation {

    private String date;
    private String pickUpTime;
    private String dropOffTime;
    private String[] pickUpAddress;
    private String[] dropOffAddress;
    private int totalHours;
    private Customer customer;
    private Vehicle vehicle;

    public Reservation(String date, String pickUpTime, String dropOffTime,
                       String[] pickUpAddress, String[] dropOffAddress, int totalHours,
                       Customer customer, Vehicle vehicle) {
        this.date = date;
        this.pickUpTime = pickUpTime;
        this.dropOffTime = dropOffTime;
        this.pickUpAddress = pickUpAddress;
        this.dropOffAddress = dropOffAddress;
        this.totalHours = totalHours;
        this.customer = customer;
        this.vehicle = vehicle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getDropOffTime() {
        return dropOffTime;
    }

    public void setDropOffTime(String dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public String[] getPickUpAddress() {
        return pickUpAddress;
    }

    public void setPickUpAddress(String[] pickUpAddress) {
        this.pickUpAddress = pickUpAddress;
    }

    public String[] getDropOffAddress() {
        return dropOffAddress;
    }

    public void setDropOffAddress(String[] dropOffAddress) {
        this.dropOffAddress = dropOffAddress;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }



}
package com.divinelimoutah.divinelimousine;

import android.media.Image;

public enum Vehicle {

    CHARGER("Charger", 10, null),
    ESCALADE("Escalade", 14, null),
    CHRYSLER("Chrysler", 10, null),
    HUMMER("Hummer", 20, null);

    private Image icon;
    private String name;
    private int seats;

    private Vehicle(String name, int seats, Image icon) {
        this.name = name;
        this.icon = icon;
        this.seats = seats;
    }

    public String getName() {
        return this.name;
    }

    public Image getIcon() {
        return icon;
    }

    public void setIcon(Image icon) {
        this.icon = icon;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}

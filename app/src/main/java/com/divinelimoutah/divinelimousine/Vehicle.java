package com.divinelimoutah.divinelimousine;

import android.media.Image;

public enum Vehicle {

    CHARGER(10, null),
    ESCALADE(14, null),
    CHRYSLER(10, null),
    HUMMER(20, null);

    private Image icon;
    private int seats;

    private Vehicle(int seats, Image icon) {
        this.icon = icon;
        this.seats = seats;
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

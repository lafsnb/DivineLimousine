package com.divinelimoutah.divinelimousine;

import android.media.Image;

public abstract class Vehicle {

    private Image icon;
    private String name;
    private int seats;

//    public Vehicle(String name, int seats, Image icon) (
//        this.name = name;
//        this.seats = seats;
//        this.icon = icon;
//    )

    public abstract String getName();

    public abstract Image getIcon();

    public abstract void setIcon(Image icon);

    public abstract int getSeats();

//    public abstract void setSeats(int seats);


}

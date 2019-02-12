package Stalls;

import Interfaces.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private String owner;
    private int parkingBay;
    private int rating;

    public Stall(String name, String owner, int parkingBay, int rating) {
        this.name = name;
        this.owner = owner;
        this.parkingBay = parkingBay;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getOwner() {
        return owner;
    }

    public int getParkingBay() {
        return parkingBay;
    }
}



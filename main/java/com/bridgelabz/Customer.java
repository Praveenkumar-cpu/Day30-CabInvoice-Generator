package com.bridgelabz;

public class Customer {

    private Ride[] rides;
    private int id;

    public Customer(Ride[] rides, int id) {
        this.rides = rides;
        this.id = id;
    }

    public Ride[] getRides() {
        return rides;
    }

    public void setRides(Ride[] rides) {
        this.rides = rides;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

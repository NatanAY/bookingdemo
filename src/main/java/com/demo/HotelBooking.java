package com.demo;

import javax.persistence.*;

@Entity
@Table(name = "hotel_booking")
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;


    public HotelBooking() {
    }

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNbOfNights() {
        return nbOfNights;
    }

    public void setNbOfNights(int nbOfNights) {
        this.nbOfNights = nbOfNights;
    }

    public double getTotalPrice() {
        return pricePerNight * nbOfNights;
    }

}
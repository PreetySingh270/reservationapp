package com.reservationapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "bus")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "available_seats")
    private int availableSeats;

    @Column(name = "price")
    private double price;

    @Column(name = "total_seats")
    private int totalSeats;

    @Column(name = "bus_number")
    private String busNumber;

    @Column(name = "bus_type")
    private String busType;

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }



}



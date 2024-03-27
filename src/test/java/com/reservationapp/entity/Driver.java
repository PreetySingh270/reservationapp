package com.reservationapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId; // Primary Key

    private String name;
    private String driverLicenseNumber;
    private String addNumber;
    private String address;
    private String contactNumber;
    private String alternateContactNumber;
    private String email;


    // Constructors, getters, and setters
}


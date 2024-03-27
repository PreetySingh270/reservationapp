package com.reservationapp.paylod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusDto {
    private String busNumber;
    private String busType;
    private int totalSeats;
    private double price;
    private int availableSeats;

}
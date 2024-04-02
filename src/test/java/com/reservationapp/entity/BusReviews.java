package com.reservationapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "bus_reviews")

public class BusReviews {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "bus_id") // Ensure consistent naming with the database column
        private Long busId;

        @Column(name = "rating")
        private int rating;

        @Column(name = "comment")
        private String comment;

        @Column(name = "review_date")
        private Date reviewDate;
    }



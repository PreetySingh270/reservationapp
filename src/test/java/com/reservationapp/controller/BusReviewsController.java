package com.reservationapp.controller;

import com.reservationapp.entity.BusReviews;
import com.reservationapp.service.BusReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/api/v1/bus-reviews")
    public class BusReviewsController {

        @Autowired
        private BusReviewsService busReviewService;

        // Endpoint to create a new bus review
        @PostMapping
        public ResponseEntity<BusReviews> createBusReview(@RequestBody BusReviews busReviews) {
            BusReviews createdBusReview = busReviewService.createBusReview(busReviews);
            return new ResponseEntity<>(createdBusReview, HttpStatus.CREATED);
        }



    }



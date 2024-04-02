package com.reservationapp.service;

import com.reservationapp.entity.Bus;
import com.reservationapp.entity.BusReviews;
import com.reservationapp.repository.BusRepository;
import com.reservationapp.repository.BusReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BusReviewsService {

        @Autowired
        private BusReviewsRepository busReviewsRepository;

        @Autowired
        private BusRepository busRepository;
        @Transactional
        public BusReviews createBusReview(BusReviews busReview) {
            Bus bus = busRepository.findById(busReview.getBusId())
                    .orElseThrow(() -> new IllegalArgumentException("Bus not found with id: " + busReview.getBusId()));

            return busReviewsRepository.save(busReview);
        }
    }



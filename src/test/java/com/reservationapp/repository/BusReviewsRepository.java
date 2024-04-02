package com.reservationapp.repository;

import com.reservationapp.entity.BusReviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BusReviewsRepository extends JpaRepository<BusReviews, Long> {


    }



package com.reservationapp.service;

import com.reservationapp.entity.Bus;
import com.reservationapp.entity.SubRoute;
import com.reservationapp.exception.ResourceNotFound;
import com.reservationapp.repository.BusRepository;
import com.reservationapp.repository.RouteRepository;
import com.reservationapp.repository.SubRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SubRouteService {

        @Autowired
        private SubRouteRepository subRouteRepository;

        @Autowired
        private RouteRepository routeRepository;

        @Autowired
        private BusRepository busRepository;

        public SubRoute createSubRoute(Long busId, SubRoute subRoute) {
            // Ensure the bus exists
            Bus bus = busRepository.findById(busId)
                    .orElseThrow(() -> new ResourceNotFound("Bus not found with id: " + busId));

            // Set the busId for the subroute
            subRoute.setBusId(busId);

            // You might have additional validation or business logic here

            // Save the subroute
            return subRouteRepository.save(subRoute);
        }

        // Other service methods can be added here for additional functionalities related to SubRoutes
    }



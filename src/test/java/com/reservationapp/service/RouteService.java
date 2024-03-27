package com.reservationapp.service;

import com.reservationapp.entity.Bus;
import com.reservationapp.entity.Route;
import com.reservationapp.exception.ResourceNotFound;
import com.reservationapp.repository.BusRepository;
import com.reservationapp.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private BusRepository busRepository;

    public Route createRoute(Long busId, Route route) {
        // You can perform any necessary validation or business logic here

        // Retrieve the bus from the database using its ID
        Bus bus = busRepository.findById(busId).orElseThrow(
                () -> new ResourceNotFound("Bus not added")
        );

        // Check if a route already exists for the given bus
        Route r = routeRepository.findByBusId(route.getBusId());

        if (r == null) {
            routeRepository.save(route);

            return route;
        }
        return null;
    }
}
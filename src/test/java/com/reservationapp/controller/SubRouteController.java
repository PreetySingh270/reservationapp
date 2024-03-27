package com.reservationapp.controller;

import com.reservationapp.entity.SubRoute;
import com.reservationapp.service.SubRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sub_route")
public class SubRouteController {

    @Autowired
    private SubRouteService subRouteService;

    @PostMapping("/{busId}")
    public ResponseEntity<SubRoute> addSubRoute(@PathVariable Long busId, @RequestBody SubRoute subRoute) {
        SubRoute newSubRoute = subRouteService.createSubRoute(busId, subRoute);
        return new ResponseEntity<>(newSubRoute, HttpStatus.CREATED);
    }

    // Other controller methods can be added here for managing SubRoutes
}



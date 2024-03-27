package com.reservationapp.service;

import com.reservationapp.entity.Bus;
import com.reservationapp.paylod.BusDto;
import com.reservationapp.repository.BusRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;



    @Transactional
    public Bus addBus(BusDto busDto) {


        // Create a new Bus entity
        Bus bus = new Bus();
        bus.setBusNumber(busDto.getBusNumber());
        bus.setBusType(busDto.getBusType());
        bus.setTotalSeats(busDto.getTotalSeats());
        bus.setPrice(busDto.getPrice());
        bus.setAvailableSeats(busDto.getAvailableSeats());


        //save Bus and Route entities
        Bus savedBus = busRepository.save(bus);


        return bus;
    }
}
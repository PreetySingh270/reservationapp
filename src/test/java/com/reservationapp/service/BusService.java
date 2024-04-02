package com.reservationapp.service;

import com.reservationapp.entity.Bus;
import com.reservationapp.paylod.BusDto;
import com.reservationapp.repository.BusRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    // Read operation
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public Optional<Bus> getBusById(Long id) {
        return busRepository.findById(id);
    }

    // Update operation
    @Transactional
    public Bus updateBus(Long id, BusDto updatedBusDto) {
        Optional<Bus> optionalBus = busRepository.findById(id);
        if (optionalBus.isPresent()) {
            Bus bus = optionalBus.get();
            bus.setBusNumber(updatedBusDto.getBusNumber());
            bus.setBusType(updatedBusDto.getBusType());
            bus.setTotalSeats(updatedBusDto.getTotalSeats());
            bus.setPrice(updatedBusDto.getPrice());
            bus.setAvailableSeats(updatedBusDto.getAvailableSeats());
            return busRepository.save(bus);
        } else {
            // Handle not found case
            return null;
        }
    }

    // Delete operation
    @Transactional
    public void deleteBus(Long id) {
        busRepository.deleteById(id);
    }
}


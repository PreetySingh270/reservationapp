package com.reservationapp.service;

import com.reservationapp.entity.UserRegistration;
import com.reservationapp.paylod.UserRegistrationDto;
import com.reservationapp.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRegistrationRepository userRepository;

    public UserRegistrationDto createUser(UserRegistration userRegistration){
        UserRegistration save = userRepository.save(userRegistration);
        return null;
    }

    public UserRegistration getUserById(long id){
        return userRepository.findById(id).get();

    }
}
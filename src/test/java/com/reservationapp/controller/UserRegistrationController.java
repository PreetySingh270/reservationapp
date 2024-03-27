package com.reservationapp.controller;

import com.reservationapp.entity.UserRegistration;
import com.reservationapp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@RestController
@RequestMapping("/api/v1/user")
public class UserRegistrationController {
    @Autowired
private UserServiceImpl userService;
    //      http://localhost:8080/api/v1/user
    @PostMapping
    public String createUser(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("profilePicture")MultipartFile profilePicture
    ) throws IOException {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.setName(name);
        userRegistration.setEmail(email);
        userRegistration.setPassword(password);
        userRegistration.setProfilePicture(profilePicture.getBytes());
        userService.createUser(userRegistration);
        return "Done...";
    }
    //      http://localhost:8080/api/v1/user/{id}
    @GetMapping("/{id}")
    public ResponseEntity<UserRegistration> getUserById(@PathVariable long id){
        UserRegistration userById = userService.getUserById(id);
        return new ResponseEntity<>(userById, HttpStatus.FOUND);
    }

    }

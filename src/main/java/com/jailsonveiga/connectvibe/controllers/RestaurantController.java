package com.jailsonveiga.connectvibe.controllers;

import com.jailsonveiga.connectvibe.models.Restaurant;
import com.jailsonveiga.connectvibe.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @GetMapping("test")
    public ResponseEntity<?> testRoute() {
        return new ResponseEntity<>("Restaurant Route", HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> createRestaurant(@RequestBody Restaurant newRestaurant) {
        Restaurant restaurant = restaurantRepository.save(newRestaurant);

        return new ResponseEntity<>(restaurant, HttpStatus.CREATED);
    }
}

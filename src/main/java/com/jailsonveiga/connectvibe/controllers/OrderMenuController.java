package com.jailsonveiga.connectvibe.controllers;

import com.jailsonveiga.connectvibe.models.OrderMenu;
import com.jailsonveiga.connectvibe.models.Restaurant;
import com.jailsonveiga.connectvibe.repositories.OrderMenuRepository;
import com.jailsonveiga.connectvibe.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/ordermenus")
public class OrderMenuController {

    @Autowired
    private OrderMenuRepository orderMenuRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @GetMapping("/test")
    public ResponseEntity<String> testRoute() {
        return new ResponseEntity<>("OrderMenu Route", HttpStatus.OK);
    }

    @PostMapping("/{restaurantId}")
    public ResponseEntity<OrderMenu> createOrder(@PathVariable Long restaurantId, @RequestBody OrderMenu newOrderMenu) {

        Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        newOrderMenu.setRestaurant(restaurant);

        OrderMenu orderMenu = orderMenuRepository.save(newOrderMenu);

        return new ResponseEntity<>(orderMenu, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<OrderMenu>> getAllOrderMenu() {
        List<OrderMenu> ordermenu = orderMenuRepository.findAll();

        return new ResponseEntity<>(ordermenu, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderMenu> getOrderMenuById(@PathVariable Long id) {
        OrderMenu ordermenu = orderMenuRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND));

        return new ResponseEntity<>(ordermenu, HttpStatus.OK);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<List<OrderMenu>> getOrderMenuByRestaurant(@PathVariable Long restaurantId) {

        List<OrderMenu> ordermenu = orderMenuRepository.findAllByRestaurant_restaurantId(restaurantId);

        return new ResponseEntity<>(ordermenu, HttpStatus.OK);
    }
}

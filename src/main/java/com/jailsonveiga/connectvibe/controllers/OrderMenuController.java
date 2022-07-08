package com.jailsonveiga.connectvibe.controllers;

import com.jailsonveiga.connectvibe.repositories.OrderMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/ordermenus")
public class OrderMenuController {

    @Autowired
    private OrderMenuRepository orderMenuRepository;

    @GetMapping("/test")
    public ResponseEntity<String> testRoute() {
        return new ResponseEntity<>("OrderMenu Route", HttpStatus.OK);
    }
}

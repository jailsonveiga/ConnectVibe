package com.jailsonveiga.connectvibe.controllers;

import com.jailsonveiga.connectvibe.models.Waitress;
import com.jailsonveiga.connectvibe.repositories.WaitressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
//Listening for request
@RestController
@RequestMapping("/waitresses") //plural entity name
public class WaitressController {

    @Autowired
    private WaitressRepository waitressRepository;

    @GetMapping("/test")
    public ResponseEntity<String> testRoute() {
        return new ResponseEntity<>("Testing the End point", HttpStatus.OK);
    }

    //Create, Read, Update, Delete
    //Create = POST
    //Read = GET
    //Update = PUT*POST
    //Delete = DELETE

    @PostMapping("/")
    public ResponseEntity<Waitress> createWaitress(@RequestBody Waitress newWaitress) {
        Waitress waitress = waitressRepository.save(newWaitress);

        return new ResponseEntity<>(waitress, HttpStatus.CREATED);
    }
}

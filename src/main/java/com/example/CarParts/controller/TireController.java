package com.example.CarParts.controller;

import com.example.CarParts.entity.Tire;
import com.example.CarParts.service.TireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//This is to allow calls from React... NOT IMPORTANT RIGHT NOW
//@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class TireController {
    private final TireService tireService;

    @Autowired
    public TireController(@Qualifier("tireServiceImpl") TireService tireService) {
        this.tireService = tireService;
    }

    //http://localhost:8080/retrieveAllTires
    @GetMapping("/retrieveAllTires")
    public List<Tire> findAllTires() {
        return tireService.findAllTires();
    }

    //http://localhost:8080/addTire
    @PostMapping("/addTire")
    public Tire addTire(@RequestBody Tire tire) {
        tire.setTireId(0);
        tireService.saveOrUpdate(tire);
        return tire;
    }

    //http://localhost:8080/updateTire
    @PutMapping("/updateTire")
    public Tire updateTire(@RequestBody Tire updateTire) {
        tireService.saveOrUpdate(updateTire);
        return updateTire;
    }

    //This is a DELETE request to delete an existing wheel.
    //http://localhost:8080/deleteTire/1
    @DeleteMapping("/deleteTire/{tireId}")
    public String deleteTire(@PathVariable int tireId) {
        tireService.deleteTire(tireId);
        return "Deleted tire with ID: " + tireId;
    }
}
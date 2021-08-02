package com.example.CarParts.controller;

import com.example.CarParts.entity.Wheel;
import com.example.CarParts.service.WheelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is to allow calls from React... NOT IMPORTANT RIGHT NOW
//@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class WheelController {

    private final WheelService wheelService;

    @Autowired
    public WheelController(@Qualifier("wheelServiceImpl")WheelService wheelService) {
        this.wheelService = wheelService;
    }

    //http://localhost:8080/retrieveAllWheels
    @GetMapping("/retrieveAllWheels")
    public List<Wheel> findAll() {
        return wheelService.findAll();
    }

    //http://localhost:8080/addWheel
    @PostMapping("/addWheel")
    public Wheel addWheel(@RequestBody Wheel wheel) {
        wheel.setWheelId(0);
        wheelService.saveOrUpdate(wheel);
        return wheel;
    }

    //http://localhost:8080/updateWheel
    @PutMapping("/updateWheel")
    public Wheel updateWheel(@RequestBody Wheel updateWheel) {
        wheelService.saveOrUpdate(updateWheel);
        return updateWheel;
    }

    //This is a DELETE request to delete an existing wheel.
    //http://localhost:8080/deleteWheel/1
    @DeleteMapping("/deleteWheel/{wheelId}")
    public String deleteWheel(@PathVariable int wheelId) {
        wheelService.deleteById(wheelId);
        return "Deleted wheel with id : " + wheelId;
    }

}

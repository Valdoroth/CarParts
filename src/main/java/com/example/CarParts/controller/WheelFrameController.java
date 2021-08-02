package com.example.CarParts.controller;

import com.example.CarParts.dao.WheelFrameDAO;
import com.example.CarParts.entity.WheelFrame;
import com.example.CarParts.service.WheelFrameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WheelFrameController {

//    private final WheelFrameDAO wheelFrameDAO;
    private final WheelFrameService wheelFrameService;

    @Autowired
    public WheelFrameController(@Qualifier("wheelFrameServiceImpl") WheelFrameService wheelFrameService) {
        this.wheelFrameService = wheelFrameService;
    }

    @GetMapping("/findAllWheelFrames")
    public List<WheelFrame> findAll(){
     return wheelFrameService.findAll();
    }

    @PostMapping("/addWheelFrame")
    public WheelFrame addWheelFrame(@RequestBody WheelFrame wheelFrame) {
        wheelFrame.setWheelFrameId(0);
        wheelFrameService.saveOrUpdate(wheelFrame);
        return wheelFrame;
    }

    @PutMapping("/updateWheelFrame")
    public WheelFrame updateWheelFrame(@RequestBody WheelFrame wheelFrame) {
        wheelFrameService.saveOrUpdate(wheelFrame);
        return wheelFrame;
    }

    @DeleteMapping("/deleteWheelFrame/{wheelFrameId}")
    public String deleteWheelFrame(@PathVariable int wheelFrameId) {
        wheelFrameService.deleteById(wheelFrameId);
        return "Deleted wheel frame with id : " + wheelFrameId;
    }
}

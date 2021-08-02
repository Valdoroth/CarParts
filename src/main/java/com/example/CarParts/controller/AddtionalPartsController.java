package com.example.CarParts.controller;

import com.example.CarParts.entity.AdditionalFeatures;
import com.example.CarParts.service.AdditionalFeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddtionalPartsController {
    private final AdditionalFeaturesService additionalFeaturesService;

    @Autowired
    public AddtionalPartsController(@Qualifier("additionalFeaturesServiceImpl") AdditionalFeaturesService additionalFeaturesService) {
        this.additionalFeaturesService = additionalFeaturesService;
    }

    //localhost:8080/retrieveAllFeatures
    @GetMapping("/retrieveAllFeatures")
    public List<AdditionalFeatures> findAdditionalFeatures() {
        return additionalFeaturesService.findAdditionalFeatures();
    }

    @PostMapping("/addAdditionalFeatures")
    public AdditionalFeatures addAdditionalFeatures(@RequestBody AdditionalFeatures additionalFeatures) {
        additionalFeatures.setFeaturesId(0);
        additionalFeaturesService.saveOrUpdate(additionalFeatures);
        return additionalFeatures;
    }

    @PutMapping("/updateAdditionalFeatures")
    public AdditionalFeatures updateAdditionalFeatures(@RequestBody AdditionalFeatures updateAdditionalFeatures) {
        additionalFeaturesService.saveOrUpdate(updateAdditionalFeatures);
        return updateAdditionalFeatures;
    }

    @DeleteMapping("/deleteAdditionalFeatures/{additionalFeaturesId}")
    public String deleteAdditionalFeature(@PathVariable int additionalFeatureId) {
        additionalFeaturesService.deleteFeature(additionalFeatureId);
        return "Deleted additional feature with id : " + additionalFeatureId;
    }
}

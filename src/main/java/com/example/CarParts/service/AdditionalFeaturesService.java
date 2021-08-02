package com.example.CarParts.service;

import com.example.CarParts.entity.AdditionalFeatures;

import java.util.List;

public interface AdditionalFeaturesService {
    List<AdditionalFeatures> findAdditionalFeatures();
    Object findById(int featuresID);
    void saveOrUpdate(AdditionalFeatures addedFeatures);
    void deleteFeature(int featuresID);
}

package com.example.CarParts.dao;

import com.example.CarParts.entity.AdditionalFeatures;

import java.util.List;

public interface AdditionalFeaturesDAO {
    List<AdditionalFeatures> findAdditionalFeatures();
    Object findById(int featuresID);
    void saveOrUpdate(AdditionalFeatures addedFeatures);
    void deleteFeature(int featuresID);
}

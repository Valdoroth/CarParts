package com.example.CarParts.service;

import com.example.CarParts.dao.AdditionalFeaturesDAO;
import com.example.CarParts.entity.AdditionalFeatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdditionalFeaturesServiceImpl implements AdditionalFeaturesService {
    private final AdditionalFeaturesDAO additionalFeaturesDAO;

    @Autowired
    public AdditionalFeaturesServiceImpl(AdditionalFeaturesDAO additionalFeaturesDAO) {
        this.additionalFeaturesDAO = additionalFeaturesDAO;
    }

    @Override
    public List<AdditionalFeatures> findAdditionalFeatures() {
        return this.additionalFeaturesDAO.findAdditionalFeatures();
    }

    @Override
    public Object findById(int featuresID) {
        return this.additionalFeaturesDAO.findById(featuresID);
    }

    @Override
    public void saveOrUpdate(AdditionalFeatures addedFeatures) {
        this.additionalFeaturesDAO.saveOrUpdate(addedFeatures);
    }

    @Override
    public void deleteFeature(int featuresID) {
        this.additionalFeaturesDAO.deleteFeature(featuresID);
    }

}

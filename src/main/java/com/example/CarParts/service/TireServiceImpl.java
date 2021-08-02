package com.example.CarParts.service;

import com.example.CarParts.dao.TireDAO;
import com.example.CarParts.entity.Tire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TireServiceImpl implements TireService {

    private final TireDAO tireDAO;

    @Autowired
    public TireServiceImpl(TireDAO tireDAO) {
        this.tireDAO = tireDAO;
    }

    @Override
    public List<Tire> findAllTires() {
        return tireDAO.findAllTires();
    }

    @Override
    public Object findById(int tireId) {
        return tireDAO.findById(tireId);
    }

    @Override
    public void saveOrUpdate(Tire theTire) {
        tireDAO.saveOrUpdate(theTire);
    }

    @Override
    public void deleteTire(int tireId) {
        tireDAO.deleteTire(tireId);
    }
}

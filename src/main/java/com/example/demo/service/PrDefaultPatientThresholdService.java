package com.example.demo.service;

import com.example.demo.model.PrDefaultPatientThreshold;
import com.example.demo.repository.PrDefaultPatientThresholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrDefaultPatientThresholdService {

    @Autowired
    private PrDefaultPatientThresholdRepository repository;

    public List<PrDefaultPatientThreshold> findAll() {
        return repository.findAll();
    }

    public Optional<PrDefaultPatientThreshold> findById(String id) {
        return repository.findById(id);
    }

    public PrDefaultPatientThreshold save(PrDefaultPatientThreshold CsAdditionalInfo) {
        return repository.save(CsAdditionalInfo);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public List<PrDefaultPatientThreshold> findByName(String name) {
        return repository.findByThresholdType(name);
    }
}

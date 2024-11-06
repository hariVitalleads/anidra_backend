package com.example.demo.service;

import com.example.demo.model.CsAdditionalInfo;
import com.example.demo.repository.CsAdditionalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CsAdditionalInfoService {

    @Autowired
    private CsAdditionalInfoRepository repository;

    public List<CsAdditionalInfo> findAll() {
        return repository.findAll();
    }

    public Optional<CsAdditionalInfo> findById(String id) {
        return repository.findById(id);
    }

    public CsAdditionalInfo save(CsAdditionalInfo CsAdditionalInfo) {
        return repository.save(CsAdditionalInfo);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public List<CsAdditionalInfo> findByName(String name) {
        return repository.findByName(name);
    }
}

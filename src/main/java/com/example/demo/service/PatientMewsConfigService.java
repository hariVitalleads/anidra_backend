package com.example.demo.service;

import com.example.demo.model.PatientMewsConfig;
import com.example.demo.repository.PatientMewsConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientMewsConfigService {

    @Autowired
    private PatientMewsConfigRepository repository;

    public List<PatientMewsConfig> findAll() {
        return repository.findAll();
    }

    public PatientMewsConfig findByConfigId(Integer configId) {
        return repository.findByConfigId(configId);
    }

    public PatientMewsConfig findBySpo2Min(Integer spo2Min) {
        return repository.findBySpo2Min(spo2Min);
    }

    public PatientMewsConfig findBySpo2Max(Integer spo2Max) {
        return repository.findByConfigId(spo2Max);
    }

    public PatientMewsConfig findByPrMin(Integer prMin) {
        return repository.findByPrMin(prMin);
    }

    public PatientMewsConfig findByPrMax(Integer prMax) {
        return repository.findByPrMax(prMax);
    }

    public PatientMewsConfig findByRespMin(Integer respMin) {
        return repository.findByRespMin(respMin);
    }

    public PatientMewsConfig findByRespMax(Integer respMax) {
        return repository.findByRespMax(respMax);
    }

    public PatientMewsConfig findByTempMin(Integer tempMin) {
        return repository.findByTempMin(tempMin);
    }

    public PatientMewsConfig findBySysMin(Integer sysMin) {
        return repository.findBySysMin(sysMin);
    }

    public PatientMewsConfig findBySysMax(Integer sysMax) {
        return repository.findBySysMax(sysMax);
    }

    public PatientMewsConfig findByDiaMin(Integer diaMin) {
        return repository.findByDiaMin(diaMin);
    }

    public PatientMewsConfig findByDiaMax(Integer diaMax) {
        return repository.findByDiaMax(diaMax);
    }

}

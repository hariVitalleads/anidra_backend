package com.example.demo.repository;

import com.example.demo.model.PatientMewsConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientMewsConfigRepository extends JpaRepository<PatientMewsConfig, Integer> {

    @Query("SELECT p FROM PatientMewsConfig p")
    List<PatientMewsConfig> findAll();

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.configId = :configId")
    PatientMewsConfig findByConfigId(Integer configId);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.spo2Min = :spo2Min")
    PatientMewsConfig findBySpo2Min(Integer spo2Min);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.spo2Max = :spo2Max")
    PatientMewsConfig findBySpo2Max(Integer spo2Max);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.prMin = :prMin")
    PatientMewsConfig findByPrMin(Integer prMin);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.prMax = :prMax")
    PatientMewsConfig findByPrMax(Integer prMax);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.respMin = :respMin")
    PatientMewsConfig findByRespMin(Integer respMin);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.respMax = :respMax")
    PatientMewsConfig findByRespMax(Integer respMax);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.tempMin = :tempMin")
    PatientMewsConfig findByTempMin(Integer tempMin);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.tempMax = :tempMax")
    PatientMewsConfig findByTempMax(Integer tempMax);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.sysMin = :sysMin")
    PatientMewsConfig findBySysMin(Integer sysMin);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.sysMax = :sysMax")
    PatientMewsConfig findBySysMax(Integer sysMax);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.diaMin = :diaMin")
    PatientMewsConfig findByDiaMin(Integer diaMin);

    @Query("SELECT p FROM PatientMewsConfig p WHERE p.sysMax = :sysMax")
    PatientMewsConfig findByDiaMax(Integer diaMax);
}

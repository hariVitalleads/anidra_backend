package com.example.demo.repository;

import com.example.demo.model.CsAdditionalInfo;
import com.example.demo.model.PrDefaultPatientThreshold;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PrDefaultPatientThresholdRepository extends JpaRepository<PrDefaultPatientThreshold, String> {

    @Query("SELECT b FROM PrDefaultPatientThreshold b WHERE b.thresholdType = :thresholdType")
    List<PrDefaultPatientThreshold> findByThresholdType(@Param("thresholdType") String thresholdType);

}

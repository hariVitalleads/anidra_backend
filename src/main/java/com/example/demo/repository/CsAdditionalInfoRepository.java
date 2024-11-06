package com.example.demo.repository;

import com.example.demo.model.CsAdditionalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CsAdditionalInfoRepository extends JpaRepository<CsAdditionalInfo, String> {

    @Query("SELECT b FROM CsAdditionalInfo b WHERE b.name = :name")
    List<CsAdditionalInfo> findByName(@Param("name") String name);

}

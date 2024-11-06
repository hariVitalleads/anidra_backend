package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
@Table(name = "default_patient_threshold", catalog = "anidra")
@AllArgsConstructor
public class PrDefaultPatientThreshold implements Serializable {

    @Id
    @Column(name = "THRESHOLD_TYPE", unique = true, nullable = false, length = 20)
    private String thresholdType;

    @Column(name = "SPO2_MAX", nullable = false, precision = 3, scale = 0)
    private BigDecimal spo2_max_val;

    @Column(name = "SPO2_MIN", nullable = false, precision = 3, scale = 0)
    private BigDecimal spo2_min_val;

    @Column(name = "RESP_RATE_MAX", nullable = false, precision = 3, scale = 0)
    private BigDecimal resp_max_val;

    @Column(name = "RESP_RATE_MIN", nullable = false, precision = 3, scale = 0)
    private BigDecimal resp_min_val;

    @Column(name = "PULSE_RATE_MAX", nullable = false, precision = 3, scale = 0)
    private BigDecimal pr_max_val;

    @Column(name = "PULSE_RATE_MIN", nullable = false, precision = 3, scale = 0)
    private BigDecimal pr_min_val;

    @Column(name = "TEMPERATURE_MAX", nullable = false, precision = 3, scale = 1)
    private BigDecimal temp_max_val;

    @Column(name = "TEMPERATURE_MIN", nullable = false, precision = 3, scale = 1)
    private BigDecimal temp_min_val;

    @Column(name = "SYS_PRESSURE_MAX", nullable = false, precision = 3, scale = 0)
    private BigDecimal sys_max_val;

    @Column(name = "SYS_PRESSURE_MIN", nullable = false, precision = 3, scale = 0)
    private BigDecimal sys_min_val;

    @Column(name = "DIA_PRESSURE_MAX", nullable = false, precision = 3, scale = 0)
    private BigDecimal dia_max_val;

    @Column(name = "DIA_PRESSURE_MIN", nullable = false, precision = 3, scale = 0)
    private BigDecimal dia_min_val;

    public PrDefaultPatientThreshold() {

    }


}

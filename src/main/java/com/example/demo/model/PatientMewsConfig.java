package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "patient_mews_config", catalog = "anidra")
@AllArgsConstructor
public class PatientMewsConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "config_id")
    private Integer configId;

    @Basic(optional = false)
    @NotNull
    @Column(name = "spo2_min")
    private int spo2Min;

    @Basic(optional = false)
    @NotNull
    @Column(name = "spo2_max")
    private int spo2Max;

    @Basic(optional = false)
    @NotNull
    @Column(name = "pr_min")
    private int prMin;

    @Basic(optional = false)
    @NotNull
    @Column(name = "pr_max")
    private int prMax;

    @Basic(optional = false)
    @NotNull
    @Column(name = "resp_min")
    private int respMin;

    @Basic(optional = false)
    @NotNull
    @Column(name = "resp_max")
    private int respMax;

    @Basic(optional = false)
    @NotNull
    @Column(name = "temp_min")
    private int tempMin;

    @Basic(optional = false)
    @NotNull
    @Column(name = "temp_max")
    private int tempMax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sys_min")
    private int sysMin;

    @Basic(optional = false)
    @NotNull
    @Column(name = "sys_max")
    private int sysMax;

    @Basic(optional = false)
    @NotNull
    @Column(name = "dia_min")
    private int diaMin;

    @Basic(optional = false)
    @NotNull
    @Column(name = "dia_max")
    private int diaMax;

    @JoinColumn(name = "patient_key", referencedColumnName = "PATIENT_KEY")
    @OneToOne(optional = false)
    private PrPatient patientKey;

}

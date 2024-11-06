package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name = "fc_hospital", catalog = "anidra")
public class FcHospital implements Serializable {

    @Column(name = "HOSPITAL_KEY", unique = true, nullable = false, length = 20)
    private String hospitalKey;

    @Column(name = "HOSPITAL_ID", nullable = false, length = 15)
    private String hospitalId;

    @Column(name = "HOSPITAL_NAME", nullable = false, length = 100)
    private String hospitalName;

    @Column(name = "PHONE_PRIMARY", nullable = false, length = 14)
    private String phonePrimary;

    @Column(name = "EMAIL_ID", nullable = false, length = 100)
    private String emailId;

    @Column(name = "PHONE_SECONDARY", nullable = false, length = 14)
    private String phoneSecondary;

    @Column(name = "CREATE_TIMESTAMP", nullable = false, length = 19)
    private Date createTimestamp;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MODIFY_TIMESTAMP", nullable = true, length = 19)
    private Date modifyTimestamp;

    @Column(name = "CREATE_USERID", nullable = false, length = 40)
    private String createUserid;

    @Column(name = "MODIFY_USERID", nullable = false, length = 40)
    private String modifyUserid;

    @Column(name = "CREATE_APPID", nullable = true, length = 40)
    private String createAppid;

    @Column(name = "MODIFY_APPID", nullable = true, length = 40)
    private String modifyAppid;

    @Column(name = "COMMENTS", nullable = true, length = 1000)
    private String comments;

    @Column(name = "REGISTERED_ID", nullable = true, length = 40)
    private String registeredId;

    @Column(name = "REGISTERED_ID_TYPE", nullable = true, length = 20)
    private String registeredIdType;

    @Column(name = "REGISTERED_ID_COUNTRY", nullable = true, length = 20)
    private String registeredIdCountry;

    @Column(name = "TIME_ZONE", nullable = false, length = 15)
    private String timeZone;

    @Column(name = "ADDRESS_LINE_1", nullable = false, length = 70)
    private String addressLine1;

    @Column(name = "ADDRESS_LINE_2", nullable = true, length = 70)
    private String addressLine2;

    @Column(name = "ADDRESS_LINE_3", nullable = true, length = 70)
    private String addressLine3;

    @Column(name = "ADDRESS_LINE_4", nullable = true, length = 70)
    private String addressLine4;

    @Column(name = "CITY", nullable = false, length = 35)
    private String city;

    @Column(name = "STATE", nullable = false, length = 35)
    private String state;

    @Column(name = "ZIP_CODE", nullable = false, length = 6)
    private String zipCode;

    @Column(name = "STATUS", nullable = true, length = 40)
    private String status;

    @Column(name = "COUNTRY", nullable = false, length = 40)
    private String country;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fcHospital")
    private Set<PrPatient> prPatients = new HashSet<PrPatient>(0);

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fcHospital")
//    private Set<PrPatientAdmission> prPatientAdmissions = new HashSet<PrPatientAdmission>(0);
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fcHospital")
//    private Set<ScUser> scUsers = new HashSet<ScUser>(0);
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fcHospital")
//    private Set<PrDoctor> prDoctors = new HashSet<PrDoctor>(0);
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fcHospital")
//    private Set<PrNurse> prNurses = new HashSet<PrNurse>(0);
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fcHospital")
//    private Set<ScUserGroup> scUserGroups = new HashSet<ScUserGroup>(0);
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fcHospital")
//    private Set<AlgoSubscription> algoSubscriptions = new HashSet<AlgoSubscription>(0);

}

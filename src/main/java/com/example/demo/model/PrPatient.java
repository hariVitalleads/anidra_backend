package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pr_patient", catalog = "anidra",
        uniqueConstraints = {@UniqueConstraint(columnNames = "PATIENT_ID"), @UniqueConstraint(columnNames = "PHONE_PRIMARY"), @UniqueConstraint(columnNames = {"REGISTERED_ID", "REGISTERED_ID_TYPE", "REGISTERED_ID_CONTRY"})}
)
public class PrPatient implements Serializable {


    @NotNull
    private Character sex;
    //@Column(name = "EMAIL_VERIFICATION_STATUS")
    private char emailVerificationStatus;
    private Character primaryPhoneVerStatus;
    private Character secondaryPhoneVerStatus;
    private Character emergencyPhoneVerStatus;
    //@Size(max = 20)
    //private String userKey;
    @NotNull
    @Size(min = 1, max = 1)
    private String status;
    private PatientMewsConfig patientMewsConfig;


    private String patientKey;
    private FcHospital fcHospital;
    private String patientId;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private Date dob;
    //private char sex;
    private String phonePrimary;
    private String emailId;
    private String phoneSecondary;
    private Date createTimestamp;
    private Date modifyTimestamp;
    private String createUserid;
    private String modifyUserid;
    private String createAppid;
    private String modifyAppid;
    private String comments;
    private String preExistingConditions;
    private String job;
    private String jobTitle;
    private String registeredId;
    private String registeredIdType;
    private String registeredIdContry;
    private String emergencyContact;
    private String emergencyPhone;
    private String emergencyPhone2;
    private String emergencyRelationship;
    private String alternateEmailId;
    // private String status;
    // private char emailVerificationStatus;
    // private char primaryPhoneVerStatus;
    // private char secondaryPhoneVerStatus;
    // private char emergencyPhoneVerStatus;
    private String timeZone;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String city;
    private String state;
    private String zipCode;
    private String countryResidence;

//    private ScUser scUser;
//    private Set<PrPatientAdmission> prPatientAdmissions = new HashSet<PrPatientAdmission>(0);
    private String userType;
    private String planType;
    private String primaryISD;
    private String firebaseID;
    private int invCount;

}

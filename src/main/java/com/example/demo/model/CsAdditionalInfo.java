package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(
    name = "cs_additional_info",
    catalog = "anidra",
    uniqueConstraints = @UniqueConstraint(columnNames = {"PARENT_TABLE", "PARENT_KEY", "NAME"})
)
public class CsAdditionalInfo implements Serializable {

    @Column(name = "ADDITIONAL_INFO_KEY", columnDefinition = "varchar", unique = true, nullable = false)
    private String additionalInfoKey;

    @Column(name = "PARENT_TABLE", nullable = false, length = 50)
    private String parentTable;

    @Column(name = "PARENT_KEY", nullable = false, length = 25)
    private String parentKey;

    @Id
    @Column(name = "NAME", nullable = false, length = 40)
    private String name;

    @Column(name = "INFO_GROUP", nullable = false, length = 50)
    private String infoGroup;

    @Column(name = "CHAR_VALUE", nullable = false, length = 4000)
    private String charValue;

    @Column(name = "INTEGER_VALUE", nullable = false, precision = 20, scale = 0)
    private BigDecimal integerValue;

    @Column(name = "DOUBLE_VALUE", nullable = false, precision = 14, scale = 4)
    private BigDecimal doubleValue;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIMESTAMP", nullable = false, length = 19)
    private Date createTimestamp;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MODIFY_TIMESTAMP", nullable = false, length = 19)
    private Date modifyTimestamp;

    @Column(name = "CREATE_USERID", nullable = false, length = 50)
    private String createUserid;

    @Column(name = "MODIFY_USERID", nullable = false, length = 50)
    private String modifyUserid;

    @Column(name = "CREATE_APPLICATION", nullable = false, length = 50)
    private String createApplication;

    @Column(name = "MODIFY_APPLICATION", nullable = false, length = 50)
    private String modifyApplication;

    public CsAdditionalInfo() {
    }

    public CsAdditionalInfo(String additionalInfoKey, String parentTable, String parentKey, String name, String infoGroup, String charValue, BigDecimal integerValue, BigDecimal doubleValue, Date createTimestamp, Date modifyTimestamp, String createUserid, String modifyUserid, String createApplication, String modifyApplication) {
        this.additionalInfoKey = additionalInfoKey;
        this.parentTable = parentTable;
        this.parentKey = parentKey;
        this.name = name;
        this.infoGroup = infoGroup;
        this.charValue = charValue;
        this.integerValue = integerValue;
        this.doubleValue = doubleValue;
        this.createTimestamp = createTimestamp;
        this.modifyTimestamp = modifyTimestamp;
        this.createUserid = createUserid;
        this.modifyUserid = modifyUserid;
        this.createApplication = createApplication;
        this.modifyApplication = modifyApplication;
    }
}

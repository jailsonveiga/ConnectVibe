package com.jailsonveiga.connectvibe.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//entity, table database
//Let springBoot know this is model part of database
@Entity
public class Waitress {
    @Id
    //Let sql to generate the value automatic
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Properties
    private Long waitressId;
    private String waitressName;
    private String waitressGender;
    private Integer waitressAge;
    private String waitressSection;
    private Byte waitressTable;

    //Default Constructor
    public Waitress() {
    }

    //Constructor
    public Waitress(Long waitressId, String waitressName, String waitressGender, Integer waitressAge, String waitressSection, Byte waitressTable) {
        this.waitressId = waitressId;
        this.waitressName = waitressName;
        this.waitressGender = waitressGender;
        this.waitressAge = waitressAge;
        this.waitressSection = waitressSection;
        this.waitressTable = waitressTable;
    }

    //Getter and Setter
    public Long getWaitressId() {
        return waitressId;
    }

    public void setWaitressId(Long waitressId) {
        this.waitressId = waitressId;
    }

    public String getWaitressName() {
        return waitressName;
    }

    public void setWaitressName(String waitressName) {
        this.waitressName = waitressName;
    }

    public String getWaitressGender() {
        return waitressGender;
    }

    public void setWaitressGender(String waitressGender) {
        this.waitressGender = waitressGender;
    }

    public Integer getWaitressAge() {
        return waitressAge;
    }

    public void setWaitressAge(Integer waitressAge) {
        this.waitressAge = waitressAge;
    }

    public String getWaitressSection() {
        return waitressSection;
    }

    public void setWaitressSection(String waitressSection) {
        this.waitressSection = waitressSection;
    }

    public Byte getWaitressTable() {
        return waitressTable;
    }

    public void setWaitressTable(Byte waitressTable) {
        this.waitressTable = waitressTable;
    }
}

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
    private String waitressSection;
    private Integer waitressTable;

    public Waitress() {
    }

    //Constructor
    public Waitress(Long waitressId, String waitressName, String waitressSection, Integer waitressTable) {
        this.waitressId = waitressId;
        this.waitressName = waitressName;
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

    public String getWaitressSection() {
        return waitressSection;
    }

    public void setWaitressSection(String waitressSection) {
        this.waitressSection = waitressSection;
    }

    public Integer getWaitressTable() {
        return waitressTable;
    }

    public void setWaitressTable(Integer waitressTable) {
        this.waitressTable = waitressTable;
    }
}

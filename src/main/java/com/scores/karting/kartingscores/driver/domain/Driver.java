package com.scores.karting.kartingscores.driver.domain;

import com.scores.karting.kartingscores.timerecord.domain.TimeRecord;

import javax.persistence.*;
import java.util.List;

@Entity
public class Driver {

    @Id
    @GeneratedValue
    private int diverId;
    private String driverUID;
    private String imageURL;
    private String name;
    private String team;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "driver")
    private List<TimeRecord> timeRecords;

}

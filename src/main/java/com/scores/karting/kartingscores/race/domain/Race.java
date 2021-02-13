package com.scores.karting.kartingscores.race.domain;

import com.scores.karting.kartingscores.timerecord.domain.TimeRecord;

import javax.persistence.*;
import java.util.List;

@Entity
public class Race {

    @Id
    @GeneratedValue
    private int raceId;
    private String raceUID;
    private String name;
    private final int totalLaps = 10;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "race")
    private List<TimeRecord> timeRecords;
}

package com.scores.karting.kartingscores.timerecord.domain;

import com.scores.karting.kartingscores.driver.domain.Driver;
import com.scores.karting.kartingscores.race.domain.Race;

import javax.persistence.*;

@Entity
public class TimeRecord {

    @Id
    @GeneratedValue
    private int timeRecordId;
    private int lap;
    private int year;

    @ManyToOne
    @JoinColumn(name = "FK_TIMERECORD_DRIVER", nullable = false, updatable = false)
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "FK_TIMERECORD_RACE", nullable = false, updatable = false)
    private Race race;
}

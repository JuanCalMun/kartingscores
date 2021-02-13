package com.scores.karting.kartingscores.race.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Race {

    @Id
    @GeneratedValue
    private int raceId;
    private String raceUID;
    private String name;
    private final int totalLaps = 10;
}

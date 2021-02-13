package com.scores.karting.kartingscores.driver.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Driver {

    @Id
    @GeneratedValue
    private int diverId;
    private String driverUID;
    private String imageURL;
    private String name;
    private String team;

}

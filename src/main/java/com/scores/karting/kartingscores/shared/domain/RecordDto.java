package com.scores.karting.kartingscores.shared.domain;

import lombok.Data;

import java.util.List;

@Data
public class RecordDto {
    private String id;
    private String picture;
    private int age;
    private String name;
    private String team;
    private List<RaceTimesDto> raceTimesDtoList;
}

package com.scores.karting.kartingscores.shared.application.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class InputRecordJsonDto {

    @JsonProperty("_id")
    private String id;
    private String picture;
    private int age;
    private String name;
    private String team;
    @JsonProperty("races")
    private List<RaceTimesJsonDto> raceTimesDtoList;
}

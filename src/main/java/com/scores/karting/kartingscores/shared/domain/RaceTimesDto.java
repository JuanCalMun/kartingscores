package com.scores.karting.kartingscores.shared.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RaceTimesDto {
    private String name;

    @JsonProperty("laps")
    private List<TimeDto> laps;
}

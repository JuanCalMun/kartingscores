package com.scores.karting.kartingscores.shared.application.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RaceTimesJsonDto {
    private String name;

    @JsonProperty("laps")
    private List<TimeJsonDto> laps;
}

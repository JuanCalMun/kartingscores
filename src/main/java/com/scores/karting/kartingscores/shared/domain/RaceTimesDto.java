package com.scores.karting.kartingscores.shared.domain;

import lombok.Data;

import java.util.List;

@Data
public class RaceTimesDto {
    private String name;
    private List<String> times;
}

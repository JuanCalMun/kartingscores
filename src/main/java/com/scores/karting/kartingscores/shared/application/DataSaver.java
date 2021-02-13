package com.scores.karting.kartingscores.shared.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scores.karting.kartingscores.shared.application.data.InputRecordJsonDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class DataSaver {

    public void save(final String records) {

        Optional<List<InputRecordJsonDto>> inputRecordDtoList = Optional.empty();

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            InputRecordJsonDto[] inputRecordDtos = objectMapper.readValue(records, InputRecordJsonDto[].class);
            inputRecordDtoList = Optional.of(List.of(inputRecordDtos));
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        log.info(inputRecordDtoList.orElse(Collections.emptyList()));
    }

}

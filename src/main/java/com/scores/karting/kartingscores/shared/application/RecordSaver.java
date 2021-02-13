package com.scores.karting.kartingscores.shared.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scores.karting.kartingscores.shared.domain.InputRecordDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class RecordSaver {

    public void save(final String records) {

        Optional<List<InputRecordDto>> inputRecordDtoList = Optional.empty();

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            InputRecordDto[] inputRecordDtos = objectMapper.readValue(records, InputRecordDto[].class);
            inputRecordDtoList = Optional.of(List.of(inputRecordDtos));
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        log.info(inputRecordDtoList.orElse(Collections.emptyList()));
    }

}

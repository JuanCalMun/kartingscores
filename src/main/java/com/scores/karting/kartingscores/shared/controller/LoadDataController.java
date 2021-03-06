package com.scores.karting.kartingscores.shared.controller;

import com.scores.karting.kartingscores.shared.application.DataSaver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/record")
public class LoadDataController {

    @Autowired
    private DataSaver recordSaver;

    @PostMapping(value = "/load")
    public ResponseEntity saveRecords(@RequestBody String recordsJson){

        recordSaver.save(recordsJson);
        return new ResponseEntity(HttpStatus.OK);
    }
}

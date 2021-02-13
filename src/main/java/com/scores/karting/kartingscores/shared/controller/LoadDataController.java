package com.scores.karting.kartingscores.shared.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/record")
public class LoadDataController {

    @PostMapping(value = "/load")
    public ResponseEntity saveRecords(@RequestBody String recordsJson){

        return new ResponseEntity(HttpStatus.OK);
    }
}

package com.example.controller;

import com.example.model.AllDataResponse;
import com.example.repositary.CaliforniaHousingRepositary;
import com.example.service.DataInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    CaliforniaHousingRepositary californiaHousingRepositary;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataInterface dataInterface;


    @GetMapping("/all")
    public ResponseEntity<?> getAllData(){
        AllDataResponse allDataResponse = new AllDataResponse();
        allDataResponse.setColumn(dataInterface.getAllColumn());
        allDataResponse.setData(dataInterface.getAllData());

        return ResponseEntity.ok(allDataResponse);
    }


    @GetMapping("/query")
    public ResponseEntity<?> getQueriedData(@RequestParam String query){
        try {
            if(query != null && !query.equals("")) {
                return ResponseEntity.ok(dataInterface.getQueryResponse(query));
            } else {
                return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e){
            return ResponseEntity.ok(e.getMessage());
        }
    }
}

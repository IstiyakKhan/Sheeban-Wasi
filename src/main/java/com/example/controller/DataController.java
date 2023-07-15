package com.example.controller;

import com.example.model.AllDataResponse;
import com.example.model.ErrorResponse;
import com.example.repositary.CaliforniaHousingRepositary;
import com.example.service.DataInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class DataController {

    @Autowired
    CaliforniaHousingRepositary californiaHousingRepositary;

    @Autowired
    JdbcTemplate jdbcTemplate;

    private String errorMessage = "Something Went Wrong. Please Enter Proper Query";

    private String queryisEmpty = "Query is Empty";

    @Autowired
    DataInterface dataInterface;

    private com.example.model.ErrorResponse errorResponse;


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
                return getErrorResponseEntity(queryisEmpty, 400, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e){
            return getErrorResponseEntity(e.getMessage(), 500, HttpStatus.BAD_GATEWAY);
        }
    }

    public ResponseEntity<?> getErrorResponseEntity(String errorMessage, int errorCode, HttpStatus httpStatus) {
        errorResponse = new ErrorResponse();
        errorResponse.setErroMessage(errorMessage);
        errorResponse.setErroCode(errorCode);
        return new ResponseEntity<Object>(
                errorResponse, new HttpHeaders(), httpStatus);
    }
}

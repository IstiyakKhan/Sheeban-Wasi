package com.example.service;

import com.example.model.CaliforniaHousing;
import com.example.model.QueryResponse;
import com.example.model.QueryResponse2;

import java.util.List;

public interface DataInterface {

    List<String> getAllColumn();

    List<CaliforniaHousing> getAllData();

    QueryResponse2 getQueryResponse(String query);
}

package com.example.service;

import com.example.model.CaliforniaHousing;
import com.example.model.QueryResponse;

import java.sql.Array;
import java.util.HashMap;
import java.util.List;

public interface DataInterface {

    List<String> getAllColumn();

    List<CaliforniaHousing> getAllData();

    List<QueryResponse> getQueryResponse(String query);
}

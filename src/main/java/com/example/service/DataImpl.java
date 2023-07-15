package com.example.service;

import com.example.model.CaliforniaHousing;
import com.example.model.QueryResponse;
import com.example.model.QueryResponse2;
import com.example.repositary.CaliforniaHousingRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataImpl implements DataInterface{

    @Autowired
    private CaliforniaHousingRepositary californiaHousingRepositary;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<String> getAllColumn() {
        List<String> column = new ArrayList<>();
        column.add("Median House Value");
        column.add("Median Income");
        column.add("Median Age");
        column.add("TOT Rooms");
        column.add("TOT Bedrooms");
        column.add("Population");
        column.add("Households");
        column.add("Latitude");
        column.add("Longitude");
        column.add("Distance To Coast");
        column.add("Distance To La");

        return column;
    }

    @Override
    public List<CaliforniaHousing> getAllData() {
        CaliforniaHousing californiaHousing = new CaliforniaHousing();

        List<CaliforniaHousing> allData = californiaHousingRepositary.findAllData();

        return allData;
    }

    @Override
    public QueryResponse2 getQueryResponse(String query) {
        List<QueryResponse> response = new ArrayList<>();
        QueryResponse2 queryResponse2 = new QueryResponse2();
        jdbcTemplate.query(query.toString(), new ResultSetExtractor<Object>() {
            @Override
            public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
                int row = 0;
                List<String> columnList = new ArrayList<>();
                while (rs.next()){
                    ResultSetMetaData metaData = rs.getMetaData();
                    QueryResponse result = new QueryResponse();
                    row++;
                    String data = "";
                    int columns = metaData.getColumnCount();
                    for (int i = 1; i <= columns; i++) {
                        if(row == 1) {
                            columnList.add(metaData.getColumnName(i));
                        }
                        data += rs.getString(i) + ",";
                    }
                    result.setRow(row);
                    result.setData(data.replaceAll(",+$",""));
                    response.add(result);
                }
                queryResponse2.setColumns(columnList);
                queryResponse2.setData(response);
                return null;
            }
        });
        return queryResponse2;
    }
}

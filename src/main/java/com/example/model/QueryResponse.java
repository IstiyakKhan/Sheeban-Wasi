package com.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryResponse {


    private String data;

    private int row;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}

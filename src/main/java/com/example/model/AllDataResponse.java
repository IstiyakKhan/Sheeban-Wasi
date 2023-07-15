package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class AllDataResponse {

    List<String> column;

    List<CaliforniaHousing> data;

    public List<String> getColumn() {
        return column;
    }

    public void setColumn(List<String> column) {
        this.column = column;
    }

    public void setColumn(ArrayList<String> column) {
        this.column = column;
    }

    public List<CaliforniaHousing> getData() {
        return data;
    }

    public void setData(List<CaliforniaHousing> data) {
        this.data = data;
    }
}

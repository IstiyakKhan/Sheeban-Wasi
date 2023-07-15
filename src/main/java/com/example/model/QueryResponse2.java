package com.example.model;

import java.util.List;

public class QueryResponse2 {

   List<String> columns;

   List<QueryResponse> data;

   public List<String> getColumns() {
      return columns;
   }

   public void setColumns(List<String> columns) {
      this.columns = columns;
   }

   public List<QueryResponse> getData() {
      return data;
   }

   public void setData(List<QueryResponse> data) {
      this.data = data;
   }
}

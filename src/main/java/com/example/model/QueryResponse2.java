package com.example.model;

import java.util.HashMap;
import java.util.List;

public class QueryResponse2 {

   List<String> columns;

   List<HashMap<String, String>> data;

   public List<String> getColumns() {
      return columns;
   }

   public void setColumns(List<String> columns) {
      this.columns = columns;
   }

   public List<HashMap<String, String>> getData() {
      return data;
   }

   public void setData(List<HashMap<String, String>> data) {
      this.data = data;
   }
}

package com.example.repositary;

import com.example.model.CaliforniaHousing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaliforniaHousingRepositary extends JpaRepository<CaliforniaHousing, Integer> {

    @Query(value = "select * from houses limit 50", nativeQuery = true)
    List<CaliforniaHousing> findAllData();
}

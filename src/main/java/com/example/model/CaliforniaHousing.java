package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "houses")
public class CaliforniaHousing {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "median_house_value")
    private String medianHouseValue;

    @Column(name = "median_income")
    private String medianIncome;

    @Column(name = "median_age")
    private String medianAge;

    @Column(name = "tot_rooms")
    private String totRooms;

    @Column(name = "tot_bedrooms")
    private String totBedrooms;

    @Column(name = "population")
    private String population;

    @Column(name = "households")
    private String households;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "distance_to_coast")
    private String distanceToCoast;

    @Column(name = "distance_to_la")
    private String distanceToLA;

    @Column(name = "distance_to_sandiego")
    private String distanceToSandiago;

    @Column(name = "distance_to_sanjose")
    private String distanceToSanjose;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedianHouseValue() {
        return medianHouseValue;
    }

    public void setMedianHouseValue(String medianHouseValue) {
        this.medianHouseValue = medianHouseValue;
    }

    public String getMedianIncome() {
        return medianIncome;
    }

    public void setMedianIncome(String medianIncome) {
        this.medianIncome = medianIncome;
    }

    public String getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(String medianAge) {
        this.medianAge = medianAge;
    }

    public String getTotRooms() {
        return totRooms;
    }

    public void setTotRooms(String totRooms) {
        this.totRooms = totRooms;
    }

    public String getTotBedrooms() {
        return totBedrooms;
    }

    public void setTotBedrooms(String totBedrooms) {
        this.totBedrooms = totBedrooms;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getHouseholds() {
        return households;
    }

    public void setHouseholds(String households) {
        this.households = households;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDistanceToCoast() {
        return distanceToCoast;
    }

    public void setDistanceToCoast(String distanceToCoast) {
        this.distanceToCoast = distanceToCoast;
    }

    public String getDistanceToLA() {
        return distanceToLA;
    }

    public void setDistanceToLA(String distanceToLA) {
        this.distanceToLA = distanceToLA;
    }

    public String getDistanceToSandiago() {
        return distanceToSandiago;
    }

    public void setDistanceToSandiago(String distanceToSandiago) {
        this.distanceToSandiago = distanceToSandiago;
    }

    public String getDistanceToSanjose() {
        return distanceToSanjose;
    }

    public void setDistanceToSanjose(String distanceToSanjose) {
        this.distanceToSanjose = distanceToSanjose;
    }

}

package com.covid.datafetch.model;

import com.covid.datafetch.model.RegionData;

import java.util.Date;
import java.util.List;



public class CountryData{
    public int activeCases;
    public int activeCasesNew;
    public int recovered;
    public int recoveredNew;
    public int deaths;
    public int deathsNew;
    public int previousDayTests;
    public int totalCases;
    public String sourceUrl;
    public Date lastUpdatedAtApify;
    public String readMe;
    public RegionData[] regionData = new RegionData[28];

    public CountryData(int activeCases, int activeCasesNew, int recovered, int recoveredNew, int deaths, int deathsNew, int previousDayTests, int totalCases, String sourceUrl, Date lastUpdatedAtApify, String readMe, RegionData[] regionData) {
        this.activeCases = activeCases;
        this.activeCasesNew = activeCasesNew;
        this.recovered = recovered;
        this.recoveredNew = recoveredNew;
        this.deaths = deaths;
        this.deathsNew = deathsNew;
        this.previousDayTests = previousDayTests;
        this.totalCases = totalCases;
        this.sourceUrl = sourceUrl;
        this.lastUpdatedAtApify = lastUpdatedAtApify;
        this.readMe = readMe;
        this.regionData = regionData;
    }

    public int getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(int activeCases) {
        this.activeCases = activeCases;
    }

    public int getActiveCasesNew() {
        return activeCasesNew;
    }

    public void setActiveCasesNew(int activeCasesNew) {
        this.activeCasesNew = activeCasesNew;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getRecoveredNew() {
        return recoveredNew;
    }

    public void setRecoveredNew(int recoveredNew) {
        this.recoveredNew = recoveredNew;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getDeathsNew() {
        return deathsNew;
    }

    public void setDeathsNew(int deathsNew) {
        this.deathsNew = deathsNew;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public RegionData[] getRegionData() {
        return regionData;
    }

    public void setRegionData(RegionData[] regionData) {
        this.regionData = regionData;
    }
}

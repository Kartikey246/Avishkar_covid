package com.covid.datafetch.model;

public class RegionData{
    public String region;
    public int totalCases;
    public int newCases;
    public int recovered;
    public int newRecovered;
    public int deceased;
    public int newDeceased;

    public RegionData(String region, int totalInfected, int newInfected, int recovered, int newRecovered, int deceased, int newDeceased) {
        this.region = region;
        this.totalCases = totalInfected;
        this.newCases = newInfected;
        this.recovered = recovered;
        this.newRecovered = newRecovered;
        this.deceased = deceased;
        this.newDeceased = newDeceased;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public int getNewCases() {
        return newCases;
    }

    public void setNewCases(int newCases) {
        this.newCases = newCases;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(int newRecovered) {
        this.newRecovered = newRecovered;
    }

    public int getDeceased() {
        return deceased;
    }

    public void setDeceased(int deceased) {
        this.deceased = deceased;
    }

    public int getNewDeceased() {
        return newDeceased;
    }

    public void setNewDeceased(int newDeceased) {
        this.newDeceased = newDeceased;
    }

    @Override
    public String toString() {
        return "RegionData{" +
                "region='" + region + '\'' +
                ", totalInfected=" + totalCases +
                ", recovered=" + recovered +
                ", deceased=" + deceased +
                '}';
    }
}

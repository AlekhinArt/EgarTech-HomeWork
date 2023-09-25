package ru.egar.homeProject.dock;

import java.time.LocalDate;

public class Passport {
//    private long id;
    private int number;
    private int series;
    private LocalDate issued;
    private String whoIssued;


//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public LocalDate getIssued() {
        return issued;
    }

    public void setIssued(LocalDate issued) {
        this.issued = issued;
    }

    public String getWhoIssued() {
        return whoIssued;
    }

    public void setWhoIssued(String whoIssued) {
        this.whoIssued = whoIssued;
    }

    public Passport( int number, int series, LocalDate issued, String whoIssued) {
//        this.id = id;
        this.number = number;
        this.series = series;
        this.issued = issued;
        this.whoIssued = whoIssued;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", series=" + series +
                ", issued=" + issued +
                ", whoIssued='" + whoIssued + '\'' +
                '}';
    }
}

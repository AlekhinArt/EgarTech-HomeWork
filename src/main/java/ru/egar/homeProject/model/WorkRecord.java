package ru.egar.homeProject.model;

import java.time.LocalDate;

public class WorkRecord {
    private LocalDate start;
    private int experience;

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
//        start.toEpochDay()
        this.experience = experience;
    }

    public WorkRecord(LocalDate start) {
        this.start = start;
    }


    // private int


}

package ru.egar.homeProject.model;

public enum Position {
    DIRECTOR(WorkSchedule.EVERYDAY),
    ACCOUNTANT(WorkSchedule.FIVE_BY_TWO),
    DRIVER(WorkSchedule.TWO_BY_TWO),
    SELLER(WorkSchedule.TWO_BY_TWO);

    WorkSchedule workSchedule;


    Position(WorkSchedule workSchedule) {
        this.workSchedule = workSchedule;
    }

    public WorkSchedule getWorkSchedule() {
        return workSchedule;
    }
}

package ru.egar.homeProject.model;

import ru.egar.homeProject.dock.Passport;
import ru.egar.homeProject.dock.WorkInstruction;

import java.time.LocalDate;

public class Person {
    //    private long id;
    private String firstName;
    private String secondName;
    private Position position;
    private LocalDate birthDate;
    private Passport passport;
    private WorkInstruction workInstruction;
    private WorkRecord workRecord;


    public Person(String firstName, String secondName, Position position, LocalDate birthDate, Passport passport,
                  WorkInstruction workInstruction) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
        this.birthDate = birthDate;
        this.passport = passport;
        this.workInstruction = workInstruction;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public WorkInstruction getWorkInstruction() {
        return workInstruction;
    }

    public void setWorkInstruction(WorkInstruction workInstruction) {
        this.workInstruction = workInstruction;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", position=" + position +
                ", birthDate=" + birthDate +
                ", passport=" + passport +
                ", workInstruction=" + workInstruction +
                '}';
    }
}

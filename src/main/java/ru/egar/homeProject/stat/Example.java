package ru.egar.homeProject.stat;

import ru.egar.homeProject.model.Position;
import ru.egar.homeProject.model.WorkRecord;
import ru.egar.homeProject.model.WorkSchedule;

import java.time.LocalDate;

public class Example {


    public int workInYear(WorkRecord workRecord, Position position) {
        LocalDate start = workRecord.getStart();
        int workHours = 0;
        switch (position.getWorkSchedule()) {
            case EVERYDAY -> workHours = start.getDayOfYear();
            case TWO_BY_TWO -> workHours = start.getDayOfYear() / 2;
//            case FIVE_BY_TWO ->  ;
//            case TWO_BY_TREE ->  ,
            case TREE_BY_TREE -> workHours = start.getDayOfYear();
        }
        return workHours;

    }
}

package ru.egar;

import ru.egar.homeProject.dock.Passport;
import ru.egar.homeProject.dock.WorkInstruction;
import ru.egar.homeProject.model.Person;
import ru.egar.homeProject.model.Position;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        WorkInstruction wI = new WorkInstruction(Position.SELLER, "I sell everything");
        Passport p = new Passport(123, 321, LocalDate.parse("2014-09-12"), "Gen neg");
        Person person = new Person("Ivan", "Ivanov", Position.SELLER,
                LocalDate.parse("1990-01-01"), p, wI);
        System.out.println(person);

    }
}
package ru.egar.homeProject.dock;

import ru.egar.homeProject.model.Position;

public class WorkInstruction {
    //    private int id;
    private Position position;
    private String description;

    public WorkInstruction(Position position, String description) {

        this.position = position;
        this.description = description;
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "WorkInstruction{" +
                "position=" + position +
                ", description='" + description + '\'' +
                '}';
    }
}

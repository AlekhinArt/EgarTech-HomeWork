package ru.egar;


import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        String name = "Vas";
        int age = 23;
        Resume r = null;
        r = Resume.of(name, age);

    }

    static class Resume {
        private Resume(String name, int age) {
            this.name = name;
            this.age = age;
        }

        static Resume of(String name, int age) {
            return new Resume(name, age);

        }

        private String name;
        private int age;
    }
}
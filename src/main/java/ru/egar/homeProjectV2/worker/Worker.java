package ru.egar.homeProjectV2.worker;

import javax.swing.text.Document;
import java.time.LocalDate;
import java.util.List;

public class Worker {
    private int id;
    private Boolean workNow;
    private String name;
    private String firstName;
    private String surname;
    private String patronymic;
    private LocalDate birthday;
    private String phoneNumber;
    private List <Document> documents;
    private List  <WorkHistory> workHistory;


}

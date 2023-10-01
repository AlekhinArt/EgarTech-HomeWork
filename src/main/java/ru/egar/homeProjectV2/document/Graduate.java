package ru.egar.homeProjectV2.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
@AllArgsConstructor
@Builder
public class Graduate extends PaperDocument {
    private int id;
    private String institution;
    private String grade;
    private String specialization;
    private LocalDate startDate;
    private LocalDate lastDate;


}

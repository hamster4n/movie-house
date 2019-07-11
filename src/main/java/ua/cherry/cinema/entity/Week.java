package ua.cherry.cinema.entity;

import java.time.LocalDate;
import java.util.List;

public class Week {
    private Long id;
    private LocalDate firstDay;
    private List<Day> dayList;
}

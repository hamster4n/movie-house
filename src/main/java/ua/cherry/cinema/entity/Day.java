package ua.cherry.cinema.entity;

import java.time.LocalDate;
import java.util.List;

public class Day {
    private Long id;
    private LocalDate date;
    private List<Session> sessionList;
}

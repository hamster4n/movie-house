package ua.cherry.cinema.entity;

import java.time.LocalTime;

public class Session {
    private Long id;
    private LocalTime startTime;
    private Cinema cinema;
    private int freeSeats;
    private int redeemedSeats;
    private int bookedSeats;
}

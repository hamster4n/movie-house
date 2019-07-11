package ua.cherry.cinema.entity;

public class Seat {
    private Long id;
    private int row;
    private int number;
    private Enum<Available> available;
    private int locationCostFactor;
    private int costPerSession;
    private int generalCost;
}

package ua.cherry.cinema.entity;

import java.util.List;

public class Cinema {
    private Long id;
    private String name;
    private List<Genre> genreList;
    private String producer; //отдельная таблица?
    private String actors; //отдельная таблица?
    private int duration;
    private String description;
    private String trailer;
    private String poster;
    private Enum<Relevance> relevance;

}

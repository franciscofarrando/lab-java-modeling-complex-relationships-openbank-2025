package com.example.complexrelationships.EventManager.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "events")
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;
    private String duration;
    private String location;
    private String title;
    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER)
    private List<Guests> guests = new ArrayList<>();

    public Events() {
    }

    public Events(String date, String duration, String location, String title, List<Guests> guests) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guests = guests;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Guests> getGuests() {
        return guests;
    }

    public void setGuests(List<Guests> guests) {
        this.guests = guests;
    }

    @Override
    public String toString() {
        return "Events{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", duration='" + duration + '\'' +
                ", location='" + location + '\'' +
                ", title='" + title + '\'' +
                ", guests=" + guests +
                '}';
    }
}

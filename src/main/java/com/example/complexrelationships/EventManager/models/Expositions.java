package com.example.complexrelationships.EventManager.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;
@Entity
@Table(name = "expositions")
public class Expositions extends Events {
    public Expositions() {
    }

    public Expositions(String date, String duration, String location, String title, List<Guests> guests) {
        super(date, duration, location, title, guests);
    }
}

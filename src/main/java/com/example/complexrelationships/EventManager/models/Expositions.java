package com.example.complexrelationships.EventManager.models;

import java.util.List;

public class Expositions extends Events {
    public Expositions() {
    }

    public Expositions(String date, String duration, String location, String title, List<Guest> guests) {
        super(date, duration, location, title, guests);
    }
}

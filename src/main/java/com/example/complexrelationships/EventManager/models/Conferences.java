package com.example.complexrelationships.EventManager.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.List;
@Entity
@Table(name = "conferences")
public class Conferences extends Events {
    @OneToOne
    private Guests speaker;
    private int presentationDuration;

    public Conferences() {
    }

    public Conferences(String date, String duration, String location, String title, List<Guests> guests, Guests speaker, int presentationDuration) {
        super(date, duration, location, title, guests);
        this.speaker = speaker;
        this.presentationDuration = presentationDuration;
    }

    public Guests getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Guests speaker) {
        this.speaker = speaker;
    }

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    @Override
    public String toString() {
        return "Conferences{" +
                "speaker=" + speaker +
                ", presentationDuration=" + presentationDuration +
                '}';
    }
}

package com.example.complexrelationships.EventManager.models;

import java.util.List;

public class Conferences extends Events {
    private Guest speaker;
    private int presentationDuration;

    public Conferences() {
    }

    public Conferences(String date, String duration, String location, String title, List<Guest> guests, Guest speaker, int presentationDuration) {
        super(date, duration, location, title, guests);
        this.speaker = speaker;
        this.presentationDuration = presentationDuration;
    }

    public Guest getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Guest speaker) {
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

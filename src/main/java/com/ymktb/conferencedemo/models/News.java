package com.ymktb.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity(name = "news")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class News extends Event{

    private String haberlinki;

    public News(){

    }

    public String getHaberlinki() {
        return haberlinki;
    }

    public void setHaberlinki(String haberlinki) {
        this.haberlinki = haberlinki;
    }
}

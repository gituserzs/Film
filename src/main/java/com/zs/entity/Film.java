package com.zs.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Film {
    int filmId;
    String title;
    String description;
    String name;
    int languageId;

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public Film(){
    }
    public Film(int filmId, String title, String description, String name) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.name = name;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

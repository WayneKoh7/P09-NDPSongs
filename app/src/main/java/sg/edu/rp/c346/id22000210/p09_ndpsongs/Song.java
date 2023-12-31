package sg.edu.rp.c346.id22000210.p09_ndpsongs;

import androidx.annotation.NonNull;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Song implements Serializable {
    private int id;
    private String title;
    private String singers;
    private int year;
    private int stars;

    public Song (int id, String title, String singers, int year, int stars) {
        this.id = id;
        this.title = title;
        this.singers = singers;
        this.year = year;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) { this.title = title; }

    public String getSingers() {
        return singers;
    }

    public void setSingers(String singers) { this.singers = singers; }

    public int getYear() {
        return year;
    }

    public void setYear(int year) { this.year = year; }

    public int getStars() {
        return stars;
    }

    public String toString() {
        return id + "\n" + title + "\n" + singers + "\n" + year + "\n" + stars;
    }

    public String starsShow() {
        StringBuilder starBuilder = new StringBuilder();
        for (int i = 0; i < stars; i++) {
            starBuilder.append("* ");
        }
        return starBuilder.toString().trim();
    }
}

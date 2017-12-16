package com.example.alex_pc.test_project;

/**
 * Created by Alex-PC on 15.12.2017.
 */

public class Note {

    private int id;
    private String caption;
    private String text;
    private int important;
    private String image;
    private double latitude;
    private double longitude;

    public Note(int id, String caption, String text, int important, String image, double latitude, double longitude) {
        this.id = id;
        this.caption = caption;
        this.text = text;
        this.important = important;
        this.image = image;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImportant() {
        return important;
    }

    public void setImportant(int important) {
        this.important = important;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", caption='" + caption + '\'' +
                ", text='" + text + '\'' +
                ", important=" + important +
                ", image='" + image + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

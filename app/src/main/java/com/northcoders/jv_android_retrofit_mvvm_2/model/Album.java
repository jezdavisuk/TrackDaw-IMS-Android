package com.northcoders.jv_android_retrofit_mvvm_2.model;

public class Album {

    Long id;
    String recordName;
    String artist;
    int yearOfRelease;
    Genre genre;
    int quantityInStock;
    boolean available;

    public Album() {
    }

    public Album(Long id, String recordName, String artist, int yearOfRelease, Genre genre, int quantityInStock, boolean available) {
        this.id = id;
        this.recordName = recordName;
        this.artist = artist;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.quantityInStock = quantityInStock;
        this.available = available;
    }
}

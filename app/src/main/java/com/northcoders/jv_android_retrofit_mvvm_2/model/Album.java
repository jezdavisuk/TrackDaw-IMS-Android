package com.northcoders.jv_android_retrofit_mvvm_2.model;

import com.google.gson.annotations.SerializedName;

public class Album {

    @SerializedName("id")
    Long id;

    @SerializedName("recordName")
    String recordName;

    @SerializedName("artist")
    String artist;

    @SerializedName("yearOfRelease")
    int yearOfRelease;

    @SerializedName("genre")
    Genre genre;

    @SerializedName("quantityInStock")
    int quantityInStock;

    @SerializedName("available")
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

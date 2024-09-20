package com.northcoders.jv_android_retrofit_mvvm_2.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.annotations.SerializedName;
import com.northcoders.jv_android_retrofit_mvvm_2.BR;

public class Album extends BaseObservable {

    @SerializedName("id")
    Long id;

    @SerializedName("recordName")
    String recordName;

    @SerializedName("artist")
    String artist;

    @SerializedName("yearOfRelease")
    String yearOfRelease;

    @SerializedName("genre")
    String genre;

    @SerializedName("quantityInStock")
    String quantityInStock;

    @SerializedName("available")
    boolean available;

    public Album() {
    }

    public Album(Long id, String recordName, String artist, String yearOfRelease, String genre, String quantityInStock, boolean available) {
        this.id = id;
        this.recordName = recordName;
        this.artist = artist;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.quantityInStock = quantityInStock;
        this.available = available;
    }

    @Bindable
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
        notifyPropertyChanged(BR.recordName);
    }

    @Bindable
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        notifyPropertyChanged(BR.artist);
    }

    @Bindable
    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
        notifyPropertyChanged(BR.yearOfRelease);
    }

    @Bindable
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(BR.genre);
    }

    @Bindable
    public String getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(String quantityInStock) {
        this.quantityInStock = quantityInStock;
        notifyPropertyChanged(BR.quantityInStock);
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

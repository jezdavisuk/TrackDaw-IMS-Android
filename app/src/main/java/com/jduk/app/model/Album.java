package com.jduk.app.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.annotations.SerializedName;
import com.jduk.app.BR;

public class Album extends BaseObservable implements Parcelable {

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
    String available;

    public Album() {
    }

    public Album(Long id, String recordName, String artist, String yearOfRelease, String genre, String quantityInStock, String available) {
        this.id = id;
        this.recordName = recordName;
        this.artist = artist;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.quantityInStock = quantityInStock;
        this.available = available;
    }

    protected Album(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readLong();
        }
        recordName = in.readString();
        artist = in.readString();
        yearOfRelease = in.readString();
        genre = in.readString();
        quantityInStock = in.readString();
        available = in.readString();
    }

    public static final Creator<Album> CREATOR = new Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel in) {
            return new Album(in);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };

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

    public String isAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        if (id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(id);
        }
        dest.writeString(recordName);
        dest.writeString(artist);
        dest.writeString(yearOfRelease);
        dest.writeString(genre);
        dest.writeString(quantityInStock);
        dest.writeString(available);
    }
}

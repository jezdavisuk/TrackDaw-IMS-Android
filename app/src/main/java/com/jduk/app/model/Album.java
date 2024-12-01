package com.jduk.app.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.annotations.SerializedName;
import com.jduk.app.BR;

public class Album extends BaseObservable implements Parcelable {

    @SerializedName("ID")
    Long id;

    @SerializedName("NAME")
    String albumName;

    @SerializedName("GENRE")
    String genre;

    @SerializedName("RELEASE_DATE")
    String releaseDate;

    @SerializedName("IS_AGE_RESTRICTED")
    String ageRestricted;

    public Album() {
    }

    public Album(Long id, String albumName, String genre, String releaseDate, String ageRestricted) {
        this.id = id;
        this.albumName = albumName;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.ageRestricted = ageRestricted;
    }

    protected Album(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readLong();
        }
        albumName = in.readString();
        genre = in.readString();
        releaseDate = in.readString();
        ageRestricted = in.readString();
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
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
        notifyPropertyChanged(BR.albumName);
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
    public String getReleaseDate() { return releaseDate; }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        notifyPropertyChanged(BR.releaseDate);
    }

    @Bindable
    public String getAgeRestricted() { return ageRestricted; }

    public void setAgeRestricted(String ageRestricted) {
        this.ageRestricted = ageRestricted;
        notifyPropertyChanged(BR.ageRestricted);
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
        dest.writeString(albumName);
        dest.writeString(genre);
        dest.writeString(releaseDate);
        dest.writeString(ageRestricted);
    }
}

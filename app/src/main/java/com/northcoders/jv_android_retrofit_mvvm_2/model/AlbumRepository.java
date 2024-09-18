package com.northcoders.jv_android_retrofit_mvvm_2.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class AlbumRepository {

    private MutableLiveData<List<Album>> mutableLiveData = new MutableLiveData<>();
    private Application application = new Application();

    public AlbumRepository(Application application) {
        this.application = application;
    }
}

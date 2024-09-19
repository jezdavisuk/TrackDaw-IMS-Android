package com.northcoders.jv_android_retrofit_mvvm_2.service;

import com.northcoders.jv_android_retrofit_mvvm_2.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface AlbumApiService {

    @GET("album")
    Call<List<Album>> getAllAlbums();

    @GET("album")
    Call<Album> addAlbum(@Body Album album);
}

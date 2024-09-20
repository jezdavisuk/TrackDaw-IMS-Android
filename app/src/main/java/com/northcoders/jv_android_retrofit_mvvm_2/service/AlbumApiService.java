package com.northcoders.jv_android_retrofit_mvvm_2.service;

import com.northcoders.jv_android_retrofit_mvvm_2.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AlbumApiService {

    @GET("all-albums")
    Call<List<Album>> getAllAlbums();

    @GET("all-albums")
    Call<Album> addAlbum(@Body Album album);

    @PUT("{id}")
    Call<Album> updateAlbum(@Path("id") long id, @Body Album album);

    @DELETE
    Call<String> deleteAlbum(@Path("id") long id);
}

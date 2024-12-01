package com.jduk.app.service;

import com.jduk.app.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AlbumApiService {

    @GET("api/v1/records/all-albums")
    Call<List<Album>> getAllAlbums();

    @GET("api/v1/records/{id}")
    Call<Album> getAlbumById(@Path("id") long id);

    @POST("api/v1/records")
    Call<Album> addAlbum(@Body Album album);

    @PATCH("api/v1/records/{id}")
    Call<Album> updateAlbum(@Path("id") long id, @Body Album album);

    @DELETE("api/v1/records/{id}")
    Call<String> deleteAlbum(@Path("id") long id);
}

package com.jduk.app.repository;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.jduk.app.model.Album;
import com.jduk.app.service.AlbumApiService;
import com.jduk.app.service.RetrofitInstance;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlbumRepository {

    private MutableLiveData<List<Album>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public AlbumRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Album>> getMutableLiveData() {
        AlbumApiService albumApiService = RetrofitInstance.getService();
        Call<List<Album>> call = albumApiService.getAllAlbums();

        call.enqueue(new Callback<List<Album>>() {
            @Override
            public void onResponse(@NonNull Call<List<Album>> call, @NonNull Response<List<Album>> response) {
                List<Album> albums = response.body();
                mutableLiveData.setValue(albums);
            }

            @Override
            public void onFailure(@NonNull Call<List<Album>> call, @NonNull Throwable t) {
                Log.e("HTTP Failure", Objects.requireNonNull(t.getMessage()));
            }
        });
        return mutableLiveData;
    }

    public void addNewAlbum(Album album) {
        AlbumApiService albumApiService = RetrofitInstance.getService();
        Call<Album> call = albumApiService.addAlbum(album);

        call.enqueue(new Callback<Album>() {
            @Override
            public void onResponse(@NonNull Call<Album> call, @NonNull Response<Album> response) {
                Toast.makeText(application.getApplicationContext(),
                        "Album added to database.",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<Album> call, @NonNull Throwable t) {
                Toast.makeText(application.getApplicationContext(),
                        "Unable to add album to database.",
                        Toast.LENGTH_SHORT).show();
                Log.e("POST REQUEST", Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void updateAlbum(long id, Album album) {
        AlbumApiService albumApiService = RetrofitInstance.getService();
        Call<Album> call = albumApiService.updateAlbum(id, album);

        call.enqueue(new Callback<Album>() {
            @Override
            public void onResponse(@NonNull Call<Album> call, @NonNull Response<Album> response) {
                Toast.makeText(application.getApplicationContext(),
                        "Album updated.",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<Album> call, @NonNull Throwable t) {
                Toast.makeText(application.getApplicationContext(),
                        "Unable to update album.",
                        Toast.LENGTH_SHORT).show();

                Log.e("PUT REQUEST", Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void deleteAlbum(long id) {
        AlbumApiService albumApiService = RetrofitInstance.getService();
        Call<String> call = albumApiService.deleteAlbum(id);

        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(@NonNull Call<String> call, @NonNull Response<String> response) {
                Toast.makeText(application.getApplicationContext(),
                        response.body(),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<String> call, @NonNull Throwable t) {
               Log.e("DELETE REQUEST", Objects.requireNonNull(t.getMessage()));
            }
        });
    }
}

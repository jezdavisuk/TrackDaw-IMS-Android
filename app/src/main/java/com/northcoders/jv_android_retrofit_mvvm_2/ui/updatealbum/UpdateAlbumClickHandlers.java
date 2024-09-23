package com.northcoders.jv_android_retrofit_mvvm_2.ui.updatealbum;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.northcoders.jv_android_retrofit_mvvm_2.model.Album;
import com.northcoders.jv_android_retrofit_mvvm_2.ui.mainactivity.MainActivity;
import com.northcoders.jv_android_retrofit_mvvm_2.ui.mainactivity.MainActivityViewModel;

import java.util.Objects;

public class UpdateAlbumClickHandlers {

    private Album album;
    private Context context;
    private MainActivityViewModel viewModel;
    private Long albumId;

    public UpdateAlbumClickHandlers(Album album, Context context, MainActivityViewModel viewModel) {
        this.album = album;
        this.context = context;
        this.viewModel = viewModel;
    }

    public void onBackButtonClicked(View view) {

        Intent intent = new Intent(context, MainActivity.class);

        context.startActivity(intent);
    }

    public void onSubmitButtonClicked(View view) {

        Album updatedAlbum = new Album(
                album.getId(),
                album.getRecordName(),
                album.getArtist(),
                album.getYearOfRelease(),
                album.getGenre(),
                album.getQuantityInStock(),
                album.isAvailable()
        );

        if (Objects.equals(updatedAlbum.getRecordName(), "") ||
                Objects.equals(updatedAlbum.getArtist(), "") ||
                Objects.equals(updatedAlbum.getYearOfRelease(), "") ||
                Objects.equals(updatedAlbum.getGenre(), "") ||
                Objects.equals(updatedAlbum.getQuantityInStock(), "")) {

            Toast.makeText(context, "Fields cannot be empty.", Toast.LENGTH_SHORT).show();

        } else {

            Intent intent = new Intent(context, MainActivity.class);

            albumId = album.getId();

            viewModel.updateAlbum(albumId, updatedAlbum);

            context.startActivity(intent);
        }
    }
}

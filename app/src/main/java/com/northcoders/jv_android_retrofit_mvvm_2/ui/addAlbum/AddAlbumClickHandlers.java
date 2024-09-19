package com.northcoders.jv_android_retrofit_mvvm_2.ui.addAlbum;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.northcoders.jv_android_retrofit_mvvm_2.model.Album;
import com.northcoders.jv_android_retrofit_mvvm_2.ui.mainactivity.MainActivity;
import com.northcoders.jv_android_retrofit_mvvm_2.ui.mainactivity.MainActivityViewModel;

public class AddAlbumClickHandlers {

    private Album album;
    private Context context;
    private MainActivityViewModel viewModel;

    public AddAlbumClickHandlers(Album album, Context context, MainActivityViewModel viewModel) {
        this.album = album;
        this.context = context;
        this.viewModel = viewModel;
    }

    public void onSubmitButtonClicked(View view) {

        if (album.getRecordName() == null || album.getArtist() == null || album.getYearOfRelease() == 0 || album.getGenre() == null || album.getQuantityInStock() == 0) {

            Toast.makeText(context, "Fields cannot be empty", Toast.LENGTH_SHORT).show();

        } else {

            Intent intent = new Intent(context, MainActivity.class);

            Album newAlbum = new Album(
                    album.getId(),
                    album.getRecordName(),
                    album.getArtist(),
                    album.getYearOfRelease(),
                    album.getGenre(),
                    album.getQuantityInStock(),
                    album.isAvailable()
            );


            viewModel.addNewAlbum(newAlbum);

            context.startActivity(intent);
        }

    }

}

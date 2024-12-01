package com.jduk.app.ui.addalbum;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.jduk.app.model.Album;
import com.jduk.app.ui.main.MainActivity;
import com.jduk.app.ui.main.MainActivityViewModel;

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

        if (album.getAlbumName() == null || album.getArtist() == null || album.getYearOfRelease() == null || album.getGenre() == null || album.getQuantityInStock() == null) {

            Toast.makeText(context, "Fields cannot be empty", Toast.LENGTH_SHORT).show();

        } else {

            Intent intent = new Intent(view.getContext(), MainActivity.class);

            Album newAlbum = new Album(
                    album.getId(),
                    album.getAlbumName(),
                    album.getArtist(),
                    album.getYearOfRelease(),
                    album.getGenre(),
                    album.getQuantityInStock(),
                    "true"
            );

            viewModel.addNewAlbum(newAlbum);

            context.startActivity(intent);
        }
    }

    public void onBackButtonClicked(View view) {

        Intent intent = new Intent(view.getContext(), MainActivity.class);

        context.startActivity(intent);
    }

}

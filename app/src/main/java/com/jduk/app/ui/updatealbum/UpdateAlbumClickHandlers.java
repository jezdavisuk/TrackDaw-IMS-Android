package com.jduk.app.ui.updatealbum;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.jduk.app.model.Album;
import com.jduk.app.ui.main.MainActivity;
import com.jduk.app.ui.main.MainActivityViewModel;

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
                album.getAlbumName(),
                album.getArtist(),
                album.getYearOfRelease(),
                album.getGenre(),
                album.getQuantityInStock(),
                album.isAvailable()
        );

        if (Objects.equals(updatedAlbum.getAlbumName(), "") ||
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

    public void onDeleteButtonClicked(View view) {

        new AlertDialog.Builder(context)
                .setTitle("Delete album")
                .setMessage("Are you sure you want to delete this album?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(context, MainActivity.class);
                        viewModel.deleteAlbum(album.getId());
                        context.startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}

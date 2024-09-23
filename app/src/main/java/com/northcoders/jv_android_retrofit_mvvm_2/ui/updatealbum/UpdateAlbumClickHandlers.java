package com.northcoders.jv_android_retrofit_mvvm_2.ui.updatealbum;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.northcoders.jv_android_retrofit_mvvm_2.model.Album;
import com.northcoders.jv_android_retrofit_mvvm_2.ui.mainactivity.MainActivity;
import com.northcoders.jv_android_retrofit_mvvm_2.ui.mainactivity.MainActivityViewModel;

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
}

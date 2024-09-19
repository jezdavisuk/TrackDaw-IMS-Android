package com.northcoders.jv_android_retrofit_mvvm_2.ui.addAlbum;

import android.content.Context;

import com.northcoders.jv_android_retrofit_mvvm_2.model.Album;
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
}

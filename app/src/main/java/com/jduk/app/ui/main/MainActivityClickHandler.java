package com.jduk.app.ui.main;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.jduk.app.ui.addalbum.AddNewAlbumActivity;

public class MainActivityClickHandler {

    Context context;

    public MainActivityClickHandler(Context context) {
        this.context = context;
    }

    public void onAddAlbumClicked(View view) {
        Intent intent = new Intent(view.getContext(), AddNewAlbumActivity.class);
        context.startActivity(intent);
    }
}

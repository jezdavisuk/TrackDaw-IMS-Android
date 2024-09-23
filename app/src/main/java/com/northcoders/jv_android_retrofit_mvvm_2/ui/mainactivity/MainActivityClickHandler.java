package com.northcoders.jv_android_retrofit_mvvm_2.ui.mainactivity;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.northcoders.jv_android_retrofit_mvvm_2.ui.addalbum.AddNewAlbumActivity;

public class MainActivityClickHandler {

    Context context;

    public MainActivityClickHandler(Context context) {
        this.context = context;
    }

    public void onFABClicked(View view) {

        Intent intent = new Intent(view.getContext(), AddNewAlbumActivity.class);

        context.startActivity(intent);
    }
}

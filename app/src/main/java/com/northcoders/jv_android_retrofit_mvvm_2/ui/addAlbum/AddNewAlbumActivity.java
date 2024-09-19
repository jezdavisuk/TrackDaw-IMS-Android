package com.northcoders.jv_android_retrofit_mvvm_2.ui.addAlbum;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.northcoders.jv_android_retrofit_mvvm_2.R;
import com.northcoders.jv_android_retrofit_mvvm_2.databinding.ActivityAddNewAlbumBinding;
import com.northcoders.jv_android_retrofit_mvvm_2.model.Album;

public class AddNewAlbumActivity extends AppCompatActivity {

    private ActivityAddNewAlbumBinding binding;
    private AddAlbumClickHandlers handler;
    private Album album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_new_album);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
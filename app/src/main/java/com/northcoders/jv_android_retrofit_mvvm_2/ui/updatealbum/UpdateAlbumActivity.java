package com.northcoders.jv_android_retrofit_mvvm_2.ui.updatealbum;

import android.os.Build;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.northcoders.jv_android_retrofit_mvvm_2.R;
import com.northcoders.jv_android_retrofit_mvvm_2.databinding.ActivityUpdateAlbumBinding;
import com.northcoders.jv_android_retrofit_mvvm_2.model.Album;

public class UpdateAlbumActivity extends AppCompatActivity {

    private ActivityUpdateAlbumBinding binding;
    private UpdateAlbumClickHandlers handler;
    private Album album;

    private static final String ALBUM_KEY = "album";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_update_album);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {

            album = getIntent().getParcelableExtra(ALBUM_KEY, Album.class);
            binding.setAlbum(album);

            binding = DataBindingUtil.setContentView(
                    this,
                    R.layout.activity_update_album
            );
        }
    }
}
package com.jduk.app.ui.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.jduk.app.R;
import com.jduk.app.adapter.AlbumAdapter;
import com.jduk.app.databinding.ActivityMainBinding;
import com.jduk.app.model.Album;
import com.jduk.app.ui.updatealbum.UpdateAlbumActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface {

    private RecyclerView recyclerView;
    private ArrayList<Album> albums;
    private AlbumAdapter albumAdapter;
    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;
    private MainActivityClickHandler clickHandler;

    private static final String ALBUM_KEY = "album";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_container);

        NavController navController = navHostFragment.getNavController();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);

//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//
//        binding = DataBindingUtil.setContentView(
//                this,
//                R.layout.activity_main
//        );
//
//        viewModel = new ViewModelProvider(this)
//                .get(MainActivityViewModel.class);
//
//        clickHandler = new MainActivityClickHandler(this);
//        binding.setClickHandler(clickHandler);
//
//        getAllAlbums();
//
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }

//    private void getAllAlbums() {
//
//        viewModel.getAllAlbums().observe(this, new Observer<List<Album>>() {
//
//            @Override
//            public void onChanged(List<Album> albumsFromLiveData) {
//                // albums refers to the variable name of your List of Album objects
//                // albumsFromLiveData is cast to this type
//                albums = (ArrayList<Album>) albumsFromLiveData;
//
//                // This method will be created next
//                displayAlbumsInRecyclerView();
//            }
//
//        });
//
//    }

//    private void displayAlbumsInRecyclerView() {
//
//        recyclerView = binding.recyclerview;
//        albumAdapter = new AlbumAdapter(this, albums, this);
//        recyclerView.setAdapter(albumAdapter);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setHasFixedSize(true);
//
//        albumAdapter.notifyDataSetChanged();
//    }
//
//    @Override
//    public void onItemClick(int position) {
//
//        Intent intent = new Intent(MainActivity.this, UpdateAlbumActivity.class);
//
//        intent.putExtra(ALBUM_KEY, albums.get(position));
//
//        startActivity(intent);
//    }
}
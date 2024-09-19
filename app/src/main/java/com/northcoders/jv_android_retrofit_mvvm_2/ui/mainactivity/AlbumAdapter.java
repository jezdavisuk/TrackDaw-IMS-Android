package com.northcoders.jv_android_retrofit_mvvm_2.ui.mainactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.northcoders.jv_android_retrofit_mvvm_2.R;
import com.northcoders.jv_android_retrofit_mvvm_2.databinding.AlbumItemBinding;
import com.northcoders.jv_android_retrofit_mvvm_2.model.Album;

import java.util.ArrayList;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {

    private Context context;
    private ArrayList<Album> albums;

    public AlbumAdapter(Context context, ArrayList<Album> albums) {
        this.context = context;
        this.albums = albums;
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        AlbumItemBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(viewGroup.getContext()),
                        R.layout.album_item,
                        viewGroup,
                        false);

        return new AlbumViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder viewHolder, int position) {

        Album album = albums.get(position);
        viewHolder.albumItemBinding.setAlbum(album);

    }

    @Override
    public int getItemCount() { return albums.size(); }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder {

        private AlbumItemBinding albumItemBinding;

        public AlbumViewHolder(AlbumItemBinding albumItemBinding) {
            super(albumItemBinding.getRoot());
            this.albumItemBinding = albumItemBinding;
        }

    }
}

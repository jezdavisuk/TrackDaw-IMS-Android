package com.northcoders.jv_android_retrofit_mvvm_2.ui.mainactivity;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

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


    public static class AlbumViewHolder extends RecyclerView.ViewHolder {

        private AlbumItemBinding albumItemBinding;

        public AlbumViewHolder(AlbumItemBinding albumItemBinding) {
            super(albumItemBinding.getRoot());
            this.albumItemBinding = albumItemBinding;
        }

    }
}
